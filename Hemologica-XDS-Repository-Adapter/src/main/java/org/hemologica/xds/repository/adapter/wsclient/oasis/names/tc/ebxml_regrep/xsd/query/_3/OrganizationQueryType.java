
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrganizationQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrganizationQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneNumberFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddressFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParentQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}OrganizationQueryType" minOccurs="0"/&gt;
 *         &lt;element name="ChildOrganizationQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}OrganizationQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryContactQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}PersonQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationQueryType", propOrder = {
    "addressFilter",
    "telephoneNumberFilter",
    "emailAddressFilter",
    "parentQuery",
    "childOrganizationQuery",
    "primaryContactQuery"
})
public class OrganizationQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "AddressFilter")
    protected List<FilterType> addressFilter;
    @XmlElement(name = "TelephoneNumberFilter")
    protected List<FilterType> telephoneNumberFilter;
    @XmlElement(name = "EmailAddressFilter")
    protected List<FilterType> emailAddressFilter;
    @XmlElement(name = "ParentQuery")
    protected OrganizationQueryType parentQuery;
    @XmlElement(name = "ChildOrganizationQuery")
    protected List<OrganizationQueryType> childOrganizationQuery;
    @XmlElement(name = "PrimaryContactQuery")
    protected PersonQueryType primaryContactQuery;

    /**
     * Gets the value of the addressFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getAddressFilter() {
        if (addressFilter == null) {
            addressFilter = new ArrayList<FilterType>();
        }
        return this.addressFilter;
    }

    /**
     * Gets the value of the telephoneNumberFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumberFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumberFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getTelephoneNumberFilter() {
        if (telephoneNumberFilter == null) {
            telephoneNumberFilter = new ArrayList<FilterType>();
        }
        return this.telephoneNumberFilter;
    }

    /**
     * Gets the value of the emailAddressFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddressFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddressFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getEmailAddressFilter() {
        if (emailAddressFilter == null) {
            emailAddressFilter = new ArrayList<FilterType>();
        }
        return this.emailAddressFilter;
    }

    /**
     * Obtiene el valor de la propiedad parentQuery.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationQueryType }
     *     
     */
    public OrganizationQueryType getParentQuery() {
        return parentQuery;
    }

    /**
     * Define el valor de la propiedad parentQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationQueryType }
     *     
     */
    public void setParentQuery(OrganizationQueryType value) {
        this.parentQuery = value;
    }

    /**
     * Gets the value of the childOrganizationQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childOrganizationQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildOrganizationQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationQueryType }
     * 
     * 
     */
    public List<OrganizationQueryType> getChildOrganizationQuery() {
        if (childOrganizationQuery == null) {
            childOrganizationQuery = new ArrayList<OrganizationQueryType>();
        }
        return this.childOrganizationQuery;
    }

    /**
     * Obtiene el valor de la propiedad primaryContactQuery.
     * 
     * @return
     *     possible object is
     *     {@link PersonQueryType }
     *     
     */
    public PersonQueryType getPrimaryContactQuery() {
        return primaryContactQuery;
    }

    /**
     * Define el valor de la propiedad primaryContactQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonQueryType }
     *     
     */
    public void setPrimaryContactQuery(PersonQueryType value) {
        this.primaryContactQuery = value;
    }

}
