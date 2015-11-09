/**
 */
package org.hemologica.datatypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataCampaignImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataCampaignImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataCampaignImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataCampaignImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataCampaignImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataCampaignImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataCampaignImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataCampaignImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCampaignImpl extends MinimalEObjectImpl.Container implements DataCampaign {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected String subtitle = SUBTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

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
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<Byte> image;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_CAMPAIGN;
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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_CAMPAIGN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_CAMPAIGN__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(String newSubtitle) {
		String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_CAMPAIGN__SUBTITLE, oldSubtitle, subtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_CAMPAIGN__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_CAMPAIGN__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_CAMPAIGN__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Byte> getImage() {
		if (image == null) {
			image = new EDataTypeUniqueEList<Byte>(Byte.class, this, DatatypesPackage.DATA_CAMPAIGN__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DATA_CAMPAIGN__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DATA_CAMPAIGN__ID:
				return getId();
			case DatatypesPackage.DATA_CAMPAIGN__TITLE:
				return getTitle();
			case DatatypesPackage.DATA_CAMPAIGN__SUBTITLE:
				return getSubtitle();
			case DatatypesPackage.DATA_CAMPAIGN__SUMMARY:
				return getSummary();
			case DatatypesPackage.DATA_CAMPAIGN__TEXT:
				return getText();
			case DatatypesPackage.DATA_CAMPAIGN__DATE:
				return getDate();
			case DatatypesPackage.DATA_CAMPAIGN__IMAGE:
				return getImage();
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
			case DatatypesPackage.DATA_CAMPAIGN__ID:
				setId((String)newValue);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__TITLE:
				setTitle((String)newValue);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__SUBTITLE:
				setSubtitle((String)newValue);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__SUMMARY:
				setSummary((String)newValue);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__TEXT:
				setText((String)newValue);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__DATE:
				setDate((String)newValue);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends Byte>)newValue);
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
			case DatatypesPackage.DATA_CAMPAIGN__ID:
				setId(ID_EDEFAULT);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__SUBTITLE:
				setSubtitle(SUBTITLE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_CAMPAIGN__IMAGE:
				getImage().clear();
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
			case DatatypesPackage.DATA_CAMPAIGN__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DATA_CAMPAIGN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DatatypesPackage.DATA_CAMPAIGN__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DatatypesPackage.DATA_CAMPAIGN__SUBTITLE:
				return SUBTITLE_EDEFAULT == null ? subtitle != null : !SUBTITLE_EDEFAULT.equals(subtitle);
			case DatatypesPackage.DATA_CAMPAIGN__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case DatatypesPackage.DATA_CAMPAIGN__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case DatatypesPackage.DATA_CAMPAIGN__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case DatatypesPackage.DATA_CAMPAIGN__IMAGE:
				return image != null && !image.isEmpty();
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
		result.append(", id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", subtitle: ");
		result.append(subtitle);
		result.append(", summary: ");
		result.append(summary);
		result.append(", text: ");
		result.append(text);
		result.append(", date: ");
		result.append(date);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //DataCampaignImpl
