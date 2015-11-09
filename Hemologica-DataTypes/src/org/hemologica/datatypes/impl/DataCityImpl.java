/**
 */
package org.hemologica.datatypes.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataCityImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataCityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataCityImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCityImpl extends MinimalEObjectImpl.Container implements DataCity {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_CITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_CITY__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_CITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_CITY__ID, oldId, id));
	}

	/**
	 * The cached OCL expression body for the '{@link #equals(jdk.java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equals(jdk.java.lang.Object)
	 * @generated
	 * @ordered
	 */
	protected static final String EQUALS__OBJECT__EOCL_EXP = "if(obj != null && obj instanceof DataCity){"+
"			if(((DataCity)obj).getCode() == null){"+
"				return false;"+
"			}"+
"			return ((DataCity)obj).getCode().equals(this.getCode());"+
"		}"+
"		return super.equals(obj);"+
"	";

	/**
	 * The cached OCL query for the '{@link #equals(jdk.java.lang.Object) <em>Equals</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equals(jdk.java.lang.Object)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> EQUALS__OBJECT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals(jdk.java.lang.Object obj) {
		if (EQUALS__OBJECT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DatatypesPackage.Literals.DATA_CITY, DatatypesPackage.Literals.DATA_CITY.getEAllOperations().get(0));
			try {
				EQUALS__OBJECT__EOCL_QRY = helper.createQuery(EQUALS__OBJECT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(EQUALS__OBJECT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("obj", obj);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DATA_CITY__CODE:
				return getCode();
			case DatatypesPackage.DATA_CITY__NAME:
				return getName();
			case DatatypesPackage.DATA_CITY__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatypesPackage.DATA_CITY__CODE:
				setCode((String)newValue);
				return;
			case DatatypesPackage.DATA_CITY__NAME:
				setName((String)newValue);
				return;
			case DatatypesPackage.DATA_CITY__ID:
				setId((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatatypesPackage.DATA_CITY__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_CITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_CITY__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatatypesPackage.DATA_CITY__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DatatypesPackage.DATA_CITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatatypesPackage.DATA_CITY__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DatatypesPackage.DATA_CITY___EQUALS__OBJECT:
				return equals((jdk.java.lang.Object)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} //DataCityImpl
