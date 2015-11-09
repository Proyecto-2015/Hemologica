/**
 */
package jdk.java.lang;

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
 * @see jdk.java.lang.LangFactory
 * @model kind="package"
 * @generated
 */
public interface LangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hemologicadatatypes/java/lang.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hemologicadatatypes.java.lang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LangPackage eINSTANCE = jdk.java.lang.impl.LangPackageImpl.init();

	/**
	 * The meta object id for the '{@link jdk.java.lang.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jdk.java.lang.impl.DoubleImpl
	 * @see jdk.java.lang.impl.LangPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 0;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jdk.java.lang.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jdk.java.lang.impl.ObjectImpl
	 * @see jdk.java.lang.impl.LangPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jdk.java.lang.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jdk.java.lang.impl.LongImpl
	 * @see jdk.java.lang.impl.LangPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 2;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link jdk.java.lang.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see jdk.java.lang.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link jdk.java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see jdk.java.lang.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link jdk.java.lang.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see jdk.java.lang.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LangFactory getLangFactory();

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
		 * The meta object literal for the '{@link jdk.java.lang.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jdk.java.lang.impl.DoubleImpl
		 * @see jdk.java.lang.impl.LangPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link jdk.java.lang.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jdk.java.lang.impl.ObjectImpl
		 * @see jdk.java.lang.impl.LangPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link jdk.java.lang.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jdk.java.lang.impl.LongImpl
		 * @see jdk.java.lang.impl.LangPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

	}

} //LangPackage
