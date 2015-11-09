/**
 */
package org.hemologica.datatypes.util;

import jdk.java.io.Serializable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hemologica.datatypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hemologica.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DatatypesPackage.DATA_EVENT: {
				DataEvent dataEvent = (DataEvent)theEObject;
				T result = caseDataEvent(dataEvent);
				if (result == null) result = caseSerializable(dataEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_CODE: {
				DataCode dataCode = (DataCode)theEObject;
				T result = caseDataCode(dataCode);
				if (result == null) result = caseSerializable(dataCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_BANK: {
				DataBank dataBank = (DataBank)theEObject;
				T result = caseDataBank(dataBank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_INSTITUTION: {
				DataInstitution dataInstitution = (DataInstitution)theEObject;
				T result = caseDataInstitution(dataInstitution);
				if (result == null) result = caseSerializable(dataInstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_BANK_EQUALS: {
				DataBank_equals dataBank_equals = (DataBank_equals)theEObject;
				T result = caseDataBank_equals(dataBank_equals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_BLOOD_ABO_TYPE: {
				DataBloodABOType dataBloodABOType = (DataBloodABOType)theEObject;
				T result = caseDataBloodABOType(dataBloodABOType);
				if (result == null) result = caseSerializable(dataBloodABOType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_BLOOD_TYPE: {
				DataBloodType dataBloodType = (DataBloodType)theEObject;
				T result = caseDataBloodType(dataBloodType);
				if (result == null) result = caseSerializable(dataBloodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_CAMPAIGN: {
				DataCampaign dataCampaign = (DataCampaign)theEObject;
				T result = caseDataCampaign(dataCampaign);
				if (result == null) result = caseSerializable(dataCampaign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_CITY: {
				DataCity dataCity = (DataCity)theEObject;
				T result = caseDataCity(dataCity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_CITY_EQUALS: {
				DataCity_equals dataCity_equals = (DataCity_equals)theEObject;
				T result = caseDataCity_equals(dataCity_equals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_COUNTRY: {
				DataCountry dataCountry = (DataCountry)theEObject;
				T result = caseDataCountry(dataCountry);
				if (result == null) result = caseSerializable(dataCountry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_DOCUMENT_TYPE: {
				DataDocumentType dataDocumentType = (DataDocumentType)theEObject;
				T result = caseDataDocumentType(dataDocumentType);
				if (result == null) result = caseSerializable(dataDocumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_DONATION: {
				DataDonation dataDonation = (DataDonation)theEObject;
				T result = caseDataDonation(dataDonation);
				if (result == null) result = caseSerializable(dataDonation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_PERSON: {
				DataPerson dataPerson = (DataPerson)theEObject;
				T result = caseDataPerson(dataPerson);
				if (result == null) result = caseSerializable(dataPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_STATE: {
				DataState dataState = (DataState)theEObject;
				T result = caseDataState(dataState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_STATE_EQUALS: {
				DataState_equals dataState_equals = (DataState_equals)theEObject;
				T result = caseDataState_equals(dataState_equals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_PERSON_GET_FULL_NAME: {
				DataPerson_getFullName dataPerson_getFullName = (DataPerson_getFullName)theEObject;
				T result = caseDataPerson_getFullName(dataPerson_getFullName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE: {
				DataDonationDonorType dataDonationDonorType = (DataDonationDonorType)theEObject;
				T result = caseDataDonationDonorType(dataDonationDonorType);
				if (result == null) result = caseSerializable(dataDonationDonorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_DONATION_FAIL: {
				DataDonationFail dataDonationFail = (DataDonationFail)theEObject;
				T result = caseDataDonationFail(dataDonationFail);
				if (result == null) result = caseSerializable(dataDonationFail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_DONATION_FAIL_CAUSE: {
				DataDonationFailCause dataDonationFailCause = (DataDonationFailCause)theEObject;
				T result = caseDataDonationFailCause(dataDonationFailCause);
				if (result == null) result = caseSerializable(dataDonationFailCause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_DONATION_FAIL_DATA_DONATION_FAIL: {
				DataDonationFail_DataDonationFail dataDonationFail_DataDonationFail = (DataDonationFail_DataDonationFail)theEObject;
				T result = caseDataDonationFail_DataDonationFail(dataDonationFail_DataDonationFail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_LABORATORY_RESULT: {
				DataLaboratoryResult dataLaboratoryResult = (DataLaboratoryResult)theEObject;
				T result = caseDataLaboratoryResult(dataLaboratoryResult);
				if (result == null) result = caseSerializable(dataLaboratoryResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON: {
				DataResponsiblePerson dataResponsiblePerson = (DataResponsiblePerson)theEObject;
				T result = caseDataResponsiblePerson(dataResponsiblePerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON_GET_FULL_NAME: {
				DataResponsiblePerson_getFullName dataResponsiblePerson_getFullName = (DataResponsiblePerson_getFullName)theEObject;
				T result = caseDataResponsiblePerson_getFullName(dataResponsiblePerson_getFullName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_DONATION_EVENT: {
				DataDonationEvent dataDonationEvent = (DataDonationEvent)theEObject;
				T result = caseDataDonationEvent(dataDonationEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_DONATION_DATA_DONATION: {
				DataDonation_DataDonation dataDonation_DataDonation = (DataDonation_DataDonation)theEObject;
				T result = caseDataDonation_DataDonation(dataDonation_DataDonation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_DONATION_IS_APPROVED: {
				DataDonation_isApproved dataDonation_isApproved = (DataDonation_isApproved)theEObject;
				T result = caseDataDonation_isApproved(dataDonation_isApproved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_DONATION_IS_STATE_DEFINED: {
				DataDonation_isStateDefined dataDonation_isStateDefined = (DataDonation_isStateDefined)theEObject;
				T result = caseDataDonation_isStateDefined(dataDonation_isStateDefined);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_INSTITUTION_CENTER: {
				DataInstitutionCenter dataInstitutionCenter = (DataInstitutionCenter)theEObject;
				T result = caseDataInstitutionCenter(dataInstitutionCenter);
				if (result == null) result = caseSerializable(dataInstitutionCenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_PRODUCT: {
				DataProduct dataProduct = (DataProduct)theEObject;
				T result = caseDataProduct(dataProduct);
				if (result == null) result = caseSerializable(dataProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_PRODUCT_TYPE: {
				DataProductType dataProductType = (DataProductType)theEObject;
				T result = caseDataProductType(dataProductType);
				if (result == null) result = caseSerializable(dataProductType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_RESPONSE: {
				DataResponse dataResponse = (DataResponse)theEObject;
				T result = caseDataResponse(dataResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_STOCK: {
				DataStock dataStock = (DataStock)theEObject;
				T result = caseDataStock(dataStock);
				if (result == null) result = caseSerializable(dataStock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_STOCK_PRODUCT_TYPE: {
				DataStockProductType dataStockProductType = (DataStockProductType)theEObject;
				T result = caseDataStockProductType(dataStockProductType);
				if (result == null) result = caseDataProductType(dataStockProductType);
				if (result == null) result = caseSerializable(dataStockProductType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE: {
				DataStockProductTypeBloodType dataStockProductTypeBloodType = (DataStockProductTypeBloodType)theEObject;
				T result = caseDataStockProductTypeBloodType(dataStockProductTypeBloodType);
				if (result == null) result = caseDataBloodType(dataStockProductTypeBloodType);
				if (result == null) result = caseSerializable(dataStockProductTypeBloodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_TRANSFUSION: {
				DataTransfusion dataTransfusion = (DataTransfusion)theEObject;
				T result = caseDataTransfusion(dataTransfusion);
				if (result == null) result = caseSerializable(dataTransfusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_TRANSFUSION_EVENT: {
				DataTransfusionEvent dataTransfusionEvent = (DataTransfusionEvent)theEObject;
				T result = caseDataTransfusionEvent(dataTransfusionEvent);
				if (result == null) result = caseDataEvent(dataTransfusionEvent);
				if (result == null) result = caseSerializable(dataTransfusionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_UNIT: {
				DataUnit dataUnit = (DataUnit)theEObject;
				T result = caseDataUnit(dataUnit);
				if (result == null) result = caseSerializable(dataUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DATA_USER: {
				DataUser dataUser = (DataUser)theEObject;
				T result = caseDataUser(dataUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DONATION_FILTER_DATA: {
				DonationFilterData donationFilterData = (DonationFilterData)theEObject;
				T result = caseDonationFilterData(donationFilterData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DONATION_RESULT: {
				DonationResult donationResult = (DonationResult)theEObject;
				T result = caseDonationResult(donationResult);
				if (result == null) result = caseSerializable(donationResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DONATION_RESULT_DONATION_RESULT: {
				DonationResult_DonationResult donationResult_DonationResult = (DonationResult_DonationResult)theEObject;
				T result = caseDonationResult_DonationResult(donationResult_DonationResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DONATION_SEARCH: {
				DonationSearch donationSearch = (DonationSearch)theEObject;
				T result = caseDonationSearch(donationSearch);
				if (result == null) result = caseSerializable(donationSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DONATION_SEARCH_DONATION_SEARCH: {
				DonationSearch_DonationSearch donationSearch_DonationSearch = (DonationSearch_DonationSearch)theEObject;
				T result = caseDonationSearch_DonationSearch(donationSearch_DonationSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.DONATIONS_STATISTICS_DATA: {
				DonationsStatisticsData donationsStatisticsData = (DonationsStatisticsData)theEObject;
				T result = caseDonationsStatisticsData(donationsStatisticsData);
				if (result == null) result = caseSerializable(donationsStatisticsData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.LOGIN_DATA: {
				LoginData loginData = (LoginData)theEObject;
				T result = caseLoginData(loginData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.MAIL_DATA: {
				MailData mailData = (MailData)theEObject;
				T result = caseMailData(mailData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.MESSAGE_OPTION_DATA: {
				MessageOptionData messageOptionData = (MessageOptionData)theEObject;
				T result = caseMessageOptionData(messageOptionData);
				if (result == null) result = caseSerializable(messageOptionData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.TRANSFUSION_FILTER_DATA: {
				TransfusionFilterData transfusionFilterData = (TransfusionFilterData)theEObject;
				T result = caseTransfusionFilterData(transfusionFilterData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.TRANSFUSION_RESULT: {
				TransfusionResult transfusionResult = (TransfusionResult)theEObject;
				T result = caseTransfusionResult(transfusionResult);
				if (result == null) result = caseSerializable(transfusionResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.TRANSFUSION_RESULT_TRANSFUSION_RESULT: {
				TransfusionResult_TransfusionResult transfusionResult_TransfusionResult = (TransfusionResult_TransfusionResult)theEObject;
				T result = caseTransfusionResult_TransfusionResult(transfusionResult_TransfusionResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.TRANSFUSION_SEARCH: {
				TransfusionSearch transfusionSearch = (TransfusionSearch)theEObject;
				T result = caseTransfusionSearch(transfusionSearch);
				if (result == null) result = caseSerializable(transfusionSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.TRANSFUSION_SEARCH_TRANSFUSION_SEARCH: {
				TransfusionSearch_TransfusionSearch transfusionSearch_TransfusionSearch = (TransfusionSearch_TransfusionSearch)theEObject;
				T result = caseTransfusionSearch_TransfusionSearch(transfusionSearch_TransfusionSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEvent(DataEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCode(DataCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBank(DataBank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Institution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Institution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataInstitution(DataInstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Bank equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Bank equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBank_equals(DataBank_equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Blood ABO Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Blood ABO Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBloodABOType(DataBloodABOType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Blood Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Blood Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBloodType(DataBloodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Campaign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCampaign(DataCampaign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data City</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data City</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCity(DataCity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data City equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data City equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCity_equals(DataCity_equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Country</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Country</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCountry(DataCountry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDocumentType(DataDocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Donation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Donation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDonation(DataDonation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPerson(DataPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataState(DataState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data State equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data State equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataState_equals(DataState_equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Person get Full Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Person get Full Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPerson_getFullName(DataPerson_getFullName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Donation Donor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Donation Donor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDonationDonorType(DataDonationDonorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Donation Fail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Donation Fail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDonationFail(DataDonationFail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Donation Fail Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Donation Fail Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDonationFailCause(DataDonationFailCause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Donation Fail Data Donation Fail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Donation Fail Data Donation Fail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDonationFail_DataDonationFail(DataDonationFail_DataDonationFail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Laboratory Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Laboratory Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLaboratoryResult(DataLaboratoryResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Responsible Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Responsible Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataResponsiblePerson(DataResponsiblePerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Responsible Person get Full Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Responsible Person get Full Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataResponsiblePerson_getFullName(DataResponsiblePerson_getFullName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Donation Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Donation Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDonationEvent(DataDonationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Donation Data Donation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Donation Data Donation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDonation_DataDonation(DataDonation_DataDonation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Donation is Approved</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Donation is Approved</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDonation_isApproved(DataDonation_isApproved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Donation is State Defined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Donation is State Defined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDonation_isStateDefined(DataDonation_isStateDefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Institution Center</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Institution Center</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataInstitutionCenter(DataInstitutionCenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProduct(DataProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Product Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProductType(DataProductType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataResponse(DataResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Stock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Stock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStock(DataStock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Stock Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Stock Product Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStockProductType(DataStockProductType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Stock Product Type Blood Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Stock Product Type Blood Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStockProductTypeBloodType(DataStockProductTypeBloodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Transfusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Transfusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTransfusion(DataTransfusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Transfusion Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Transfusion Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTransfusionEvent(DataTransfusionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataUnit(DataUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataUser(DataUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donation Filter Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donation Filter Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonationFilterData(DonationFilterData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donation Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donation Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonationResult(DonationResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donation Result Donation Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donation Result Donation Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonationResult_DonationResult(DonationResult_DonationResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donation Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donation Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonationSearch(DonationSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donation Search Donation Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donation Search Donation Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonationSearch_DonationSearch(DonationSearch_DonationSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donations Statistics Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donations Statistics Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonationsStatisticsData(DonationsStatisticsData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginData(LoginData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mail Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mail Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMailData(MailData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Option Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Option Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageOptionData(MessageOptionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfusion Filter Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfusion Filter Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransfusionFilterData(TransfusionFilterData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfusion Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfusion Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransfusionResult(TransfusionResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfusion Result Transfusion Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfusion Result Transfusion Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransfusionResult_TransfusionResult(TransfusionResult_TransfusionResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfusion Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfusion Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransfusionSearch(TransfusionSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfusion Search Transfusion Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfusion Search Transfusion Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransfusionSearch_TransfusionSearch(TransfusionSearch_TransfusionSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serializable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serializable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializable(Serializable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DatatypesSwitch
