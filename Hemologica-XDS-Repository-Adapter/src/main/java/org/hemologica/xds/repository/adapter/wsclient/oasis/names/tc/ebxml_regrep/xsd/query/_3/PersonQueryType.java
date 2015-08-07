
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PersonNameFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneNumberFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddressFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonQueryType", propOrder = {
    "addressFilter",
    "personNameFilter",
    "telephoneNumberFilter",
    "emailAddressFilter"
})
@XmlSeeAlso({
    UserQueryType.class
})
public class PersonQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "AddressFilter")
    protected List<FilterType> addressFilter;
    @XmlElement(name = "PersonNameFilter")
    protected FilterType personNameFilter;
    @XmlElement(name = "TelephoneNumberFilter")
    protected List<FilterType> telephoneNumberFilter;
    @XmlElement(name = "EmailAddressFilter")
    protected List<FilterType> emailAddressFilter;

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
     * Obtiene el valor de la propiedad personNameFilter.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getPersonNameFilter() {
        return personNameFilter;
    }

    /**
     * Define el valor de la propiedad personNameFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setPersonNameFilter(FilterType value) {
        this.personNameFilter = value;
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

}
