/**
 */
package org.hemologica.constants.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.hemologica.constants.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstantsFactoryImpl extends EFactoryImpl implements ConstantsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstantsFactory init() {
		try {
			ConstantsFactory theConstantsFactory = (ConstantsFactory)EPackage.Registry.INSTANCE.getEFactory(ConstantsPackage.eNS_URI);
			if (theConstantsFactory != null) {
				return theConstantsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConstantsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantsFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConstantsPackage.DATA_DONATION_STATE_ENUM:
				return createDataDonationStateEnumFromString(eDataType, initialValue);
			case ConstantsPackage.DATA_DONATION_REJECTION_TYPE:
				return createDataDonationRejectionTypeFromString(eDataType, initialValue);
			case ConstantsPackage.DATA_EVENT_SEVERITY_ENUM:
				return createDataEventSeverityEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConstantsPackage.DATA_DONATION_STATE_ENUM:
				return convertDataDonationStateEnumToString(eDataType, instanceValue);
			case ConstantsPackage.DATA_DONATION_REJECTION_TYPE:
				return convertDataDonationRejectionTypeToString(eDataType, instanceValue);
			case ConstantsPackage.DATA_EVENT_SEVERITY_ENUM:
				return convertDataEventSeverityEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationStateEnum createDataDonationStateEnumFromString(EDataType eDataType, String initialValue) {
		DataDonationStateEnum result = DataDonationStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataDonationStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationRejectionType createDataDonationRejectionTypeFromString(EDataType eDataType, String initialValue) {
		DataDonationRejectionType result = DataDonationRejectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataDonationRejectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEventSeverityEnum createDataEventSeverityEnumFromString(EDataType eDataType, String initialValue) {
		DataEventSeverityEnum result = DataEventSeverityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataEventSeverityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantsPackage getConstantsPackage() {
		return (ConstantsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConstantsPackage getPackage() {
		return ConstantsPackage.eINSTANCE;
	}

} //ConstantsFactoryImpl
