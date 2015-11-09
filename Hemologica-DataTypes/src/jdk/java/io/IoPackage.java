/**
 */
package jdk.java.io;

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
 * @see jdk.java.io.IoFactory
 * @model kind="package"
 * @generated
 */
public interface IoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "io";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hemologicadatatypes/java/io.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hemologicadatatypes.java.io";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoPackage eINSTANCE = jdk.java.io.impl.IoPackageImpl.init();

	/**
	 * The meta object id for the '{@link jdk.java.io.Serializable <em>Serializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jdk.java.io.Serializable
	 * @see jdk.java.io.impl.IoPackageImpl#getSerializable()
	 * @generated
	 */
	int SERIALIZABLE = 0;

	/**
	 * The number of structural features of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link jdk.java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable</em>'.
	 * @see jdk.java.io.Serializable
	 * @generated
	 */
	EClass getSerializable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IoFactory getIoFactory();

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
		 * The meta object literal for the '{@link jdk.java.io.Serializable <em>Serializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jdk.java.io.Serializable
		 * @see jdk.java.io.impl.IoPackageImpl#getSerializable()
		 * @generated
		 */
		EClass SERIALIZABLE = eINSTANCE.getSerializable();

	}

} //IoPackage
