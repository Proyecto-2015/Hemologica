
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PRPA_IN201302UV02.MCCI_MT000100UV01.Message complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PRPA_IN201302UV02.MCCI_MT000100UV01.Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/>
 *         &lt;element name="creationTime" type="{urn:hl7-org:v3}TS"/>
 *         &lt;element name="securityText" type="{urn:hl7-org:v3}ST" minOccurs="0"/>
 *         &lt;element name="versionCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;element name="interactionId" type="{urn:hl7-org:v3}II"/>
 *         &lt;element name="profileId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processingCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="processingModeCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="acceptAckCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="sequenceNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="attachmentText" type="{urn:hl7-org:v3}ED" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="receiver" type="{urn:hl7-org:v3}MCCI_MT000100UV01.Receiver" maxOccurs="unbounded"/>
 *         &lt;element name="respondTo" type="{urn:hl7-org:v3}MCCI_MT000100UV01.RespondTo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sender" type="{urn:hl7-org:v3}MCCI_MT000100UV01.Sender"/>
 *         &lt;element name="attentionLine" type="{urn:hl7-org:v3}MCCI_MT000100UV01.AttentionLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="controlActProcess" type="{urn:hl7-org:v3}PRPA_IN201302UV02.MFMI_MT700701UV01.ControlActProcess"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_IN201302UV02.MCCI_MT000100UV01.Message", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "creationTime",
    "securityText",
    "versionCode",
    "interactionId",
    "profileId",
    "processingCode",
    "processingModeCode",
    "acceptAckCode",
    "sequenceNumber",
    "attachmentText",
    "receiver",
    "respondTo",
    "sender",
    "attentionLine",
    "controlActProcess"
})
@XmlSeeAlso({
    PRPAIN201302UV02 .class
})
public class PRPAIN201302UV02MCCIMT000100UV01Message {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected TS creationTime;
    protected ST securityText;
    protected CS versionCode;
    @XmlElement(required = true)
    protected II interactionId;
    protected List<II> profileId;
    @XmlElement(required = true)
    protected CS processingCode;
    @XmlElement(required = true)
    protected CS processingModeCode;
    @XmlElement(required = true)
    protected CS acceptAckCode;
    protected INT sequenceNumber;
    protected List<ED> attachmentText;
    @XmlElement(required = true)
    protected List<MCCIMT000100UV01Receiver> receiver;
    @XmlElement(nillable = true)
    protected List<MCCIMT000100UV01RespondTo> respondTo;
    @XmlElement(required = true)
    protected MCCIMT000100UV01Sender sender;
    @XmlElement(nillable = true)
    protected List<MCCIMT000100UV01AttentionLine> attentionLine;
    @XmlElement(required = true)
    protected PRPAIN201302UV02MFMIMT700701UV01ControlActProcess controlActProcess;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Obtiene el valor de la propiedad typeId.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Define el valor de la propiedad typeId.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad creationTime.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getCreationTime() {
        return creationTime;
    }

    /**
     * Define el valor de la propiedad creationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setCreationTime(TS value) {
        this.creationTime = value;
    }

    /**
     * Obtiene el valor de la propiedad securityText.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getSecurityText() {
        return securityText;
    }

    /**
     * Define el valor de la propiedad securityText.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setSecurityText(ST value) {
        this.securityText = value;
    }

    /**
     * Obtiene el valor de la propiedad versionCode.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getVersionCode() {
        return versionCode;
    }

    /**
     * Define el valor de la propiedad versionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setVersionCode(CS value) {
        this.versionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad interactionId.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getInteractionId() {
        return interactionId;
    }

    /**
     * Define el valor de la propiedad interactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setInteractionId(II value) {
        this.interactionId = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getProfileId() {
        if (profileId == null) {
            profileId = new ArrayList<II>();
        }
        return this.profileId;
    }

    /**
     * Obtiene el valor de la propiedad processingCode.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getProcessingCode() {
        return processingCode;
    }

    /**
     * Define el valor de la propiedad processingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setProcessingCode(CS value) {
        this.processingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad processingModeCode.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getProcessingModeCode() {
        return processingModeCode;
    }

    /**
     * Define el valor de la propiedad processingModeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setProcessingModeCode(CS value) {
        this.processingModeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad acceptAckCode.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getAcceptAckCode() {
        return acceptAckCode;
    }

    /**
     * Define el valor de la propiedad acceptAckCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setAcceptAckCode(CS value) {
        this.acceptAckCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define el valor de la propiedad sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setSequenceNumber(INT value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the attachmentText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ED }
     * 
     * 
     */
    public List<ED> getAttachmentText() {
        if (attachmentText == null) {
            attachmentText = new ArrayList<ED>();
        }
        return this.attachmentText;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT000100UV01Receiver }
     * 
     * 
     */
    public List<MCCIMT000100UV01Receiver> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<MCCIMT000100UV01Receiver>();
        }
        return this.receiver;
    }

    /**
     * Gets the value of the respondTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respondTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespondTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT000100UV01RespondTo }
     * 
     * 
     */
    public List<MCCIMT000100UV01RespondTo> getRespondTo() {
        if (respondTo == null) {
            respondTo = new ArrayList<MCCIMT000100UV01RespondTo>();
        }
        return this.respondTo;
    }

    /**
     * Obtiene el valor de la propiedad sender.
     * 
     * @return
     *     possible object is
     *     {@link MCCIMT000100UV01Sender }
     *     
     */
    public MCCIMT000100UV01Sender getSender() {
        return sender;
    }

    /**
     * Define el valor de la propiedad sender.
     * 
     * @param value
     *     allowed object is
     *     {@link MCCIMT000100UV01Sender }
     *     
     */
    public void setSender(MCCIMT000100UV01Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the attentionLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attentionLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttentionLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT000100UV01AttentionLine }
     * 
     * 
     */
    public List<MCCIMT000100UV01AttentionLine> getAttentionLine() {
        if (attentionLine == null) {
            attentionLine = new ArrayList<MCCIMT000100UV01AttentionLine>();
        }
        return this.attentionLine;
    }

    /**
     * Obtiene el valor de la propiedad controlActProcess.
     * 
     * @return
     *     possible object is
     *     {@link PRPAIN201302UV02MFMIMT700701UV01ControlActProcess }
     *     
     */
    public PRPAIN201302UV02MFMIMT700701UV01ControlActProcess getControlActProcess() {
        return controlActProcess;
    }

    /**
     * Define el valor de la propiedad controlActProcess.
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAIN201302UV02MFMIMT700701UV01ControlActProcess }
     *     
     */
    public void setControlActProcess(PRPAIN201302UV02MFMIMT700701UV01ControlActProcess value) {
        this.controlActProcess = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

}
