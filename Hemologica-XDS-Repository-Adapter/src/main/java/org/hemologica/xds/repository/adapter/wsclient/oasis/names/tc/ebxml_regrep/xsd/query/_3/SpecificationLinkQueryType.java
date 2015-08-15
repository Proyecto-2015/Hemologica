
package org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SpecificationLinkQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpecificationLinkQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsageDescriptionBranch" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}InternationalStringBranchType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ServiceBindingQuery" minOccurs="0"/&gt;
 *         &lt;element name="SpecificationObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificationLinkQueryType", propOrder = {
    "usageDescriptionBranch",
    "serviceBindingQuery",
    "specificationObjectQuery"
})
public class SpecificationLinkQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "UsageDescriptionBranch")
    protected InternationalStringBranchType usageDescriptionBranch;
    @XmlElement(name = "ServiceBindingQuery")
    protected ServiceBindingQueryType serviceBindingQuery;
    @XmlElement(name = "SpecificationObjectQuery")
    protected RegistryObjectQueryType specificationObjectQuery;

    /**
     * Obtiene el valor de la propiedad usageDescriptionBranch.
     * 
     * @return
     *     possible object is
     *     {@link InternationalStringBranchType }
     *     
     */
    public InternationalStringBranchType getUsageDescriptionBranch() {
        return usageDescriptionBranch;
    }

    /**
     * Define el valor de la propiedad usageDescriptionBranch.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalStringBranchType }
     *     
     */
    public void setUsageDescriptionBranch(InternationalStringBranchType value) {
        this.usageDescriptionBranch = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceBindingQuery.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBindingQueryType }
     *     
     */
    public ServiceBindingQueryType getServiceBindingQuery() {
        return serviceBindingQuery;
    }

    /**
     * Define el valor de la propiedad serviceBindingQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBindingQueryType }
     *     
     */
    public void setServiceBindingQuery(ServiceBindingQueryType value) {
        this.serviceBindingQuery = value;
    }

    /**
     * Obtiene el valor de la propiedad specificationObjectQuery.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getSpecificationObjectQuery() {
        return specificationObjectQuery;
    }

    /**
     * Define el valor de la propiedad specificationObjectQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setSpecificationObjectQuery(RegistryObjectQueryType value) {
        this.specificationObjectQuery = value;
    }

}
