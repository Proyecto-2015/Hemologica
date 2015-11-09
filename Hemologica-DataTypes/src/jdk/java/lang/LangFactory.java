/**
 */
package jdk.java.lang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jdk.java.lang.LangPackage
 * @generated
 */
public interface LangFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LangFactory eINSTANCE = jdk.java.lang.impl.LangFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double</em>'.
	 * @generated
	 */
	Double createDouble();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long</em>'.
	 * @generated
	 */
	Long createLong();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LangPackage getLangPackage();

} //LangFactory
