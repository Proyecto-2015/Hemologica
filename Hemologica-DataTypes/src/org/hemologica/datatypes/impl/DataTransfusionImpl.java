/**
 */
package org.hemologica.datatypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionEvent;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Transfusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getAssociatedDonation <em>Associated Donation</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getDataProduct <em>Data Product</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getLaboratoryResults <em>Laboratory Results</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionImpl#getResponsibleTransfusionPerson <em>Responsible Transfusion Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTransfusionImpl extends MinimalEObjectImpl.Container implements DataTransfusion {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "3440653129221915523L" is not valid.

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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected DataBank bank;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected DataInstitution institution;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected String volume = VOLUME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected DataPerson person;

	/**
	 * The cached value of the '{@link #getAssociatedDonation() <em>Associated Donation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedDonation()
	 * @generated
	 * @ordered
	 */
	protected DataDonation associatedDonation;

	/**
	 * The cached value of the '{@link #getDataProduct() <em>Data Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProduct()
	 * @generated
	 * @ordered
	 */
	protected DataProductType dataProduct;

	/**
	 * The cached value of the '{@link #getLaboratoryResults() <em>Laboratory Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaboratoryResults()
	 * @generated
	 * @ordered
	 */
	protected EList<DataLaboratoryResult> laboratoryResults;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTransfusionEvent> events;

	/**
	 * The cached value of the '{@link #getResponsibleTransfusionPerson() <em>Responsible Transfusion Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleTransfusionPerson()
	 * @generated
	 * @ordered
	 */
	protected DataResponsiblePerson responsibleTransfusionPerson;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTransfusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_TRANSFUSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_TRANSFUSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_TRANSFUSION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBank getBank() {
		if (bank != null && bank.eIsProxy()) {
			InternalEObject oldBank = (InternalEObject)bank;
			bank = (DataBank)eResolveProxy(oldBank);
			if (bank != oldBank) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_TRANSFUSION__BANK, oldBank, bank));
			}
		}
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBank basicGetBank() {
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBank(DataBank newBank) {
		DataBank oldBank = bank;
		bank = newBank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_TRANSFUSION__BANK, oldBank, bank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInstitution getInstitution() {
		if (institution != null && institution.eIsProxy()) {
			InternalEObject oldInstitution = (InternalEObject)institution;
			institution = (DataInstitution)eResolveProxy(oldInstitution);
			if (institution != oldInstitution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_TRANSFUSION__INSTITUTION, oldInstitution, institution));
			}
		}
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInstitution basicGetInstitution() {
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitution(DataInstitution newInstitution) {
		DataInstitution oldInstitution = institution;
		institution = newInstitution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_TRANSFUSION__INSTITUTION, oldInstitution, institution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(String newVolume) {
		String oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_TRANSFUSION__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPerson getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (DataPerson)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_TRANSFUSION__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPerson basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(DataPerson newPerson) {
		DataPerson oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_TRANSFUSION__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonation getAssociatedDonation() {
		if (associatedDonation != null && associatedDonation.eIsProxy()) {
			InternalEObject oldAssociatedDonation = (InternalEObject)associatedDonation;
			associatedDonation = (DataDonation)eResolveProxy(oldAssociatedDonation);
			if (associatedDonation != oldAssociatedDonation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_TRANSFUSION__ASSOCIATED_DONATION, oldAssociatedDonation, associatedDonation));
			}
		}
		return associatedDonation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonation basicGetAssociatedDonation() {
		return associatedDonation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedDonation(DataDonation newAssociatedDonation) {
		DataDonation oldAssociatedDonation = associatedDonation;
		associatedDonation = newAssociatedDonation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_TRANSFUSION__ASSOCIATED_DONATION, oldAssociatedDonation, associatedDonation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProductType getDataProduct() {
		if (dataProduct != null && dataProduct.eIsProxy()) {
			InternalEObject oldDataProduct = (InternalEObject)dataProduct;
			dataProduct = (DataProductType)eResolveProxy(oldDataProduct);
			if (dataProduct != oldDataProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_TRANSFUSION__DATA_PRODUCT, oldDataProduct, dataProduct));
			}
		}
		return dataProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProductType basicGetDataProduct() {
		return dataProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProduct(DataProductType newDataProduct) {
		DataProductType oldDataProduct = dataProduct;
		dataProduct = newDataProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_TRANSFUSION__DATA_PRODUCT, oldDataProduct, dataProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataLaboratoryResult> getLaboratoryResults() {
		if (laboratoryResults == null) {
			laboratoryResults = new EObjectResolvingEList<DataLaboratoryResult>(DataLaboratoryResult.class, this, DatatypesPackage.DATA_TRANSFUSION__LABORATORY_RESULTS);
		}
		return laboratoryResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTransfusionEvent> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<DataTransfusionEvent>(DataTransfusionEvent.class, this, DatatypesPackage.DATA_TRANSFUSION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResponsiblePerson getResponsibleTransfusionPerson() {
		if (responsibleTransfusionPerson != null && responsibleTransfusionPerson.eIsProxy()) {
			InternalEObject oldResponsibleTransfusionPerson = (InternalEObject)responsibleTransfusionPerson;
			responsibleTransfusionPerson = (DataResponsiblePerson)eResolveProxy(oldResponsibleTransfusionPerson);
			if (responsibleTransfusionPerson != oldResponsibleTransfusionPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_TRANSFUSION__RESPONSIBLE_TRANSFUSION_PERSON, oldResponsibleTransfusionPerson, responsibleTransfusionPerson));
			}
		}
		return responsibleTransfusionPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResponsiblePerson basicGetResponsibleTransfusionPerson() {
		return responsibleTransfusionPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleTransfusionPerson(DataResponsiblePerson newResponsibleTransfusionPerson) {
		DataResponsiblePerson oldResponsibleTransfusionPerson = responsibleTransfusionPerson;
		responsibleTransfusionPerson = newResponsibleTransfusionPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_TRANSFUSION__RESPONSIBLE_TRANSFUSION_PERSON, oldResponsibleTransfusionPerson, responsibleTransfusionPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DATA_TRANSFUSION__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DATA_TRANSFUSION__NAME:
				return getName();
			case DatatypesPackage.DATA_TRANSFUSION__DATE:
				return getDate();
			case DatatypesPackage.DATA_TRANSFUSION__BANK:
				if (resolve) return getBank();
				return basicGetBank();
			case DatatypesPackage.DATA_TRANSFUSION__INSTITUTION:
				if (resolve) return getInstitution();
				return basicGetInstitution();
			case DatatypesPackage.DATA_TRANSFUSION__VOLUME:
				return getVolume();
			case DatatypesPackage.DATA_TRANSFUSION__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case DatatypesPackage.DATA_TRANSFUSION__ASSOCIATED_DONATION:
				if (resolve) return getAssociatedDonation();
				return basicGetAssociatedDonation();
			case DatatypesPackage.DATA_TRANSFUSION__DATA_PRODUCT:
				if (resolve) return getDataProduct();
				return basicGetDataProduct();
			case DatatypesPackage.DATA_TRANSFUSION__LABORATORY_RESULTS:
				return getLaboratoryResults();
			case DatatypesPackage.DATA_TRANSFUSION__EVENTS:
				return getEvents();
			case DatatypesPackage.DATA_TRANSFUSION__RESPONSIBLE_TRANSFUSION_PERSON:
				if (resolve) return getResponsibleTransfusionPerson();
				return basicGetResponsibleTransfusionPerson();
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
			case DatatypesPackage.DATA_TRANSFUSION__NAME:
				setName((String)newValue);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__DATE:
				setDate((String)newValue);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__BANK:
				setBank((DataBank)newValue);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__INSTITUTION:
				setInstitution((DataInstitution)newValue);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__VOLUME:
				setVolume((String)newValue);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__PERSON:
				setPerson((DataPerson)newValue);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__ASSOCIATED_DONATION:
				setAssociatedDonation((DataDonation)newValue);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__DATA_PRODUCT:
				setDataProduct((DataProductType)newValue);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__LABORATORY_RESULTS:
				getLaboratoryResults().clear();
				getLaboratoryResults().addAll((Collection<? extends DataLaboratoryResult>)newValue);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends DataTransfusionEvent>)newValue);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__RESPONSIBLE_TRANSFUSION_PERSON:
				setResponsibleTransfusionPerson((DataResponsiblePerson)newValue);
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
			case DatatypesPackage.DATA_TRANSFUSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__BANK:
				setBank((DataBank)null);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__INSTITUTION:
				setInstitution((DataInstitution)null);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__PERSON:
				setPerson((DataPerson)null);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__ASSOCIATED_DONATION:
				setAssociatedDonation((DataDonation)null);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__DATA_PRODUCT:
				setDataProduct((DataProductType)null);
				return;
			case DatatypesPackage.DATA_TRANSFUSION__LABORATORY_RESULTS:
				getLaboratoryResults().clear();
				return;
			case DatatypesPackage.DATA_TRANSFUSION__EVENTS:
				getEvents().clear();
				return;
			case DatatypesPackage.DATA_TRANSFUSION__RESPONSIBLE_TRANSFUSION_PERSON:
				setResponsibleTransfusionPerson((DataResponsiblePerson)null);
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
			case DatatypesPackage.DATA_TRANSFUSION__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DATA_TRANSFUSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatatypesPackage.DATA_TRANSFUSION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case DatatypesPackage.DATA_TRANSFUSION__BANK:
				return bank != null;
			case DatatypesPackage.DATA_TRANSFUSION__INSTITUTION:
				return institution != null;
			case DatatypesPackage.DATA_TRANSFUSION__VOLUME:
				return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
			case DatatypesPackage.DATA_TRANSFUSION__PERSON:
				return person != null;
			case DatatypesPackage.DATA_TRANSFUSION__ASSOCIATED_DONATION:
				return associatedDonation != null;
			case DatatypesPackage.DATA_TRANSFUSION__DATA_PRODUCT:
				return dataProduct != null;
			case DatatypesPackage.DATA_TRANSFUSION__LABORATORY_RESULTS:
				return laboratoryResults != null && !laboratoryResults.isEmpty();
			case DatatypesPackage.DATA_TRANSFUSION__EVENTS:
				return events != null && !events.isEmpty();
			case DatatypesPackage.DATA_TRANSFUSION__RESPONSIBLE_TRANSFUSION_PERSON:
				return responsibleTransfusionPerson != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(", date: ");
		result.append(date);
		result.append(", volume: ");
		result.append(volume);
		result.append(')');
		return result.toString();
	}

} //DataTransfusionImpl
