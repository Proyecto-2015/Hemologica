/**
 */
package jdk.java.util;

import org.eclipse.emf.ecore.EClass;
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
 * @see jdk.java.util.UtilFactory
 * @model kind="package"
 * @generated
 */
public interface UtilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "util";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hemologicadatatypes/java/util.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hemologicadatatypes.java.util";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilPackage eINSTANCE = jdk.java.util.impl.UtilPackageImpl.init();

	/**
	 * The meta object id for the '{@link jdk.java.util.impl.ArrayListImpl <em>Array List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jdk.java.util.impl.ArrayListImpl
	 * @see jdk.java.util.impl.UtilPackageImpl#getArrayList()
	 * @generated
	 */
	int ARRAY_LIST = 0;

	/**
	 * The number of structural features of the '<em>Array List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Array List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jdk.java.util.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jdk.java.util.impl.DateImpl
	 * @see jdk.java.util.impl.UtilPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 1;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jdk.java.util.List <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jdk.java.util.List
	 * @see jdk.java.util.impl.UtilPackageImpl#getList()
	 * @generated
	 */
	int LIST = 2;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link jdk.java.util.ArrayList <em>Array List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array List</em>'.
	 * @see jdk.java.util.ArrayList
	 * @generated
	 */
	EClass getArrayList();

	/**
	 * Returns the meta object for class '{@link jdk.java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see jdk.java.util.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link jdk.java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see jdk.java.util.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilFactory getUtilFactory();

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
		 * The meta object literal for the '{@link jdk.java.util.impl.ArrayListImpl <em>Array List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jdk.java.util.impl.ArrayListImpl
		 * @see jdk.java.util.impl.UtilPackageImpl#getArrayList()
		 * @generated
		 */
		EClass ARRAY_LIST = eINSTANCE.getArrayList();

		/**
		 * The meta object literal for the '{@link jdk.java.util.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jdk.java.util.impl.DateImpl
		 * @see jdk.java.util.impl.UtilPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link jdk.java.util.List <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jdk.java.util.List
		 * @see jdk.java.util.impl.UtilPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

	}

} //UtilPackage
