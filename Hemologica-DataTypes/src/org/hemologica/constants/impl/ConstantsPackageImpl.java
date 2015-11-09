/**
 */
package org.hemologica.constants.impl;

import jdk.java.io.IoPackage;

import jdk.java.io.impl.IoPackageImpl;

import jdk.java.lang.LangPackage;

import jdk.java.lang.impl.LangPackageImpl;

import jdk.java.util.UtilPackage;

import jdk.java.util.impl.UtilPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.hemologica.constants.ConstantsFactory;
import org.hemologica.constants.ConstantsPackage;
import org.hemologica.constants.DataDonationRejectionType;
import org.hemologica.constants.DataDonationStateEnum;
import org.hemologica.constants.DataEventSeverityEnum;

import org.hemologica.datatypes.DatatypesPackage;

import org.hemologica.datatypes.impl.DatatypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstantsPackageImpl extends EPackageImpl implements ConstantsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataDonationStateEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataDonationRejectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataEventSeverityEnumEEnum = null;

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
	 * @see org.hemologica.constants.ConstantsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstantsPackageImpl() {
		super(eNS_URI, ConstantsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstantsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstantsPackage init() {
		if (isInited) return (ConstantsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstantsPackage.eNS_URI);

		// Obtain or create and register package
		ConstantsPackageImpl theConstantsPackage = (ConstantsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstantsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstantsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);

		// Create package meta-data objects
		theConstantsPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theLangPackage.createPackageContents();

		// Initialize created meta-data
		theConstantsPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theLangPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstantsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstantsPackage.eNS_URI, theConstantsPackage);
		return theConstantsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataDonationStateEnum() {
		return dataDonationStateEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataDonationRejectionType() {
		return dataDonationRejectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataEventSeverityEnum() {
		return dataEventSeverityEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantsFactory getConstantsFactory() {
		return (ConstantsFactory)getEFactoryInstance();
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

		// Create enums
		dataDonationStateEnumEEnum = createEEnum(DATA_DONATION_STATE_ENUM);
		dataDonationRejectionTypeEEnum = createEEnum(DATA_DONATION_REJECTION_TYPE);
		dataEventSeverityEnumEEnum = createEEnum(DATA_EVENT_SEVERITY_ENUM);
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

		// Initialize enums and add enum literals
		initEEnum(dataDonationStateEnumEEnum, DataDonationStateEnum.class, "DataDonationStateEnum");

		initEEnum(dataDonationRejectionTypeEEnum, DataDonationRejectionType.class, "DataDonationRejectionType");

		initEEnum(dataEventSeverityEnumEEnum, DataEventSeverityEnum.class, "DataEventSeverityEnum");

		// Create resource
		createResource(eNS_URI);
	}

} //ConstantsPackageImpl
