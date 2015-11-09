/**
 */
package org.hemologica.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DatatypesPackage;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.MessageOptionData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mail Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.MailDataImpl#getMessageOption <em>Message Option</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.MailDataImpl#getBloodType <em>Blood Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.MailDataImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.MailDataImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MailDataImpl extends MinimalEObjectImpl.Container implements MailData {
	/**
	 * The cached value of the '{@link #getMessageOption() <em>Message Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageOption()
	 * @generated
	 * @ordered
	 */
	protected MessageOptionData messageOption;

	/**
	 * The cached value of the '{@link #getBloodType() <em>Blood Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodType()
	 * @generated
	 * @ordered
	 */
	protected DataBloodType bloodType;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MailDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.MAIL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOptionData getMessageOption() {
		if (messageOption != null && messageOption.eIsProxy()) {
			InternalEObject oldMessageOption = (InternalEObject)messageOption;
			messageOption = (MessageOptionData)eResolveProxy(oldMessageOption);
			if (messageOption != oldMessageOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.MAIL_DATA__MESSAGE_OPTION, oldMessageOption, messageOption));
			}
		}
		return messageOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOptionData basicGetMessageOption() {
		return messageOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageOption(MessageOptionData newMessageOption) {
		MessageOptionData oldMessageOption = messageOption;
		messageOption = newMessageOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.MAIL_DATA__MESSAGE_OPTION, oldMessageOption, messageOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBloodType getBloodType() {
		if (bloodType != null && bloodType.eIsProxy()) {
			InternalEObject oldBloodType = (InternalEObject)bloodType;
			bloodType = (DataBloodType)eResolveProxy(oldBloodType);
			if (bloodType != oldBloodType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.MAIL_DATA__BLOOD_TYPE, oldBloodType, bloodType));
			}
		}
		return bloodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBloodType basicGetBloodType() {
		return bloodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloodType(DataBloodType newBloodType) {
		DataBloodType oldBloodType = bloodType;
		bloodType = newBloodType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.MAIL_DATA__BLOOD_TYPE, oldBloodType, bloodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.MAIL_DATA__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.MAIL_DATA__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.MAIL_DATA__MESSAGE_OPTION:
				if (resolve) return getMessageOption();
				return basicGetMessageOption();
			case DatatypesPackage.MAIL_DATA__BLOOD_TYPE:
				if (resolve) return getBloodType();
				return basicGetBloodType();
			case DatatypesPackage.MAIL_DATA__SUBJECT:
				return getSubject();
			case DatatypesPackage.MAIL_DATA__TEXT:
				return getText();
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
			case DatatypesPackage.MAIL_DATA__MESSAGE_OPTION:
				setMessageOption((MessageOptionData)newValue);
				return;
			case DatatypesPackage.MAIL_DATA__BLOOD_TYPE:
				setBloodType((DataBloodType)newValue);
				return;
			case DatatypesPackage.MAIL_DATA__SUBJECT:
				setSubject((String)newValue);
				return;
			case DatatypesPackage.MAIL_DATA__TEXT:
				setText((String)newValue);
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
			case DatatypesPackage.MAIL_DATA__MESSAGE_OPTION:
				setMessageOption((MessageOptionData)null);
				return;
			case DatatypesPackage.MAIL_DATA__BLOOD_TYPE:
				setBloodType((DataBloodType)null);
				return;
			case DatatypesPackage.MAIL_DATA__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case DatatypesPackage.MAIL_DATA__TEXT:
				setText(TEXT_EDEFAULT);
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
			case DatatypesPackage.MAIL_DATA__MESSAGE_OPTION:
				return messageOption != null;
			case DatatypesPackage.MAIL_DATA__BLOOD_TYPE:
				return bloodType != null;
			case DatatypesPackage.MAIL_DATA__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case DatatypesPackage.MAIL_DATA__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
		result.append(" (subject: ");
		result.append(subject);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //MailDataImpl
