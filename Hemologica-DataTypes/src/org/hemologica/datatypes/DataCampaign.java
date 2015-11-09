/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataCampaign#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataCampaign#getId <em>Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataCampaign#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataCampaign#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataCampaign#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataCampaign#getText <em>Text</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataCampaign#getDate <em>Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataCampaign#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataCampaign()
 * @model
 * @generated
 */
public interface DataCampaign extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"1L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataCampaign_SerialVersionUID()
	 * @model default="1L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataCampaign_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataCampaign#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataCampaign_Title()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataCampaign#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' attribute.
	 * @see #setSubtitle(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataCampaign_Subtitle()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSubtitle();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataCampaign#getSubtitle <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' attribute.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataCampaign_Summary()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataCampaign#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataCampaign_Text()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataCampaign#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataCampaign_Date()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataCampaign#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Byte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataCampaign_Image()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Byte> getImage();

} // DataCampaign
