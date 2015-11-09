/**
 */
package jdk.java.util.impl;

import jdk.java.io.IoPackage;

import jdk.java.io.impl.IoPackageImpl;

import jdk.java.lang.LangPackage;

import jdk.java.lang.impl.LangPackageImpl;

import jdk.java.util.ArrayList;
import jdk.java.util.Date;
import jdk.java.util.List;
import jdk.java.util.UtilFactory;
import jdk.java.util.UtilPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.hemologica.constants.ConstantsPackage;

import org.hemologica.constants.impl.ConstantsPackageImpl;

import org.hemologica.datatypes.DatatypesPackage;

import org.hemologica.datatypes.impl.DatatypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilPackageImpl extends EPackageImpl implements UtilPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

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
	 * @see jdk.java.util.UtilPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilPackageImpl() {
		super(eNS_URI, UtilFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UtilPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilPackage init() {
		if (isInited) return (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Obtain or create and register package
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UtilPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IoPackage.eNS_URI) : IoPackage.eINSTANCE);
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI) : LangPackage.eINSTANCE);
		ConstantsPackageImpl theConstantsPackage = (ConstantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstantsPackage.eNS_URI) instanceof ConstantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstantsPackage.eNS_URI) : ConstantsPackage.eINSTANCE);

		// Create package meta-data objects
		theUtilPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theConstantsPackage.createPackageContents();

		// Initialize created meta-data
		theUtilPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theConstantsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilPackage.eNS_URI, theUtilPackage);
		return theUtilPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayList() {
		return arrayListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilFactory getUtilFactory() {
		return (UtilFactory)getEFactoryInstance();
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
		arrayListEClass = createEClass(ARRAY_LIST);

		dateEClass = createEClass(DATE);

		listEClass = createEClass(LIST);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(arrayListEClass, ArrayList.class, "ArrayList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listEClass, List.class, "List", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //UtilPackageImpl
