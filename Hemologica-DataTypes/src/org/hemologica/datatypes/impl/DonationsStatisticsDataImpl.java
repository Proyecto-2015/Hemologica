/**
 */
package org.hemologica.datatypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.hemologica.datatypes.DatatypesPackage;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DonationsStatisticsData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Donations Statistics Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DonationsStatisticsDataImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationsStatisticsDataImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationsStatisticsDataImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationsStatisticsDataImpl#getToDate <em>To Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationsStatisticsDataImpl#getInstitutionId <em>Institution Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationsStatisticsDataImpl#getBloodBankId <em>Blood Bank Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationsStatisticsDataImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationsStatisticsDataImpl#getDistinguish <em>Distinguish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DonationsStatisticsDataImpl extends MinimalEObjectImpl.Container implements DonationsStatisticsData {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "1L" is not valid.

	/**
	 * The cached value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected long serialVersionUID = SERIAL_VERSION_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected String fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected String toDate = TO_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstitutionId() <em>Institution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionId()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitutionId() <em>Institution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionId()
	 * @generated
	 * @ordered
	 */
	protected String institutionId = INSTITUTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBloodBankId() <em>Blood Bank Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodBankId()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOOD_BANK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBloodBankId() <em>Blood Bank Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodBankId()
	 * @generated
	 * @ordered
	 */
	protected String bloodBankId = BLOOD_BANK_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<DonationFilterData> filters;

	/**
	 * The cached value of the '{@link #getDistinguish() <em>Distinguish</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinguish()
	 * @generated
	 * @ordered
	 */
	protected EList<DonationFilterData> distinguish;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DonationsStatisticsDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DONATIONS_STATISTICS_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATIONS_STATISTICS_DATA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDate(String newFromDate) {
		String oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATIONS_STATISTICS_DATA__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToDate() {
		return toDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDate(String newToDate) {
		String oldToDate = toDate;
		toDate = newToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATIONS_STATISTICS_DATA__TO_DATE, oldToDate, toDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstitutionId() {
		return institutionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitutionId(String newInstitutionId) {
		String oldInstitutionId = institutionId;
		institutionId = newInstitutionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATIONS_STATISTICS_DATA__INSTITUTION_ID, oldInstitutionId, institutionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBloodBankId() {
		return bloodBankId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloodBankId(String newBloodBankId) {
		String oldBloodBankId = bloodBankId;
		bloodBankId = newBloodBankId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATIONS_STATISTICS_DATA__BLOOD_BANK_ID, oldBloodBankId, bloodBankId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DonationFilterData> getFilters() {
		if (filters == null) {
			filters = new EObjectResolvingEList<DonationFilterData>(DonationFilterData.class, this, DatatypesPackage.DONATIONS_STATISTICS_DATA__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DonationFilterData> getDistinguish() {
		if (distinguish == null) {
			distinguish = new EObjectResolvingEList<DonationFilterData>(DonationFilterData.class, this, DatatypesPackage.DONATIONS_STATISTICS_DATA__DISTINGUISH);
		}
		return distinguish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__TYPE:
				return getType();
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__FROM_DATE:
				return getFromDate();
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__TO_DATE:
				return getToDate();
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__INSTITUTION_ID:
				return getInstitutionId();
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__BLOOD_BANK_ID:
				return getBloodBankId();
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__FILTERS:
				return getFilters();
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__DISTINGUISH:
				return getDistinguish();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__TYPE:
				setType((String)newValue);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__FROM_DATE:
				setFromDate((String)newValue);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__TO_DATE:
				setToDate((String)newValue);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__INSTITUTION_ID:
				setInstitutionId((String)newValue);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__BLOOD_BANK_ID:
				setBloodBankId((String)newValue);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends DonationFilterData>)newValue);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__DISTINGUISH:
				getDistinguish().clear();
				getDistinguish().addAll((Collection<? extends DonationFilterData>)newValue);
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
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__TO_DATE:
				setToDate(TO_DATE_EDEFAULT);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__INSTITUTION_ID:
				setInstitutionId(INSTITUTION_ID_EDEFAULT);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__BLOOD_BANK_ID:
				setBloodBankId(BLOOD_BANK_ID_EDEFAULT);
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__FILTERS:
				getFilters().clear();
				return;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__DISTINGUISH:
				getDistinguish().clear();
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
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__TO_DATE:
				return TO_DATE_EDEFAULT == null ? toDate != null : !TO_DATE_EDEFAULT.equals(toDate);
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__INSTITUTION_ID:
				return INSTITUTION_ID_EDEFAULT == null ? institutionId != null : !INSTITUTION_ID_EDEFAULT.equals(institutionId);
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__BLOOD_BANK_ID:
				return BLOOD_BANK_ID_EDEFAULT == null ? bloodBankId != null : !BLOOD_BANK_ID_EDEFAULT.equals(bloodBankId);
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__FILTERS:
				return filters != null && !filters.isEmpty();
			case DatatypesPackage.DONATIONS_STATISTICS_DATA__DISTINGUISH:
				return distinguish != null && !distinguish.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (serialVersionUID: ");
		result.append(serialVersionUID);
		result.append(", type: ");
		result.append(type);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", toDate: ");
		result.append(toDate);
		result.append(", institutionId: ");
		result.append(institutionId);
		result.append(", bloodBankId: ");
		result.append(bloodBankId);
		result.append(')');
		return result.toString();
	}

} //DonationsStatisticsDataImpl
