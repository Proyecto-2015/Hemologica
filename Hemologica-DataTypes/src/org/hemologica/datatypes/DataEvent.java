/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import org.hemologica.constants.DataEventSeverityEnum;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataEvent#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataEvent#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataEvent()
 * @model abstract="true"
 * @generated
 */
public interface DataEvent extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"3438561495575100047L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataEvent_SerialVersionUID()
	 * @model default="3438561495575100047L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(DataCode)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataEvent_Event()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataCode getEvent();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataEvent#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(DataCode value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hemologica.constants.DataEventSeverityEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.hemologica.constants.DataEventSeverityEnum
	 * @see #setSeverity(DataEventSeverityEnum)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataEvent_Severity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataEventSeverityEnum getSeverity();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataEvent#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.hemologica.constants.DataEventSeverityEnum
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(DataEventSeverityEnum value);

} // DataEvent
