
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para COCT_MT230100UV.PackagedMedicine complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT230100UV.PackagedMedicine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:hl7-org:v3}TN" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="formCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="lotNumberText" type="{urn:hl7-org:v3}ST" minOccurs="0"/>
 *         &lt;element name="capacityQuantity" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;element name="capTypeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="asManufacturedProduct" type="{urn:hl7-org:v3}COCT_MT230100UV.ManufacturedProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="asSuperContent" type="{urn:hl7-org:v3}COCT_MT230100UV.SuperContent" minOccurs="0"/>
 *         &lt;element name="subContent" type="{urn:hl7-org:v3}COCT_MT230100UV.SubContent" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClassContainer" />
 *       &lt;attribute name="determinerCode" use="required" type="{urn:hl7-org:v3}EntityDeterminer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT230100UV.PackagedMedicine", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "name",
    "formCode",
    "lotNumberText",
    "capacityQuantity",
    "capTypeCode",
    "asManufacturedProduct",
    "asSuperContent",
    "subContent"
})
public class COCTMT230100UVPackagedMedicine {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected II id;
    protected CE code;
    protected List<TN> name;
    protected CE formCode;
    protected ST lotNumberText;
    protected PQ capacityQuantity;
    protected CE capTypeCode;
    @XmlElement(nillable = true)
    protected List<COCTMT230100UVManufacturedProduct> asManufacturedProduct;
    @XmlElementRef(name = "asSuperContent", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT230100UVSuperContent> asSuperContent;
    @XmlElementRef(name = "subContent", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT230100UVSubContent> subContent;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected EntityClassContainer classCode;
    @XmlAttribute(name = "determinerCode", required = true)
    protected String determinerCode;

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
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TN }
     * 
     * 
     */
    public List<TN> getName() {
        if (name == null) {
            name = new ArrayList<TN>();
        }
        return this.name;
    }

    /**
     * Obtiene el valor de la propiedad formCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getFormCode() {
        return formCode;
    }

    /**
     * Define el valor de la propiedad formCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setFormCode(CE value) {
        this.formCode = value;
    }

    /**
     * Obtiene el valor de la propiedad lotNumberText.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLotNumberText() {
        return lotNumberText;
    }

    /**
     * Define el valor de la propiedad lotNumberText.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLotNumberText(ST value) {
        this.lotNumberText = value;
    }

    /**
     * Obtiene el valor de la propiedad capacityQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getCapacityQuantity() {
        return capacityQuantity;
    }

    /**
     * Define el valor de la propiedad capacityQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setCapacityQuantity(PQ value) {
        this.capacityQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad capTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCapTypeCode() {
        return capTypeCode;
    }

    /**
     * Define el valor de la propiedad capTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCapTypeCode(CE value) {
        this.capTypeCode = value;
    }

    /**
     * Gets the value of the asManufacturedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asManufacturedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsManufacturedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVManufacturedProduct }
     * 
     * 
     */
    public List<COCTMT230100UVManufacturedProduct> getAsManufacturedProduct() {
        if (asManufacturedProduct == null) {
            asManufacturedProduct = new ArrayList<COCTMT230100UVManufacturedProduct>();
        }
        return this.asManufacturedProduct;
    }

    /**
     * Obtiene el valor de la propiedad asSuperContent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSuperContent }{@code >}
     *     
     */
    public JAXBElement<COCTMT230100UVSuperContent> getAsSuperContent() {
        return asSuperContent;
    }

    /**
     * Define el valor de la propiedad asSuperContent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSuperContent }{@code >}
     *     
     */
    public void setAsSuperContent(JAXBElement<COCTMT230100UVSuperContent> value) {
        this.asSuperContent = value;
    }

    /**
     * Obtiene el valor de la propiedad subContent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSubContent }{@code >}
     *     
     */
    public JAXBElement<COCTMT230100UVSubContent> getSubContent() {
        return subContent;
    }

    /**
     * Define el valor de la propiedad subContent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSubContent }{@code >}
     *     
     */
    public void setSubContent(JAXBElement<COCTMT230100UVSubContent> value) {
        this.subContent = value;
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

    /**
     * Obtiene el valor de la propiedad classCode.
     * 
     * @return
     *     possible object is
     *     {@link EntityClassContainer }
     *     
     */
    public EntityClassContainer getClassCode() {
        return classCode;
    }

    /**
     * Define el valor de la propiedad classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityClassContainer }
     *     
     */
    public void setClassCode(EntityClassContainer value) {
        this.classCode = value;
    }

    /**
     * Obtiene el valor de la propiedad determinerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminerCode() {
        return determinerCode;
    }

    /**
     * Define el valor de la propiedad determinerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminerCode(String value) {
        this.determinerCode = value;
    }

}