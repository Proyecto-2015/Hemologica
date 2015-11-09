/**
 */
package org.hemologica.datatypes.util;

import jdk.java.io.Serializable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.hemologica.datatypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hemologica.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypesSwitch<Adapter> modelSwitch =
		new DatatypesSwitch<Adapter>() {
			@Override
			public Adapter caseDataEvent(DataEvent object) {
				return createDataEventAdapter();
			}
			@Override
			public Adapter caseDataCode(DataCode object) {
				return createDataCodeAdapter();
			}
			@Override
			public Adapter caseDataBank(DataBank object) {
				return createDataBankAdapter();
			}
			@Override
			public Adapter caseDataInstitution(DataInstitution object) {
				return createDataInstitutionAdapter();
			}
			@Override
			public Adapter caseDataBank_equals(DataBank_equals object) {
				return createDataBank_equalsAdapter();
			}
			@Override
			public Adapter caseDataBloodABOType(DataBloodABOType object) {
				return createDataBloodABOTypeAdapter();
			}
			@Override
			public Adapter caseDataBloodType(DataBloodType object) {
				return createDataBloodTypeAdapter();
			}
			@Override
			public Adapter caseDataCampaign(DataCampaign object) {
				return createDataCampaignAdapter();
			}
			@Override
			public Adapter caseDataCity(DataCity object) {
				return createDataCityAdapter();
			}
			@Override
			public Adapter caseDataCity_equals(DataCity_equals object) {
				return createDataCity_equalsAdapter();
			}
			@Override
			public Adapter caseDataCountry(DataCountry object) {
				return createDataCountryAdapter();
			}
			@Override
			public Adapter caseDataDocumentType(DataDocumentType object) {
				return createDataDocumentTypeAdapter();
			}
			@Override
			public Adapter caseDataDonation(DataDonation object) {
				return createDataDonationAdapter();
			}
			@Override
			public Adapter caseDataPerson(DataPerson object) {
				return createDataPersonAdapter();
			}
			@Override
			public Adapter caseDataState(DataState object) {
				return createDataStateAdapter();
			}
			@Override
			public Adapter caseDataState_equals(DataState_equals object) {
				return createDataState_equalsAdapter();
			}
			@Override
			public Adapter caseDataPerson_getFullName(DataPerson_getFullName object) {
				return createDataPerson_getFullNameAdapter();
			}
			@Override
			public Adapter caseDataDonationDonorType(DataDonationDonorType object) {
				return createDataDonationDonorTypeAdapter();
			}
			@Override
			public Adapter caseDataDonationFail(DataDonationFail object) {
				return createDataDonationFailAdapter();
			}
			@Override
			public Adapter caseDataDonationFailCause(DataDonationFailCause object) {
				return createDataDonationFailCauseAdapter();
			}
			@Override
			public Adapter caseDataDonationFail_DataDonationFail(DataDonationFail_DataDonationFail object) {
				return createDataDonationFail_DataDonationFailAdapter();
			}
			@Override
			public Adapter caseDataLaboratoryResult(DataLaboratoryResult object) {
				return createDataLaboratoryResultAdapter();
			}
			@Override
			public Adapter caseDataResponsiblePerson(DataResponsiblePerson object) {
				return createDataResponsiblePersonAdapter();
			}
			@Override
			public Adapter caseDataResponsiblePerson_getFullName(DataResponsiblePerson_getFullName object) {
				return createDataResponsiblePerson_getFullNameAdapter();
			}
			@Override
			public Adapter caseDataDonationEvent(DataDonationEvent object) {
				return createDataDonationEventAdapter();
			}
			@Override
			public Adapter caseDataDonation_DataDonation(DataDonation_DataDonation object) {
				return createDataDonation_DataDonationAdapter();
			}
			@Override
			public Adapter caseDataDonation_isApproved(DataDonation_isApproved object) {
				return createDataDonation_isApprovedAdapter();
			}
			@Override
			public Adapter caseDataDonation_isStateDefined(DataDonation_isStateDefined object) {
				return createDataDonation_isStateDefinedAdapter();
			}
			@Override
			public Adapter caseDataInstitutionCenter(DataInstitutionCenter object) {
				return createDataInstitutionCenterAdapter();
			}
			@Override
			public Adapter caseDataProduct(DataProduct object) {
				return createDataProductAdapter();
			}
			@Override
			public Adapter caseDataProductType(DataProductType object) {
				return createDataProductTypeAdapter();
			}
			@Override
			public Adapter caseDataResponse(DataResponse object) {
				return createDataResponseAdapter();
			}
			@Override
			public Adapter caseDataStock(DataStock object) {
				return createDataStockAdapter();
			}
			@Override
			public Adapter caseDataStockProductType(DataStockProductType object) {
				return createDataStockProductTypeAdapter();
			}
			@Override
			public Adapter caseDataStockProductTypeBloodType(DataStockProductTypeBloodType object) {
				return createDataStockProductTypeBloodTypeAdapter();
			}
			@Override
			public Adapter caseDataTransfusion(DataTransfusion object) {
				return createDataTransfusionAdapter();
			}
			@Override
			public Adapter caseDataTransfusionEvent(DataTransfusionEvent object) {
				return createDataTransfusionEventAdapter();
			}
			@Override
			public Adapter caseDataUnit(DataUnit object) {
				return createDataUnitAdapter();
			}
			@Override
			public Adapter caseDataUser(DataUser object) {
				return createDataUserAdapter();
			}
			@Override
			public Adapter caseDonationFilterData(DonationFilterData object) {
				return createDonationFilterDataAdapter();
			}
			@Override
			public Adapter caseDonationResult(DonationResult object) {
				return createDonationResultAdapter();
			}
			@Override
			public Adapter caseDonationResult_DonationResult(DonationResult_DonationResult object) {
				return createDonationResult_DonationResultAdapter();
			}
			@Override
			public Adapter caseDonationSearch(DonationSearch object) {
				return createDonationSearchAdapter();
			}
			@Override
			public Adapter caseDonationSearch_DonationSearch(DonationSearch_DonationSearch object) {
				return createDonationSearch_DonationSearchAdapter();
			}
			@Override
			public Adapter caseDonationsStatisticsData(DonationsStatisticsData object) {
				return createDonationsStatisticsDataAdapter();
			}
			@Override
			public Adapter caseLoginData(LoginData object) {
				return createLoginDataAdapter();
			}
			@Override
			public Adapter caseMailData(MailData object) {
				return createMailDataAdapter();
			}
			@Override
			public Adapter caseMessageOptionData(MessageOptionData object) {
				return createMessageOptionDataAdapter();
			}
			@Override
			public Adapter caseTransfusionFilterData(TransfusionFilterData object) {
				return createTransfusionFilterDataAdapter();
			}
			@Override
			public Adapter caseTransfusionResult(TransfusionResult object) {
				return createTransfusionResultAdapter();
			}
			@Override
			public Adapter caseTransfusionResult_TransfusionResult(TransfusionResult_TransfusionResult object) {
				return createTransfusionResult_TransfusionResultAdapter();
			}
			@Override
			public Adapter caseTransfusionSearch(TransfusionSearch object) {
				return createTransfusionSearchAdapter();
			}
			@Override
			public Adapter caseTransfusionSearch_TransfusionSearch(TransfusionSearch_TransfusionSearch object) {
				return createTransfusionSearch_TransfusionSearchAdapter();
			}
			@Override
			public Adapter caseSerializable(Serializable object) {
				return createSerializableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataEvent <em>Data Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataEvent
	 * @generated
	 */
	public Adapter createDataEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataCode <em>Data Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataCode
	 * @generated
	 */
	public Adapter createDataCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataBank <em>Data Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataBank
	 * @generated
	 */
	public Adapter createDataBankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataInstitution <em>Data Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataInstitution
	 * @generated
	 */
	public Adapter createDataInstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataBank_equals <em>Data Bank equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataBank_equals
	 * @generated
	 */
	public Adapter createDataBank_equalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataBloodABOType <em>Data Blood ABO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataBloodABOType
	 * @generated
	 */
	public Adapter createDataBloodABOTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataBloodType <em>Data Blood Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataBloodType
	 * @generated
	 */
	public Adapter createDataBloodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataCampaign <em>Data Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataCampaign
	 * @generated
	 */
	public Adapter createDataCampaignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataCity <em>Data City</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataCity
	 * @generated
	 */
	public Adapter createDataCityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataCity_equals <em>Data City equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataCity_equals
	 * @generated
	 */
	public Adapter createDataCity_equalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataCountry <em>Data Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataCountry
	 * @generated
	 */
	public Adapter createDataCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataDocumentType <em>Data Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataDocumentType
	 * @generated
	 */
	public Adapter createDataDocumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataDonation <em>Data Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataDonation
	 * @generated
	 */
	public Adapter createDataDonationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataPerson <em>Data Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataPerson
	 * @generated
	 */
	public Adapter createDataPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataState
	 * @generated
	 */
	public Adapter createDataStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataState_equals <em>Data State equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataState_equals
	 * @generated
	 */
	public Adapter createDataState_equalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataPerson_getFullName <em>Data Person get Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataPerson_getFullName
	 * @generated
	 */
	public Adapter createDataPerson_getFullNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataDonationDonorType <em>Data Donation Donor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataDonationDonorType
	 * @generated
	 */
	public Adapter createDataDonationDonorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataDonationFail <em>Data Donation Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataDonationFail
	 * @generated
	 */
	public Adapter createDataDonationFailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataDonationFailCause <em>Data Donation Fail Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataDonationFailCause
	 * @generated
	 */
	public Adapter createDataDonationFailCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataDonationFail_DataDonationFail <em>Data Donation Fail Data Donation Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataDonationFail_DataDonationFail
	 * @generated
	 */
	public Adapter createDataDonationFail_DataDonationFailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataLaboratoryResult <em>Data Laboratory Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataLaboratoryResult
	 * @generated
	 */
	public Adapter createDataLaboratoryResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataResponsiblePerson <em>Data Responsible Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataResponsiblePerson
	 * @generated
	 */
	public Adapter createDataResponsiblePersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataResponsiblePerson_getFullName <em>Data Responsible Person get Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataResponsiblePerson_getFullName
	 * @generated
	 */
	public Adapter createDataResponsiblePerson_getFullNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataDonationEvent <em>Data Donation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataDonationEvent
	 * @generated
	 */
	public Adapter createDataDonationEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataDonation_DataDonation <em>Data Donation Data Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataDonation_DataDonation
	 * @generated
	 */
	public Adapter createDataDonation_DataDonationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataDonation_isApproved <em>Data Donation is Approved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataDonation_isApproved
	 * @generated
	 */
	public Adapter createDataDonation_isApprovedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataDonation_isStateDefined <em>Data Donation is State Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataDonation_isStateDefined
	 * @generated
	 */
	public Adapter createDataDonation_isStateDefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataInstitutionCenter <em>Data Institution Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataInstitutionCenter
	 * @generated
	 */
	public Adapter createDataInstitutionCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataProduct <em>Data Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataProduct
	 * @generated
	 */
	public Adapter createDataProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataProductType <em>Data Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataProductType
	 * @generated
	 */
	public Adapter createDataProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataResponse <em>Data Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataResponse
	 * @generated
	 */
	public Adapter createDataResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataStock <em>Data Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataStock
	 * @generated
	 */
	public Adapter createDataStockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataStockProductType <em>Data Stock Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataStockProductType
	 * @generated
	 */
	public Adapter createDataStockProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataStockProductTypeBloodType <em>Data Stock Product Type Blood Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataStockProductTypeBloodType
	 * @generated
	 */
	public Adapter createDataStockProductTypeBloodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataTransfusion <em>Data Transfusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataTransfusion
	 * @generated
	 */
	public Adapter createDataTransfusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataTransfusionEvent <em>Data Transfusion Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataTransfusionEvent
	 * @generated
	 */
	public Adapter createDataTransfusionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataUnit
	 * @generated
	 */
	public Adapter createDataUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DataUser <em>Data User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DataUser
	 * @generated
	 */
	public Adapter createDataUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DonationFilterData <em>Donation Filter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DonationFilterData
	 * @generated
	 */
	public Adapter createDonationFilterDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DonationResult <em>Donation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DonationResult
	 * @generated
	 */
	public Adapter createDonationResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DonationResult_DonationResult <em>Donation Result Donation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DonationResult_DonationResult
	 * @generated
	 */
	public Adapter createDonationResult_DonationResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DonationSearch <em>Donation Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DonationSearch
	 * @generated
	 */
	public Adapter createDonationSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DonationSearch_DonationSearch <em>Donation Search Donation Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DonationSearch_DonationSearch
	 * @generated
	 */
	public Adapter createDonationSearch_DonationSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.DonationsStatisticsData <em>Donations Statistics Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.DonationsStatisticsData
	 * @generated
	 */
	public Adapter createDonationsStatisticsDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.LoginData <em>Login Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.LoginData
	 * @generated
	 */
	public Adapter createLoginDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.MailData <em>Mail Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.MailData
	 * @generated
	 */
	public Adapter createMailDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.MessageOptionData <em>Message Option Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.MessageOptionData
	 * @generated
	 */
	public Adapter createMessageOptionDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.TransfusionFilterData <em>Transfusion Filter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.TransfusionFilterData
	 * @generated
	 */
	public Adapter createTransfusionFilterDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.TransfusionResult <em>Transfusion Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.TransfusionResult
	 * @generated
	 */
	public Adapter createTransfusionResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.TransfusionResult_TransfusionResult <em>Transfusion Result Transfusion Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.TransfusionResult_TransfusionResult
	 * @generated
	 */
	public Adapter createTransfusionResult_TransfusionResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.TransfusionSearch <em>Transfusion Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.TransfusionSearch
	 * @generated
	 */
	public Adapter createTransfusionSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hemologica.datatypes.TransfusionSearch_TransfusionSearch <em>Transfusion Search Transfusion Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hemologica.datatypes.TransfusionSearch_TransfusionSearch
	 * @generated
	 */
	public Adapter createTransfusionSearch_TransfusionSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jdk.java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jdk.java.io.Serializable
	 * @generated
	 */
	public Adapter createSerializableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DatatypesAdapterFactory
