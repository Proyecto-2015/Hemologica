/**
 */
package org.hemologica.datatypes.impl;

import jdk.java.io.IoPackage;

import jdk.java.io.impl.IoPackageImpl;

import jdk.java.lang.LangPackage;

import jdk.java.lang.impl.LangPackageImpl;

import jdk.java.util.UtilPackage;

import jdk.java.util.impl.UtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.hemologica.constants.ConstantsPackage;

import org.hemologica.constants.impl.ConstantsPackageImpl;

import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataBank_equals;
import org.hemologica.datatypes.DataBloodABOType;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataCity_equals;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataCountry;
import org.hemologica.datatypes.DataDocumentType;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationDonorType;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataDonationFail;
import org.hemologica.datatypes.DataDonationFailCause;
import org.hemologica.datatypes.DataDonationFail_DataDonationFail;
import org.hemologica.datatypes.DataDonation_DataDonation;
import org.hemologica.datatypes.DataDonation_isApproved;
import org.hemologica.datatypes.DataDonation_isStateDefined;
import org.hemologica.datatypes.DataEvent;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataInstitutionCenter;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataPerson_getFullName;
import org.hemologica.datatypes.DataProduct;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DataResponsiblePerson_getFullName;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataState_equals;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataStockProductType;
import org.hemologica.datatypes.DataStockProductTypeBloodType;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionEvent;
import org.hemologica.datatypes.DataUnit;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.DatatypesFactory;
import org.hemologica.datatypes.DatatypesPackage;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DonationResult;
import org.hemologica.datatypes.DonationResult_DonationResult;
import org.hemologica.datatypes.DonationSearch;
import org.hemologica.datatypes.DonationSearch_DonationSearch;
import org.hemologica.datatypes.DonationsStatisticsData;
import org.hemologica.datatypes.LoginData;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.MessageOptionData;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.datatypes.TransfusionResult;
import org.hemologica.datatypes.TransfusionResult_TransfusionResult;
import org.hemologica.datatypes.TransfusionSearch;
import org.hemologica.datatypes.TransfusionSearch_TransfusionSearch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBank_equalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBloodABOTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBloodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCampaignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCity_equalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCountryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDocumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDonationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataState_equalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPerson_getFullNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDonationDonorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDonationFailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDonationFailCauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDonationFail_DataDonationFailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataLaboratoryResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataResponsiblePersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataResponsiblePerson_getFullNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDonationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDonation_DataDonationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDonation_isApprovedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDonation_isStateDefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInstitutionCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProductTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStockProductTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStockProductTypeBloodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTransfusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTransfusionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donationFilterDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donationResult_DonationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donationSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donationSearch_DonationSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donationsStatisticsDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mailDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageOptionDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transfusionFilterDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transfusionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transfusionResult_TransfusionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transfusionSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transfusionSearch_TransfusionSearchEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.hemologica.datatypes.DatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesPackageImpl() {
		super(eNS_URI, DatatypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesPackage init() {
		if (isInited) return (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		ConstantsPackageImpl theConstantsPackage = (ConstantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstantsPackage.eNS_URI) instanceof ConstantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstantsPackage.eNS_URI) : ConstantsPackage.eINSTANCE);

		// Create package meta-data objects
		theDatatypesPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theConstantsPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theConstantsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
		return theDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataEvent() {
		return dataEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataEvent_SerialVersionUID() {
		return (EAttribute)dataEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEvent_Event() {
		return (EReference)dataEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataEvent_Severity() {
		return (EAttribute)dataEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCode() {
		return dataCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCode_SerialVersionUID() {
		return (EAttribute)dataCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCode_Code() {
		return (EAttribute)dataCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCode_DisplayName() {
		return (EAttribute)dataCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCode_Description() {
		return (EAttribute)dataCodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBank() {
		return dataBankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBank_Code() {
		return (EAttribute)dataBankEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBank_Name() {
		return (EAttribute)dataBankEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_Institution() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBank_Address() {
		return (EAttribute)dataBankEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBank_Hour() {
		return (EAttribute)dataBankEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBank_Telephone() {
		return (EAttribute)dataBankEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBank_Email() {
		return (EAttribute)dataBankEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBank_Information() {
		return (EAttribute)dataBankEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_Latitude() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataBank_Longitude() {
		return (EReference)dataBankEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataBank__Equals__Object() {
		return dataBankEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataInstitution() {
		return dataInstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataInstitution_SerialVersionUID() {
		return (EAttribute)dataInstitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataInstitution_Code() {
		return (EAttribute)dataInstitutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataInstitution_Name() {
		return (EAttribute)dataInstitutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInstitution_Banks() {
		return (EReference)dataInstitutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataInstitution_Address() {
		return (EAttribute)dataInstitutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataInstitution_Hour() {
		return (EAttribute)dataInstitutionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataInstitution_Telephone() {
		return (EAttribute)dataInstitutionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataInstitution_Email() {
		return (EAttribute)dataInstitutionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataInstitution_Information() {
		return (EAttribute)dataInstitutionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInstitution_Latitude() {
		return (EReference)dataInstitutionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInstitution_Longitude() {
		return (EReference)dataInstitutionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBank_equals() {
		return dataBank_equalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBloodABOType() {
		return dataBloodABOTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBloodABOType_SerialVersionUID() {
		return (EAttribute)dataBloodABOTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBloodABOType_Code() {
		return (EAttribute)dataBloodABOTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBloodABOType_DisplayName() {
		return (EAttribute)dataBloodABOTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBloodType() {
		return dataBloodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBloodType_SerialVersionUID() {
		return (EAttribute)dataBloodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBloodType_Code() {
		return (EAttribute)dataBloodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataBloodType_DisplayName() {
		return (EAttribute)dataBloodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCampaign() {
		return dataCampaignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCampaign_SerialVersionUID() {
		return (EAttribute)dataCampaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCampaign_Id() {
		return (EAttribute)dataCampaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCampaign_Title() {
		return (EAttribute)dataCampaignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCampaign_Subtitle() {
		return (EAttribute)dataCampaignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCampaign_Summary() {
		return (EAttribute)dataCampaignEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCampaign_Text() {
		return (EAttribute)dataCampaignEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCampaign_Date() {
		return (EAttribute)dataCampaignEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCampaign_Image() {
		return (EAttribute)dataCampaignEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCity() {
		return dataCityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCity_Code() {
		return (EAttribute)dataCityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCity_Name() {
		return (EAttribute)dataCityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCity_Id() {
		return (EAttribute)dataCityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataCity__Equals__Object() {
		return dataCityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCity_equals() {
		return dataCity_equalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCountry() {
		return dataCountryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCountry_SerialVersionUID() {
		return (EAttribute)dataCountryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCountry_Code() {
		return (EAttribute)dataCountryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCountry_DisplayName() {
		return (EAttribute)dataCountryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDocumentType() {
		return dataDocumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDocumentType_SerialVersionUID() {
		return (EAttribute)dataDocumentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDocumentType_Code() {
		return (EAttribute)dataDocumentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDocumentType_DisplayName() {
		return (EAttribute)dataDocumentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDonation() {
		return dataDonationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonation_SerialVersionUID() {
		return (EAttribute)dataDonationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonation_Name() {
		return (EAttribute)dataDonationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonation_Date() {
		return (EAttribute)dataDonationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_Bank() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_Institution() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_Person() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_DataDonorType() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonation_State() {
		return (EAttribute)dataDonationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_BloodABOType() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_BloodDType() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_Fail() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_LabResults() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_Events() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_ExtractionTimeBegin() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonation_ExtractionTimeEnd() {
		return (EReference)dataDonationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataDonation__DataDonation() {
		return dataDonationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataDonation__IsApproved() {
		return dataDonationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataDonation__IsStateDefined() {
		return dataDonationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPerson() {
		return dataPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_SerialVersionUID() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_Id() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_FirstName() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_SecondName() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_FirstLastName() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_SecondLastName() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_DocumentCountry() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_DocumentType() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_DocumentNumber() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_BirthdayDate() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPerson_State() {
		return (EReference)dataPersonEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPerson_City() {
		return (EReference)dataPersonEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_Address() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_Telephone() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_Email() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPerson_BloodType() {
		return (EReference)dataPersonEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_AbleToDonate() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_Image() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_AllowNotificationNeedDonor() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPerson_AllowNotificationAbleToDonate() {
		return (EAttribute)dataPersonEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataPerson__GetFullName() {
		return dataPersonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataState() {
		return dataStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataState_Id() {
		return (EAttribute)dataStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataState_Code() {
		return (EAttribute)dataStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataState_Name() {
		return (EAttribute)dataStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataState__Equals__Object() {
		return dataStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataState_equals() {
		return dataState_equalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPerson_getFullName() {
		return dataPerson_getFullNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDonationDonorType() {
		return dataDonationDonorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonationDonorType_SerialVersionUID() {
		return (EAttribute)dataDonationDonorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonationDonorType_Code() {
		return (EAttribute)dataDonationDonorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonationDonorType_DisplayName() {
		return (EAttribute)dataDonationDonorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDonationFail() {
		return dataDonationFailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonationFail_SerialVersionUID() {
		return (EAttribute)dataDonationFailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonationFail_Code() {
		return (EAttribute)dataDonationFailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonationFail_DisplayName() {
		return (EAttribute)dataDonationFailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonationFail_Date() {
		return (EReference)dataDonationFailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDonationFail_Cause() {
		return (EReference)dataDonationFailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonationFail_RejectionType() {
		return (EAttribute)dataDonationFailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataDonationFail__DataDonationFail() {
		return dataDonationFailEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDonationFailCause() {
		return dataDonationFailCauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonationFailCause_SerialVersionUID() {
		return (EAttribute)dataDonationFailCauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonationFailCause_Code() {
		return (EAttribute)dataDonationFailCauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDonationFailCause_DisplayName() {
		return (EAttribute)dataDonationFailCauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDonationFail_DataDonationFail() {
		return dataDonationFail_DataDonationFailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataLaboratoryResult() {
		return dataLaboratoryResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLaboratoryResult_SerialVersionUID() {
		return (EAttribute)dataLaboratoryResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLaboratoryResult_Analysis() {
		return (EReference)dataLaboratoryResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLaboratoryResult_Bank() {
		return (EAttribute)dataLaboratoryResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLaboratoryResult_Date() {
		return (EReference)dataLaboratoryResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataLaboratoryResult_ResponsiblePerson() {
		return (EReference)dataLaboratoryResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataLaboratoryResult_Result() {
		return (EAttribute)dataLaboratoryResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataResponsiblePerson() {
		return dataResponsiblePersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResponsiblePerson_Id() {
		return (EAttribute)dataResponsiblePersonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResponsiblePerson_FirstName() {
		return (EAttribute)dataResponsiblePersonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResponsiblePerson_SecondName() {
		return (EAttribute)dataResponsiblePersonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResponsiblePerson_FirstLastName() {
		return (EAttribute)dataResponsiblePersonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResponsiblePerson_SecondLastName() {
		return (EAttribute)dataResponsiblePersonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResponsiblePerson_DocumentCountry() {
		return (EAttribute)dataResponsiblePersonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResponsiblePerson_DocumentType() {
		return (EAttribute)dataResponsiblePersonEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResponsiblePerson_DocumentNumber() {
		return (EAttribute)dataResponsiblePersonEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataResponsiblePerson__GetFullName() {
		return dataResponsiblePersonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataResponsiblePerson_getFullName() {
		return dataResponsiblePerson_getFullNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDonationEvent() {
		return dataDonationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDonation_DataDonation() {
		return dataDonation_DataDonationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDonation_isApproved() {
		return dataDonation_isApprovedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDonation_isStateDefined() {
		return dataDonation_isStateDefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataInstitutionCenter() {
		return dataInstitutionCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataInstitutionCenter_SerialVersionUID() {
		return (EAttribute)dataInstitutionCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProduct() {
		return dataProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProduct_SerialVersionUID() {
		return (EAttribute)dataProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProduct_Code() {
		return (EAttribute)dataProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProduct_Display() {
		return (EAttribute)dataProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProduct_Donation() {
		return (EReference)dataProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProductType() {
		return dataProductTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProductType_SerialVersionUID() {
		return (EAttribute)dataProductTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProductType_Code() {
		return (EAttribute)dataProductTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataProductType_Display() {
		return (EAttribute)dataProductTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataResponse() {
		return dataResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResponse_Code() {
		return (EAttribute)dataResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResponse_ErrorMessage() {
		return (EAttribute)dataResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStock() {
		return dataStockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataStock_SerialVersionUID() {
		return (EAttribute)dataStockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStock_Bank() {
		return (EReference)dataStockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStock_Products() {
		return (EReference)dataStockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStockProductType() {
		return dataStockProductTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStockProductType_BloodTypes() {
		return (EReference)dataStockProductTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStockProductTypeBloodType() {
		return dataStockProductTypeBloodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataStockProductTypeBloodType_Count() {
		return (EAttribute)dataStockProductTypeBloodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTransfusion() {
		return dataTransfusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTransfusion_SerialVersionUID() {
		return (EAttribute)dataTransfusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTransfusion_Name() {
		return (EAttribute)dataTransfusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTransfusion_Date() {
		return (EAttribute)dataTransfusionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTransfusion_Bank() {
		return (EReference)dataTransfusionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTransfusion_Institution() {
		return (EReference)dataTransfusionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTransfusion_Volume() {
		return (EAttribute)dataTransfusionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTransfusion_Person() {
		return (EReference)dataTransfusionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTransfusion_AssociatedDonation() {
		return (EReference)dataTransfusionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTransfusion_DataProduct() {
		return (EReference)dataTransfusionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTransfusion_LaboratoryResults() {
		return (EReference)dataTransfusionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTransfusion_Events() {
		return (EReference)dataTransfusionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTransfusion_ResponsibleTransfusionPerson() {
		return (EReference)dataTransfusionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTransfusionEvent() {
		return dataTransfusionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataUnit() {
		return dataUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataUnit_SerialVersionUID() {
		return (EAttribute)dataUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnit_Id() {
		return (EReference)dataUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnit_DonationId() {
		return (EReference)dataUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataUnit_Code() {
		return (EAttribute)dataUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataUnit_Institution() {
		return (EAttribute)dataUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataUnit_InstitutionCode() {
		return (EAttribute)dataUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnit_ProductType() {
		return (EReference)dataUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnit_BloodType() {
		return (EReference)dataUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataUser() {
		return dataUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataUser_PersonId() {
		return (EAttribute)dataUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUser_Banks() {
		return (EReference)dataUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonationFilterData() {
		return donationFilterDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationFilterData_Code() {
		return (EAttribute)donationFilterDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationFilterData_DisplayName() {
		return (EAttribute)donationFilterDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDonationFilterData_Options() {
		return (EReference)donationFilterDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonationResult() {
		return donationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationResult_SerialVersionUID() {
		return (EAttribute)donationResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationResult_DonationId() {
		return (EAttribute)donationResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationResult_PersonDocument() {
		return (EAttribute)donationResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationResult_PersonCompleteName() {
		return (EAttribute)donationResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDonationResult_DonationDate() {
		return (EReference)donationResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationResult_DonationState() {
		return (EAttribute)donationResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDonationResult__DonationResult() {
		return donationResultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDonationResult__DonationResult__String_String_String_Date_String() {
		return donationResultEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonationResult_DonationResult() {
		return donationResult_DonationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonationSearch() {
		return donationSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationSearch_SerialVersionUID() {
		return (EAttribute)donationSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationSearch_Person() {
		return (EAttribute)donationSearchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDonationSearch_From() {
		return (EReference)donationSearchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDonationSearch_To() {
		return (EReference)donationSearchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDonationSearch__DonationSearch() {
		return donationSearchEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDonationSearch__DonationSearch__String_Date_Date() {
		return donationSearchEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonationSearch_DonationSearch() {
		return donationSearch_DonationSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonationsStatisticsData() {
		return donationsStatisticsDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationsStatisticsData_SerialVersionUID() {
		return (EAttribute)donationsStatisticsDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationsStatisticsData_Type() {
		return (EAttribute)donationsStatisticsDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationsStatisticsData_FromDate() {
		return (EAttribute)donationsStatisticsDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationsStatisticsData_ToDate() {
		return (EAttribute)donationsStatisticsDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationsStatisticsData_InstitutionId() {
		return (EAttribute)donationsStatisticsDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonationsStatisticsData_BloodBankId() {
		return (EAttribute)donationsStatisticsDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDonationsStatisticsData_Filters() {
		return (EReference)donationsStatisticsDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDonationsStatisticsData_Distinguish() {
		return (EReference)donationsStatisticsDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginData() {
		return loginDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginData_User() {
		return (EAttribute)loginDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginData_Password() {
		return (EAttribute)loginDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMailData() {
		return mailDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMailData_MessageOption() {
		return (EReference)mailDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMailData_BloodType() {
		return (EReference)mailDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailData_Subject() {
		return (EAttribute)mailDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailData_Text() {
		return (EAttribute)mailDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageOptionData() {
		return messageOptionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageOptionData_SerialVersionUID() {
		return (EAttribute)messageOptionDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageOptionData_Code() {
		return (EAttribute)messageOptionDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageOptionData_DisplayName() {
		return (EAttribute)messageOptionDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransfusionFilterData() {
		return transfusionFilterDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransfusionFilterData_Code() {
		return (EAttribute)transfusionFilterDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransfusionFilterData_DisplayName() {
		return (EAttribute)transfusionFilterDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransfusionFilterData_Options() {
		return (EReference)transfusionFilterDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransfusionResult() {
		return transfusionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransfusionResult_SerialVersionUID() {
		return (EAttribute)transfusionResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransfusionResult_TransfusionId() {
		return (EAttribute)transfusionResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransfusionResult_PersonDocument() {
		return (EAttribute)transfusionResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransfusionResult_PersonCompleteName() {
		return (EAttribute)transfusionResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransfusionResult_TransfusionDate() {
		return (EReference)transfusionResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransfusionResult_TransfusionState() {
		return (EAttribute)transfusionResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransfusionResult__TransfusionResult() {
		return transfusionResultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransfusionResult__TransfusionResult__String_String_String_Date_String() {
		return transfusionResultEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransfusionResult_TransfusionResult() {
		return transfusionResult_TransfusionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransfusionSearch() {
		return transfusionSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransfusionSearch_SerialVersionUID() {
		return (EAttribute)transfusionSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransfusionSearch_Person() {
		return (EAttribute)transfusionSearchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransfusionSearch_From() {
		return (EReference)transfusionSearchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransfusionSearch_To() {
		return (EReference)transfusionSearchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransfusionSearch__TransfusionSearch() {
		return transfusionSearchEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransfusionSearch__TransfusionSearch__String_Date_Date() {
		return transfusionSearchEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransfusionSearch_TransfusionSearch() {
		return transfusionSearch_TransfusionSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactory getDatatypesFactory() {
		return (DatatypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataEventEClass = createEClass(DATA_EVENT);
		createEAttribute(dataEventEClass, DATA_EVENT__SERIAL_VERSION_UID);
		createEReference(dataEventEClass, DATA_EVENT__EVENT);
		createEAttribute(dataEventEClass, DATA_EVENT__SEVERITY);

		dataCodeEClass = createEClass(DATA_CODE);
		createEAttribute(dataCodeEClass, DATA_CODE__SERIAL_VERSION_UID);
		createEAttribute(dataCodeEClass, DATA_CODE__CODE);
		createEAttribute(dataCodeEClass, DATA_CODE__DISPLAY_NAME);
		createEAttribute(dataCodeEClass, DATA_CODE__DESCRIPTION);

		dataBankEClass = createEClass(DATA_BANK);
		createEAttribute(dataBankEClass, DATA_BANK__CODE);
		createEAttribute(dataBankEClass, DATA_BANK__NAME);
		createEReference(dataBankEClass, DATA_BANK__INSTITUTION);
		createEAttribute(dataBankEClass, DATA_BANK__ADDRESS);
		createEAttribute(dataBankEClass, DATA_BANK__HOUR);
		createEAttribute(dataBankEClass, DATA_BANK__TELEPHONE);
		createEAttribute(dataBankEClass, DATA_BANK__EMAIL);
		createEAttribute(dataBankEClass, DATA_BANK__INFORMATION);
		createEReference(dataBankEClass, DATA_BANK__LATITUDE);
		createEReference(dataBankEClass, DATA_BANK__LONGITUDE);
		createEOperation(dataBankEClass, DATA_BANK___EQUALS__OBJECT);

		dataInstitutionEClass = createEClass(DATA_INSTITUTION);
		createEAttribute(dataInstitutionEClass, DATA_INSTITUTION__SERIAL_VERSION_UID);
		createEAttribute(dataInstitutionEClass, DATA_INSTITUTION__CODE);
		createEAttribute(dataInstitutionEClass, DATA_INSTITUTION__NAME);
		createEReference(dataInstitutionEClass, DATA_INSTITUTION__BANKS);
		createEAttribute(dataInstitutionEClass, DATA_INSTITUTION__ADDRESS);
		createEAttribute(dataInstitutionEClass, DATA_INSTITUTION__HOUR);
		createEAttribute(dataInstitutionEClass, DATA_INSTITUTION__TELEPHONE);
		createEAttribute(dataInstitutionEClass, DATA_INSTITUTION__EMAIL);
		createEAttribute(dataInstitutionEClass, DATA_INSTITUTION__INFORMATION);
		createEReference(dataInstitutionEClass, DATA_INSTITUTION__LATITUDE);
		createEReference(dataInstitutionEClass, DATA_INSTITUTION__LONGITUDE);

		dataBank_equalsEClass = createEClass(DATA_BANK_EQUALS);

		dataBloodABOTypeEClass = createEClass(DATA_BLOOD_ABO_TYPE);
		createEAttribute(dataBloodABOTypeEClass, DATA_BLOOD_ABO_TYPE__SERIAL_VERSION_UID);
		createEAttribute(dataBloodABOTypeEClass, DATA_BLOOD_ABO_TYPE__CODE);
		createEAttribute(dataBloodABOTypeEClass, DATA_BLOOD_ABO_TYPE__DISPLAY_NAME);

		dataBloodTypeEClass = createEClass(DATA_BLOOD_TYPE);
		createEAttribute(dataBloodTypeEClass, DATA_BLOOD_TYPE__SERIAL_VERSION_UID);
		createEAttribute(dataBloodTypeEClass, DATA_BLOOD_TYPE__CODE);
		createEAttribute(dataBloodTypeEClass, DATA_BLOOD_TYPE__DISPLAY_NAME);

		dataCampaignEClass = createEClass(DATA_CAMPAIGN);
		createEAttribute(dataCampaignEClass, DATA_CAMPAIGN__SERIAL_VERSION_UID);
		createEAttribute(dataCampaignEClass, DATA_CAMPAIGN__ID);
		createEAttribute(dataCampaignEClass, DATA_CAMPAIGN__TITLE);
		createEAttribute(dataCampaignEClass, DATA_CAMPAIGN__SUBTITLE);
		createEAttribute(dataCampaignEClass, DATA_CAMPAIGN__SUMMARY);
		createEAttribute(dataCampaignEClass, DATA_CAMPAIGN__TEXT);
		createEAttribute(dataCampaignEClass, DATA_CAMPAIGN__DATE);
		createEAttribute(dataCampaignEClass, DATA_CAMPAIGN__IMAGE);

		dataCityEClass = createEClass(DATA_CITY);
		createEAttribute(dataCityEClass, DATA_CITY__CODE);
		createEAttribute(dataCityEClass, DATA_CITY__NAME);
		createEAttribute(dataCityEClass, DATA_CITY__ID);
		createEOperation(dataCityEClass, DATA_CITY___EQUALS__OBJECT);

		dataCity_equalsEClass = createEClass(DATA_CITY_EQUALS);

		dataCountryEClass = createEClass(DATA_COUNTRY);
		createEAttribute(dataCountryEClass, DATA_COUNTRY__SERIAL_VERSION_UID);
		createEAttribute(dataCountryEClass, DATA_COUNTRY__CODE);
		createEAttribute(dataCountryEClass, DATA_COUNTRY__DISPLAY_NAME);

		dataDocumentTypeEClass = createEClass(DATA_DOCUMENT_TYPE);
		createEAttribute(dataDocumentTypeEClass, DATA_DOCUMENT_TYPE__SERIAL_VERSION_UID);
		createEAttribute(dataDocumentTypeEClass, DATA_DOCUMENT_TYPE__CODE);
		createEAttribute(dataDocumentTypeEClass, DATA_DOCUMENT_TYPE__DISPLAY_NAME);

		dataDonationEClass = createEClass(DATA_DONATION);
		createEAttribute(dataDonationEClass, DATA_DONATION__SERIAL_VERSION_UID);
		createEAttribute(dataDonationEClass, DATA_DONATION__NAME);
		createEAttribute(dataDonationEClass, DATA_DONATION__DATE);
		createEReference(dataDonationEClass, DATA_DONATION__BANK);
		createEReference(dataDonationEClass, DATA_DONATION__INSTITUTION);
		createEReference(dataDonationEClass, DATA_DONATION__PERSON);
		createEReference(dataDonationEClass, DATA_DONATION__DATA_DONOR_TYPE);
		createEAttribute(dataDonationEClass, DATA_DONATION__STATE);
		createEReference(dataDonationEClass, DATA_DONATION__BLOOD_ABO_TYPE);
		createEReference(dataDonationEClass, DATA_DONATION__BLOOD_DTYPE);
		createEReference(dataDonationEClass, DATA_DONATION__FAIL);
		createEReference(dataDonationEClass, DATA_DONATION__LAB_RESULTS);
		createEReference(dataDonationEClass, DATA_DONATION__EVENTS);
		createEReference(dataDonationEClass, DATA_DONATION__EXTRACTION_TIME_BEGIN);
		createEReference(dataDonationEClass, DATA_DONATION__EXTRACTION_TIME_END);
		createEOperation(dataDonationEClass, DATA_DONATION___DATA_DONATION);
		createEOperation(dataDonationEClass, DATA_DONATION___IS_APPROVED);
		createEOperation(dataDonationEClass, DATA_DONATION___IS_STATE_DEFINED);

		dataPersonEClass = createEClass(DATA_PERSON);
		createEAttribute(dataPersonEClass, DATA_PERSON__SERIAL_VERSION_UID);
		createEAttribute(dataPersonEClass, DATA_PERSON__ID);
		createEAttribute(dataPersonEClass, DATA_PERSON__FIRST_NAME);
		createEAttribute(dataPersonEClass, DATA_PERSON__SECOND_NAME);
		createEAttribute(dataPersonEClass, DATA_PERSON__FIRST_LAST_NAME);
		createEAttribute(dataPersonEClass, DATA_PERSON__SECOND_LAST_NAME);
		createEAttribute(dataPersonEClass, DATA_PERSON__DOCUMENT_COUNTRY);
		createEAttribute(dataPersonEClass, DATA_PERSON__DOCUMENT_TYPE);
		createEAttribute(dataPersonEClass, DATA_PERSON__DOCUMENT_NUMBER);
		createEAttribute(dataPersonEClass, DATA_PERSON__BIRTHDAY_DATE);
		createEReference(dataPersonEClass, DATA_PERSON__STATE);
		createEReference(dataPersonEClass, DATA_PERSON__CITY);
		createEAttribute(dataPersonEClass, DATA_PERSON__ADDRESS);
		createEAttribute(dataPersonEClass, DATA_PERSON__TELEPHONE);
		createEAttribute(dataPersonEClass, DATA_PERSON__EMAIL);
		createEReference(dataPersonEClass, DATA_PERSON__BLOOD_TYPE);
		createEAttribute(dataPersonEClass, DATA_PERSON__ABLE_TO_DONATE);
		createEAttribute(dataPersonEClass, DATA_PERSON__IMAGE);
		createEAttribute(dataPersonEClass, DATA_PERSON__ALLOW_NOTIFICATION_NEED_DONOR);
		createEAttribute(dataPersonEClass, DATA_PERSON__ALLOW_NOTIFICATION_ABLE_TO_DONATE);
		createEOperation(dataPersonEClass, DATA_PERSON___GET_FULL_NAME);

		dataStateEClass = createEClass(DATA_STATE);
		createEAttribute(dataStateEClass, DATA_STATE__ID);
		createEAttribute(dataStateEClass, DATA_STATE__CODE);
		createEAttribute(dataStateEClass, DATA_STATE__NAME);
		createEOperation(dataStateEClass, DATA_STATE___EQUALS__OBJECT);

		dataState_equalsEClass = createEClass(DATA_STATE_EQUALS);

		dataPerson_getFullNameEClass = createEClass(DATA_PERSON_GET_FULL_NAME);

		dataDonationDonorTypeEClass = createEClass(DATA_DONATION_DONOR_TYPE);
		createEAttribute(dataDonationDonorTypeEClass, DATA_DONATION_DONOR_TYPE__SERIAL_VERSION_UID);
		createEAttribute(dataDonationDonorTypeEClass, DATA_DONATION_DONOR_TYPE__CODE);
		createEAttribute(dataDonationDonorTypeEClass, DATA_DONATION_DONOR_TYPE__DISPLAY_NAME);

		dataDonationFailEClass = createEClass(DATA_DONATION_FAIL);
		createEAttribute(dataDonationFailEClass, DATA_DONATION_FAIL__SERIAL_VERSION_UID);
		createEAttribute(dataDonationFailEClass, DATA_DONATION_FAIL__CODE);
		createEAttribute(dataDonationFailEClass, DATA_DONATION_FAIL__DISPLAY_NAME);
		createEReference(dataDonationFailEClass, DATA_DONATION_FAIL__DATE);
		createEReference(dataDonationFailEClass, DATA_DONATION_FAIL__CAUSE);
		createEAttribute(dataDonationFailEClass, DATA_DONATION_FAIL__REJECTION_TYPE);
		createEOperation(dataDonationFailEClass, DATA_DONATION_FAIL___DATA_DONATION_FAIL);

		dataDonationFailCauseEClass = createEClass(DATA_DONATION_FAIL_CAUSE);
		createEAttribute(dataDonationFailCauseEClass, DATA_DONATION_FAIL_CAUSE__SERIAL_VERSION_UID);
		createEAttribute(dataDonationFailCauseEClass, DATA_DONATION_FAIL_CAUSE__CODE);
		createEAttribute(dataDonationFailCauseEClass, DATA_DONATION_FAIL_CAUSE__DISPLAY_NAME);

		dataDonationFail_DataDonationFailEClass = createEClass(DATA_DONATION_FAIL_DATA_DONATION_FAIL);

		dataLaboratoryResultEClass = createEClass(DATA_LABORATORY_RESULT);
		createEAttribute(dataLaboratoryResultEClass, DATA_LABORATORY_RESULT__SERIAL_VERSION_UID);
		createEReference(dataLaboratoryResultEClass, DATA_LABORATORY_RESULT__ANALYSIS);
		createEAttribute(dataLaboratoryResultEClass, DATA_LABORATORY_RESULT__BANK);
		createEReference(dataLaboratoryResultEClass, DATA_LABORATORY_RESULT__DATE);
		createEReference(dataLaboratoryResultEClass, DATA_LABORATORY_RESULT__RESPONSIBLE_PERSON);
		createEAttribute(dataLaboratoryResultEClass, DATA_LABORATORY_RESULT__RESULT);

		dataResponsiblePersonEClass = createEClass(DATA_RESPONSIBLE_PERSON);
		createEAttribute(dataResponsiblePersonEClass, DATA_RESPONSIBLE_PERSON__ID);
		createEAttribute(dataResponsiblePersonEClass, DATA_RESPONSIBLE_PERSON__FIRST_NAME);
		createEAttribute(dataResponsiblePersonEClass, DATA_RESPONSIBLE_PERSON__SECOND_NAME);
		createEAttribute(dataResponsiblePersonEClass, DATA_RESPONSIBLE_PERSON__FIRST_LAST_NAME);
		createEAttribute(dataResponsiblePersonEClass, DATA_RESPONSIBLE_PERSON__SECOND_LAST_NAME);
		createEAttribute(dataResponsiblePersonEClass, DATA_RESPONSIBLE_PERSON__DOCUMENT_COUNTRY);
		createEAttribute(dataResponsiblePersonEClass, DATA_RESPONSIBLE_PERSON__DOCUMENT_TYPE);
		createEAttribute(dataResponsiblePersonEClass, DATA_RESPONSIBLE_PERSON__DOCUMENT_NUMBER);
		createEOperation(dataResponsiblePersonEClass, DATA_RESPONSIBLE_PERSON___GET_FULL_NAME);

		dataResponsiblePerson_getFullNameEClass = createEClass(DATA_RESPONSIBLE_PERSON_GET_FULL_NAME);

		dataDonationEventEClass = createEClass(DATA_DONATION_EVENT);

		dataDonation_DataDonationEClass = createEClass(DATA_DONATION_DATA_DONATION);

		dataDonation_isApprovedEClass = createEClass(DATA_DONATION_IS_APPROVED);

		dataDonation_isStateDefinedEClass = createEClass(DATA_DONATION_IS_STATE_DEFINED);

		dataInstitutionCenterEClass = createEClass(DATA_INSTITUTION_CENTER);
		createEAttribute(dataInstitutionCenterEClass, DATA_INSTITUTION_CENTER__SERIAL_VERSION_UID);

		dataProductEClass = createEClass(DATA_PRODUCT);
		createEAttribute(dataProductEClass, DATA_PRODUCT__SERIAL_VERSION_UID);
		createEAttribute(dataProductEClass, DATA_PRODUCT__CODE);
		createEAttribute(dataProductEClass, DATA_PRODUCT__DISPLAY);
		createEReference(dataProductEClass, DATA_PRODUCT__DONATION);

		dataProductTypeEClass = createEClass(DATA_PRODUCT_TYPE);
		createEAttribute(dataProductTypeEClass, DATA_PRODUCT_TYPE__SERIAL_VERSION_UID);
		createEAttribute(dataProductTypeEClass, DATA_PRODUCT_TYPE__CODE);
		createEAttribute(dataProductTypeEClass, DATA_PRODUCT_TYPE__DISPLAY);

		dataResponseEClass = createEClass(DATA_RESPONSE);
		createEAttribute(dataResponseEClass, DATA_RESPONSE__CODE);
		createEAttribute(dataResponseEClass, DATA_RESPONSE__ERROR_MESSAGE);

		dataStockEClass = createEClass(DATA_STOCK);
		createEAttribute(dataStockEClass, DATA_STOCK__SERIAL_VERSION_UID);
		createEReference(dataStockEClass, DATA_STOCK__BANK);
		createEReference(dataStockEClass, DATA_STOCK__PRODUCTS);

		dataStockProductTypeEClass = createEClass(DATA_STOCK_PRODUCT_TYPE);
		createEReference(dataStockProductTypeEClass, DATA_STOCK_PRODUCT_TYPE__BLOOD_TYPES);

		dataStockProductTypeBloodTypeEClass = createEClass(DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE);
		createEAttribute(dataStockProductTypeBloodTypeEClass, DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE__COUNT);

		dataTransfusionEClass = createEClass(DATA_TRANSFUSION);
		createEAttribute(dataTransfusionEClass, DATA_TRANSFUSION__SERIAL_VERSION_UID);
		createEAttribute(dataTransfusionEClass, DATA_TRANSFUSION__NAME);
		createEAttribute(dataTransfusionEClass, DATA_TRANSFUSION__DATE);
		createEReference(dataTransfusionEClass, DATA_TRANSFUSION__BANK);
		createEReference(dataTransfusionEClass, DATA_TRANSFUSION__INSTITUTION);
		createEAttribute(dataTransfusionEClass, DATA_TRANSFUSION__VOLUME);
		createEReference(dataTransfusionEClass, DATA_TRANSFUSION__PERSON);
		createEReference(dataTransfusionEClass, DATA_TRANSFUSION__ASSOCIATED_DONATION);
		createEReference(dataTransfusionEClass, DATA_TRANSFUSION__DATA_PRODUCT);
		createEReference(dataTransfusionEClass, DATA_TRANSFUSION__LABORATORY_RESULTS);
		createEReference(dataTransfusionEClass, DATA_TRANSFUSION__EVENTS);
		createEReference(dataTransfusionEClass, DATA_TRANSFUSION__RESPONSIBLE_TRANSFUSION_PERSON);

		dataTransfusionEventEClass = createEClass(DATA_TRANSFUSION_EVENT);

		dataUnitEClass = createEClass(DATA_UNIT);
		createEAttribute(dataUnitEClass, DATA_UNIT__SERIAL_VERSION_UID);
		createEReference(dataUnitEClass, DATA_UNIT__ID);
		createEReference(dataUnitEClass, DATA_UNIT__DONATION_ID);
		createEAttribute(dataUnitEClass, DATA_UNIT__CODE);
		createEAttribute(dataUnitEClass, DATA_UNIT__INSTITUTION);
		createEAttribute(dataUnitEClass, DATA_UNIT__INSTITUTION_CODE);
		createEReference(dataUnitEClass, DATA_UNIT__PRODUCT_TYPE);
		createEReference(dataUnitEClass, DATA_UNIT__BLOOD_TYPE);

		dataUserEClass = createEClass(DATA_USER);
		createEAttribute(dataUserEClass, DATA_USER__PERSON_ID);
		createEReference(dataUserEClass, DATA_USER__BANKS);

		donationFilterDataEClass = createEClass(DONATION_FILTER_DATA);
		createEAttribute(donationFilterDataEClass, DONATION_FILTER_DATA__CODE);
		createEAttribute(donationFilterDataEClass, DONATION_FILTER_DATA__DISPLAY_NAME);
		createEReference(donationFilterDataEClass, DONATION_FILTER_DATA__OPTIONS);

		donationResultEClass = createEClass(DONATION_RESULT);
		createEAttribute(donationResultEClass, DONATION_RESULT__SERIAL_VERSION_UID);
		createEAttribute(donationResultEClass, DONATION_RESULT__DONATION_ID);
		createEAttribute(donationResultEClass, DONATION_RESULT__PERSON_DOCUMENT);
		createEAttribute(donationResultEClass, DONATION_RESULT__PERSON_COMPLETE_NAME);
		createEReference(donationResultEClass, DONATION_RESULT__DONATION_DATE);
		createEAttribute(donationResultEClass, DONATION_RESULT__DONATION_STATE);
		createEOperation(donationResultEClass, DONATION_RESULT___DONATION_RESULT);
		createEOperation(donationResultEClass, DONATION_RESULT___DONATION_RESULT__STRING_STRING_STRING_DATE_STRING);

		donationResult_DonationResultEClass = createEClass(DONATION_RESULT_DONATION_RESULT);

		donationSearchEClass = createEClass(DONATION_SEARCH);
		createEAttribute(donationSearchEClass, DONATION_SEARCH__SERIAL_VERSION_UID);
		createEAttribute(donationSearchEClass, DONATION_SEARCH__PERSON);
		createEReference(donationSearchEClass, DONATION_SEARCH__FROM);
		createEReference(donationSearchEClass, DONATION_SEARCH__TO);
		createEOperation(donationSearchEClass, DONATION_SEARCH___DONATION_SEARCH);
		createEOperation(donationSearchEClass, DONATION_SEARCH___DONATION_SEARCH__STRING_DATE_DATE);

		donationSearch_DonationSearchEClass = createEClass(DONATION_SEARCH_DONATION_SEARCH);

		donationsStatisticsDataEClass = createEClass(DONATIONS_STATISTICS_DATA);
		createEAttribute(donationsStatisticsDataEClass, DONATIONS_STATISTICS_DATA__SERIAL_VERSION_UID);
		createEAttribute(donationsStatisticsDataEClass, DONATIONS_STATISTICS_DATA__TYPE);
		createEAttribute(donationsStatisticsDataEClass, DONATIONS_STATISTICS_DATA__FROM_DATE);
		createEAttribute(donationsStatisticsDataEClass, DONATIONS_STATISTICS_DATA__TO_DATE);
		createEAttribute(donationsStatisticsDataEClass, DONATIONS_STATISTICS_DATA__INSTITUTION_ID);
		createEAttribute(donationsStatisticsDataEClass, DONATIONS_STATISTICS_DATA__BLOOD_BANK_ID);
		createEReference(donationsStatisticsDataEClass, DONATIONS_STATISTICS_DATA__FILTERS);
		createEReference(donationsStatisticsDataEClass, DONATIONS_STATISTICS_DATA__DISTINGUISH);

		loginDataEClass = createEClass(LOGIN_DATA);
		createEAttribute(loginDataEClass, LOGIN_DATA__USER);
		createEAttribute(loginDataEClass, LOGIN_DATA__PASSWORD);

		mailDataEClass = createEClass(MAIL_DATA);
		createEReference(mailDataEClass, MAIL_DATA__MESSAGE_OPTION);
		createEReference(mailDataEClass, MAIL_DATA__BLOOD_TYPE);
		createEAttribute(mailDataEClass, MAIL_DATA__SUBJECT);
		createEAttribute(mailDataEClass, MAIL_DATA__TEXT);

		messageOptionDataEClass = createEClass(MESSAGE_OPTION_DATA);
		createEAttribute(messageOptionDataEClass, MESSAGE_OPTION_DATA__SERIAL_VERSION_UID);
		createEAttribute(messageOptionDataEClass, MESSAGE_OPTION_DATA__CODE);
		createEAttribute(messageOptionDataEClass, MESSAGE_OPTION_DATA__DISPLAY_NAME);

		transfusionFilterDataEClass = createEClass(TRANSFUSION_FILTER_DATA);
		createEAttribute(transfusionFilterDataEClass, TRANSFUSION_FILTER_DATA__CODE);
		createEAttribute(transfusionFilterDataEClass, TRANSFUSION_FILTER_DATA__DISPLAY_NAME);
		createEReference(transfusionFilterDataEClass, TRANSFUSION_FILTER_DATA__OPTIONS);

		transfusionResultEClass = createEClass(TRANSFUSION_RESULT);
		createEAttribute(transfusionResultEClass, TRANSFUSION_RESULT__SERIAL_VERSION_UID);
		createEAttribute(transfusionResultEClass, TRANSFUSION_RESULT__TRANSFUSION_ID);
		createEAttribute(transfusionResultEClass, TRANSFUSION_RESULT__PERSON_DOCUMENT);
		createEAttribute(transfusionResultEClass, TRANSFUSION_RESULT__PERSON_COMPLETE_NAME);
		createEReference(transfusionResultEClass, TRANSFUSION_RESULT__TRANSFUSION_DATE);
		createEAttribute(transfusionResultEClass, TRANSFUSION_RESULT__TRANSFUSION_STATE);
		createEOperation(transfusionResultEClass, TRANSFUSION_RESULT___TRANSFUSION_RESULT);
		createEOperation(transfusionResultEClass, TRANSFUSION_RESULT___TRANSFUSION_RESULT__STRING_STRING_STRING_DATE_STRING);

		transfusionResult_TransfusionResultEClass = createEClass(TRANSFUSION_RESULT_TRANSFUSION_RESULT);

		transfusionSearchEClass = createEClass(TRANSFUSION_SEARCH);
		createEAttribute(transfusionSearchEClass, TRANSFUSION_SEARCH__SERIAL_VERSION_UID);
		createEAttribute(transfusionSearchEClass, TRANSFUSION_SEARCH__PERSON);
		createEReference(transfusionSearchEClass, TRANSFUSION_SEARCH__FROM);
		createEReference(transfusionSearchEClass, TRANSFUSION_SEARCH__TO);
		createEOperation(transfusionSearchEClass, TRANSFUSION_SEARCH___TRANSFUSION_SEARCH);
		createEOperation(transfusionSearchEClass, TRANSFUSION_SEARCH___TRANSFUSION_SEARCH__STRING_DATE_DATE);

		transfusionSearch_TransfusionSearchEClass = createEClass(TRANSFUSION_SEARCH_TRANSFUSION_SEARCH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IoPackage theIoPackage = (IoPackage)EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI);
		ConstantsPackage theConstantsPackage = (ConstantsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstantsPackage.eNS_URI);
		LangPackage theLangPackage = (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataEventEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataCodeEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataInstitutionEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataBloodABOTypeEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataBloodTypeEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataCampaignEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataCountryEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataDocumentTypeEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataDonationEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataPersonEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataDonationDonorTypeEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataDonationFailEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataDonationFailCauseEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataLaboratoryResultEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataInstitutionCenterEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataProductEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataProductTypeEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataStockEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataStockProductTypeEClass.getESuperTypes().add(this.getDataProductType());
		dataStockProductTypeEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataStockProductTypeBloodTypeEClass.getESuperTypes().add(this.getDataBloodType());
		dataStockProductTypeBloodTypeEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataTransfusionEClass.getESuperTypes().add(theIoPackage.getSerializable());
		dataTransfusionEventEClass.getESuperTypes().add(this.getDataEvent());
		dataUnitEClass.getESuperTypes().add(theIoPackage.getSerializable());
		donationResultEClass.getESuperTypes().add(theIoPackage.getSerializable());
		donationSearchEClass.getESuperTypes().add(theIoPackage.getSerializable());
		donationsStatisticsDataEClass.getESuperTypes().add(theIoPackage.getSerializable());
		messageOptionDataEClass.getESuperTypes().add(theIoPackage.getSerializable());
		transfusionResultEClass.getESuperTypes().add(theIoPackage.getSerializable());
		transfusionSearchEClass.getESuperTypes().add(theIoPackage.getSerializable());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataEventEClass, DataEvent.class, "DataEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataEvent_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "3438561495575100047L", 1, 1, DataEvent.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataEvent_Event(), this.getDataCode(), null, "event", null, 1, 1, DataEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataEvent_Severity(), theConstantsPackage.getDataEventSeverityEnum(), "severity", null, 1, 1, DataEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataCodeEClass, DataCode.class, "DataCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCode_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "1L", 1, 1, DataCode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCode_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCode_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, DataCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCode_Description(), ecorePackage.getEString(), "description", null, 1, 1, DataCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataBankEClass, DataBank.class, "DataBank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataBank_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataBank_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_Institution(), this.getDataInstitution(), null, "institution", null, 1, 1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataBank_Address(), ecorePackage.getEString(), "address", null, 1, 1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataBank_Hour(), ecorePackage.getEString(), "hour", null, 1, 1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataBank_Telephone(), ecorePackage.getEString(), "telephone", null, 1, 1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataBank_Email(), ecorePackage.getEString(), "email", null, 1, 1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataBank_Information(), ecorePackage.getEString(), "information", null, 1, 1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_Latitude(), theLangPackage.getDouble(), null, "latitude", null, 1, 1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataBank_Longitude(), theLangPackage.getDouble(), null, "longitude", null, 1, 1, DataBank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getDataBank__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theLangPackage.getObject(), "obj", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dataInstitutionEClass, DataInstitution.class, "DataInstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataInstitution_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "9176360583037903695L", 1, 1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataInstitution_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataInstitution_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataInstitution_Banks(), this.getDataBank(), null, "banks", null, 1, -1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataInstitution_Address(), ecorePackage.getEString(), "address", null, 1, 1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataInstitution_Hour(), ecorePackage.getEString(), "hour", null, 1, 1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataInstitution_Telephone(), ecorePackage.getEString(), "telephone", null, 1, 1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataInstitution_Email(), ecorePackage.getEString(), "email", null, 1, 1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataInstitution_Information(), ecorePackage.getEString(), "information", null, 1, 1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataInstitution_Latitude(), theLangPackage.getDouble(), null, "latitude", null, 1, 1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataInstitution_Longitude(), theLangPackage.getDouble(), null, "longitude", null, 1, 1, DataInstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataBank_equalsEClass, DataBank_equals.class, "DataBank_equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataBloodABOTypeEClass, DataBloodABOType.class, "DataBloodABOType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataBloodABOType_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "9176360583037903695L", 1, 1, DataBloodABOType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataBloodABOType_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataBloodABOType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataBloodABOType_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, DataBloodABOType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataBloodTypeEClass, DataBloodType.class, "DataBloodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataBloodType_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "-2877220618048351894L", 1, 1, DataBloodType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataBloodType_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataBloodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataBloodType_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, DataBloodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataCampaignEClass, DataCampaign.class, "DataCampaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCampaign_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "1L", 1, 1, DataCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCampaign_Id(), ecorePackage.getEString(), "id", null, 1, 1, DataCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCampaign_Title(), ecorePackage.getEString(), "title", null, 1, 1, DataCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCampaign_Subtitle(), ecorePackage.getEString(), "subtitle", null, 1, 1, DataCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCampaign_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, DataCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCampaign_Text(), ecorePackage.getEString(), "text", null, 1, 1, DataCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCampaign_Date(), ecorePackage.getEString(), "date", null, 1, 1, DataCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCampaign_Image(), ecorePackage.getEByte(), "image", null, 1, -1, DataCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataCityEClass, DataCity.class, "DataCity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCity_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCity_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCity_Id(), ecorePackage.getEInt(), "id", null, 1, 1, DataCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDataCity__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theLangPackage.getObject(), "obj", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dataCity_equalsEClass, DataCity_equals.class, "DataCity_equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataCountryEClass, DataCountry.class, "DataCountry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCountry_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "8478407607248259772L", 1, 1, DataCountry.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCountry_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCountry_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, DataCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataDocumentTypeEClass, DataDocumentType.class, "DataDocumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDocumentType_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "-2144963005633424428L", 1, 1, DataDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDocumentType_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDocumentType_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, DataDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataDonationEClass, DataDonation.class, "DataDonation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDonation_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "-4260250837335930498L", 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDonation_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDonation_Date(), ecorePackage.getEString(), "date", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonation_Bank(), this.getDataBank(), null, "bank", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonation_Institution(), this.getDataInstitution(), null, "institution", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonation_Person(), this.getDataPerson(), null, "person", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonation_DataDonorType(), this.getDataDonationDonorType(), null, "dataDonorType", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDonation_State(), theConstantsPackage.getDataDonationStateEnum(), "state", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonation_BloodABOType(), this.getDataBloodABOType(), null, "bloodABOType", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonation_BloodDType(), this.getDataBloodType(), null, "bloodDType", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonation_Fail(), this.getDataDonationFail(), null, "fail", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonation_LabResults(), this.getDataLaboratoryResult(), null, "labResults", null, 1, -1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataDonation_Events(), this.getDataDonationEvent(), null, "events", null, 1, -1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataDonation_ExtractionTimeBegin(), theUtilPackage.getDate(), null, "extractionTimeBegin", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonation_ExtractionTimeEnd(), theUtilPackage.getDate(), null, "extractionTimeEnd", null, 1, 1, DataDonation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getDataDonation__DataDonation(), this.getDataDonation(), "DataDonation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDataDonation__IsApproved(), ecorePackage.getEBoolean(), "isApproved", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDataDonation__IsStateDefined(), ecorePackage.getEBoolean(), "isStateDefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dataPersonEClass, DataPerson.class, "DataPerson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataPerson_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "1221320030601695117L", 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_Id(), ecorePackage.getEString(), "id", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_SecondName(), ecorePackage.getEString(), "secondName", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_FirstLastName(), ecorePackage.getEString(), "firstLastName", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_SecondLastName(), ecorePackage.getEString(), "secondLastName", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_DocumentCountry(), ecorePackage.getEString(), "documentCountry", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_DocumentType(), ecorePackage.getEString(), "documentType", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_DocumentNumber(), ecorePackage.getEString(), "documentNumber", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_BirthdayDate(), ecorePackage.getEString(), "birthdayDate", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPerson_State(), this.getDataState(), null, "state", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPerson_City(), this.getDataCity(), null, "city", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_Address(), ecorePackage.getEString(), "address", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_Telephone(), ecorePackage.getEString(), "telephone", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_Email(), ecorePackage.getEString(), "email", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPerson_BloodType(), this.getDataBloodType(), null, "bloodType", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_AbleToDonate(), ecorePackage.getEBoolean(), "ableToDonate", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_Image(), ecorePackage.getEByte(), "image", null, 1, -1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_AllowNotificationNeedDonor(), ecorePackage.getEBoolean(), "allowNotificationNeedDonor", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataPerson_AllowNotificationAbleToDonate(), ecorePackage.getEBoolean(), "allowNotificationAbleToDonate", null, 1, 1, DataPerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getDataPerson__GetFullName(), ecorePackage.getEString(), "getFullName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dataStateEClass, DataState.class, "DataState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataState_Id(), ecorePackage.getEInt(), "id", null, 1, 1, DataState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataState_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataState_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDataState__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theLangPackage.getObject(), "obj", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dataState_equalsEClass, DataState_equals.class, "DataState_equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataPerson_getFullNameEClass, DataPerson_getFullName.class, "DataPerson_getFullName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataDonationDonorTypeEClass, DataDonationDonorType.class, "DataDonationDonorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDonationDonorType_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "9176360583037903695L", 1, 1, DataDonationDonorType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDonationDonorType_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataDonationDonorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDonationDonorType_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, DataDonationDonorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataDonationFailEClass, DataDonationFail.class, "DataDonationFail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDonationFail_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "-43336076178896132L", 1, 1, DataDonationFail.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDonationFail_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataDonationFail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDonationFail_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, DataDonationFail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonationFail_Date(), theUtilPackage.getDate(), null, "date", null, 1, 1, DataDonationFail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDonationFail_Cause(), this.getDataDonationFailCause(), null, "cause", null, 1, 1, DataDonationFail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDonationFail_RejectionType(), theConstantsPackage.getDataDonationRejectionType(), "rejectionType", null, 1, 1, DataDonationFail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getDataDonationFail__DataDonationFail(), this.getDataDonationFail(), "DataDonationFail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dataDonationFailCauseEClass, DataDonationFailCause.class, "DataDonationFailCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDonationFailCause_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "-7396699063760857579L", 1, 1, DataDonationFailCause.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDonationFailCause_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataDonationFailCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDonationFailCause_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, DataDonationFailCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataDonationFail_DataDonationFailEClass, DataDonationFail_DataDonationFail.class, "DataDonationFail_DataDonationFail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataLaboratoryResultEClass, DataLaboratoryResult.class, "DataLaboratoryResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataLaboratoryResult_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "7214257230098571156L", 1, 1, DataLaboratoryResult.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataLaboratoryResult_Analysis(), this.getDataCode(), null, "analysis", null, 1, 1, DataLaboratoryResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataLaboratoryResult_Bank(), ecorePackage.getEString(), "bank", null, 1, 1, DataLaboratoryResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataLaboratoryResult_Date(), theUtilPackage.getDate(), null, "date", null, 1, 1, DataLaboratoryResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataLaboratoryResult_ResponsiblePerson(), this.getDataResponsiblePerson(), null, "responsiblePerson", null, 1, 1, DataLaboratoryResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataLaboratoryResult_Result(), ecorePackage.getEBoolean(), "result", null, 1, 1, DataLaboratoryResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataResponsiblePersonEClass, DataResponsiblePerson.class, "DataResponsiblePerson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataResponsiblePerson_Id(), ecorePackage.getEString(), "id", null, 1, 1, DataResponsiblePerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataResponsiblePerson_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, DataResponsiblePerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataResponsiblePerson_SecondName(), ecorePackage.getEString(), "secondName", null, 1, 1, DataResponsiblePerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataResponsiblePerson_FirstLastName(), ecorePackage.getEString(), "firstLastName", null, 1, 1, DataResponsiblePerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataResponsiblePerson_SecondLastName(), ecorePackage.getEString(), "secondLastName", null, 1, 1, DataResponsiblePerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataResponsiblePerson_DocumentCountry(), ecorePackage.getEString(), "documentCountry", null, 1, 1, DataResponsiblePerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataResponsiblePerson_DocumentType(), ecorePackage.getEString(), "documentType", null, 1, 1, DataResponsiblePerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataResponsiblePerson_DocumentNumber(), ecorePackage.getEString(), "documentNumber", null, 1, 1, DataResponsiblePerson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getDataResponsiblePerson__GetFullName(), ecorePackage.getEString(), "getFullName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dataResponsiblePerson_getFullNameEClass, DataResponsiblePerson_getFullName.class, "DataResponsiblePerson_getFullName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataDonationEventEClass, DataDonationEvent.class, "DataDonationEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataDonation_DataDonationEClass, DataDonation_DataDonation.class, "DataDonation_DataDonation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataDonation_isApprovedEClass, DataDonation_isApproved.class, "DataDonation_isApproved", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataDonation_isStateDefinedEClass, DataDonation_isStateDefined.class, "DataDonation_isStateDefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataInstitutionCenterEClass, DataInstitutionCenter.class, "DataInstitutionCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataInstitutionCenter_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "-170025396614404717L", 1, 1, DataInstitutionCenter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataProductEClass, DataProduct.class, "DataProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataProduct_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "2826091238509417952L", 1, 1, DataProduct.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataProduct_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataProduct_Display(), ecorePackage.getEString(), "display", null, 1, 1, DataProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataProduct_Donation(), this.getDataDonation(), null, "donation", null, 1, 1, DataProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataProductTypeEClass, DataProductType.class, "DataProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataProductType_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "-8452443889912017469L", 1, 1, DataProductType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataProductType_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataProductType_Display(), ecorePackage.getEString(), "display", null, 1, 1, DataProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataResponseEClass, DataResponse.class, "DataResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataResponse_Code(), ecorePackage.getEInt(), "code", null, 1, 1, DataResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataResponse_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 1, 1, DataResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataStockEClass, DataStock.class, "DataStock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataStock_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "-979972334865660149L", 1, 1, DataStock.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataStock_Bank(), this.getDataBank(), null, "bank", null, 1, 1, DataStock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataStock_Products(), this.getDataStockProductType(), null, "products", null, 1, -1, DataStock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataStockProductTypeEClass, DataStockProductType.class, "DataStockProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataStockProductType_BloodTypes(), this.getDataStockProductTypeBloodType(), null, "bloodTypes", null, 1, -1, DataStockProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataStockProductTypeBloodTypeEClass, DataStockProductTypeBloodType.class, "DataStockProductTypeBloodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataStockProductTypeBloodType_Count(), ecorePackage.getEInt(), "count", null, 1, 1, DataStockProductTypeBloodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataTransfusionEClass, DataTransfusion.class, "DataTransfusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTransfusion_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "3440653129221915523L", 1, 1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTransfusion_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTransfusion_Date(), ecorePackage.getEString(), "date", null, 1, 1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataTransfusion_Bank(), this.getDataBank(), null, "bank", null, 1, 1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataTransfusion_Institution(), this.getDataInstitution(), null, "institution", null, 1, 1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTransfusion_Volume(), ecorePackage.getEString(), "volume", null, 1, 1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataTransfusion_Person(), this.getDataPerson(), null, "person", null, 1, 1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataTransfusion_AssociatedDonation(), this.getDataDonation(), null, "associatedDonation", null, 1, 1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataTransfusion_DataProduct(), this.getDataProductType(), null, "dataProduct", null, 1, 1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataTransfusion_LaboratoryResults(), this.getDataLaboratoryResult(), null, "laboratoryResults", null, 1, -1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTransfusion_Events(), this.getDataTransfusionEvent(), null, "events", null, 1, -1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTransfusion_ResponsibleTransfusionPerson(), this.getDataResponsiblePerson(), null, "responsibleTransfusionPerson", null, 1, 1, DataTransfusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataTransfusionEventEClass, DataTransfusionEvent.class, "DataTransfusionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataUnitEClass, DataUnit.class, "DataUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataUnit_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "-5470280587666900962L", 1, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataUnit_Id(), theLangPackage.getLong(), null, "id", null, 1, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataUnit_DonationId(), theLangPackage.getLong(), null, "donationId", null, 1, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataUnit_Code(), ecorePackage.getEString(), "code", null, 1, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataUnit_Institution(), ecorePackage.getEString(), "institution", null, 1, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataUnit_InstitutionCode(), ecorePackage.getEString(), "institutionCode", null, 1, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataUnit_ProductType(), this.getDataProductType(), null, "productType", null, 1, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataUnit_BloodType(), this.getDataBloodType(), null, "bloodType", null, 1, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataUserEClass, DataUser.class, "DataUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataUser_PersonId(), ecorePackage.getEString(), "personId", null, 1, 1, DataUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataUser_Banks(), this.getDataBank(), null, "banks", null, 1, -1, DataUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(donationFilterDataEClass, DonationFilterData.class, "DonationFilterData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDonationFilterData_Code(), ecorePackage.getEString(), "code", null, 1, 1, DonationFilterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationFilterData_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, DonationFilterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDonationFilterData_Options(), this.getDonationFilterData(), null, "options", null, 1, -1, DonationFilterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(donationResultEClass, DonationResult.class, "DonationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDonationResult_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "9023483717165649475L", 1, 1, DonationResult.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationResult_DonationId(), ecorePackage.getEString(), "donationId", null, 1, 1, DonationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationResult_PersonDocument(), ecorePackage.getEString(), "personDocument", null, 1, 1, DonationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationResult_PersonCompleteName(), ecorePackage.getEString(), "personCompleteName", null, 1, 1, DonationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDonationResult_DonationDate(), theUtilPackage.getDate(), null, "donationDate", null, 1, 1, DonationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationResult_DonationState(), ecorePackage.getEString(), "donationState", null, 1, 1, DonationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getDonationResult__DonationResult(), this.getDonationResult(), "DonationResult", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDonationResult__DonationResult__String_String_String_Date_String(), this.getDonationResult(), "DonationResult", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "donationId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "personDocument", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "personCompleteName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theUtilPackage.getDate(), "donationDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "donationState", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(donationResult_DonationResultEClass, DonationResult_DonationResult.class, "DonationResult_DonationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(donationSearchEClass, DonationSearch.class, "DonationSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDonationSearch_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "2329098338218896354L", 1, 1, DonationSearch.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationSearch_Person(), ecorePackage.getEString(), "person", null, 1, 1, DonationSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDonationSearch_From(), theUtilPackage.getDate(), null, "from", null, 1, 1, DonationSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDonationSearch_To(), theUtilPackage.getDate(), null, "to", null, 1, 1, DonationSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getDonationSearch__DonationSearch(), this.getDonationSearch(), "DonationSearch", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDonationSearch__DonationSearch__String_Date_Date(), this.getDonationSearch(), "DonationSearch", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "person", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theUtilPackage.getDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theUtilPackage.getDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(donationSearch_DonationSearchEClass, DonationSearch_DonationSearch.class, "DonationSearch_DonationSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(donationsStatisticsDataEClass, DonationsStatisticsData.class, "DonationsStatisticsData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDonationsStatisticsData_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "1L", 1, 1, DonationsStatisticsData.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationsStatisticsData_Type(), ecorePackage.getEString(), "type", null, 1, 1, DonationsStatisticsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationsStatisticsData_FromDate(), ecorePackage.getEString(), "fromDate", null, 1, 1, DonationsStatisticsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationsStatisticsData_ToDate(), ecorePackage.getEString(), "toDate", null, 1, 1, DonationsStatisticsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationsStatisticsData_InstitutionId(), ecorePackage.getEString(), "institutionId", null, 1, 1, DonationsStatisticsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDonationsStatisticsData_BloodBankId(), ecorePackage.getEString(), "bloodBankId", null, 1, 1, DonationsStatisticsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDonationsStatisticsData_Filters(), this.getDonationFilterData(), null, "filters", null, 1, -1, DonationsStatisticsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDonationsStatisticsData_Distinguish(), this.getDonationFilterData(), null, "distinguish", null, 1, -1, DonationsStatisticsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loginDataEClass, LoginData.class, "LoginData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoginData_User(), ecorePackage.getEString(), "user", null, 1, 1, LoginData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLoginData_Password(), ecorePackage.getEString(), "password", null, 1, 1, LoginData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mailDataEClass, MailData.class, "MailData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMailData_MessageOption(), this.getMessageOptionData(), null, "messageOption", null, 1, 1, MailData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMailData_BloodType(), this.getDataBloodType(), null, "bloodType", null, 1, 1, MailData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMailData_Subject(), ecorePackage.getEString(), "subject", null, 1, 1, MailData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMailData_Text(), ecorePackage.getEString(), "text", null, 1, 1, MailData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageOptionDataEClass, MessageOptionData.class, "MessageOptionData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageOptionData_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "9176360583037903695L", 1, 1, MessageOptionData.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessageOptionData_Code(), ecorePackage.getEString(), "code", null, 1, 1, MessageOptionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessageOptionData_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, MessageOptionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transfusionFilterDataEClass, TransfusionFilterData.class, "TransfusionFilterData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransfusionFilterData_Code(), ecorePackage.getEString(), "code", null, 1, 1, TransfusionFilterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransfusionFilterData_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, TransfusionFilterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransfusionFilterData_Options(), this.getTransfusionFilterData(), null, "options", null, 1, -1, TransfusionFilterData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transfusionResultEClass, TransfusionResult.class, "TransfusionResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransfusionResult_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "9023483717165649475L", 1, 1, TransfusionResult.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransfusionResult_TransfusionId(), ecorePackage.getEString(), "transfusionId", null, 1, 1, TransfusionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransfusionResult_PersonDocument(), ecorePackage.getEString(), "personDocument", null, 1, 1, TransfusionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransfusionResult_PersonCompleteName(), ecorePackage.getEString(), "personCompleteName", null, 1, 1, TransfusionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransfusionResult_TransfusionDate(), theUtilPackage.getDate(), null, "transfusionDate", null, 1, 1, TransfusionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransfusionResult_TransfusionState(), ecorePackage.getEString(), "transfusionState", null, 1, 1, TransfusionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTransfusionResult__TransfusionResult(), this.getTransfusionResult(), "TransfusionResult", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTransfusionResult__TransfusionResult__String_String_String_Date_String(), this.getTransfusionResult(), "TransfusionResult", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "transfusionId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "personDocument", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "personCompleteName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theUtilPackage.getDate(), "transfusionDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "transfusionState", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transfusionResult_TransfusionResultEClass, TransfusionResult_TransfusionResult.class, "TransfusionResult_TransfusionResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transfusionSearchEClass, TransfusionSearch.class, "TransfusionSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransfusionSearch_SerialVersionUID(), ecorePackage.getELong(), "serialVersionUID", "2329098338218896354L", 1, 1, TransfusionSearch.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransfusionSearch_Person(), ecorePackage.getEString(), "person", null, 1, 1, TransfusionSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransfusionSearch_From(), theUtilPackage.getDate(), null, "from", null, 1, 1, TransfusionSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransfusionSearch_To(), theUtilPackage.getDate(), null, "to", null, 1, 1, TransfusionSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTransfusionSearch__TransfusionSearch(), this.getTransfusionSearch(), "TransfusionSearch", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTransfusionSearch__TransfusionSearch__String_Date_Date(), this.getTransfusionSearch(), "TransfusionSearch", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "person", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theUtilPackage.getDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theUtilPackage.getDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transfusionSearch_TransfusionSearchEClass, TransfusionSearch_TransfusionSearch.class, "TransfusionSearch_TransfusionSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// duplicates
		createDuplicatesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";	
		addAnnotation
		  (dataStockProductTypeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (dataStockProductTypeBloodTypeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (dataTransfusionEventEClass, 
		   source, 
		   new String[] {
		   });
	}

} //DatatypesPackageImpl
