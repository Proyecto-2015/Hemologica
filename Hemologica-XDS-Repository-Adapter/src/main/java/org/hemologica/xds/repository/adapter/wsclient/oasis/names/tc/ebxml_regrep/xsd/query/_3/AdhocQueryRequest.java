
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.AdhocQueryType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryRequestType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ResponseOption"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}AdhocQuery"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="federated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="federation" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="startIndex" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /&gt;
 *       &lt;attribute name="maxResults" type="{http://www.w3.org/2001/XMLSchema}integer" default="-1" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseOption",
    "adhocQuery"
})
@XmlRootElement(name = "AdhocQueryRequest")
public class AdhocQueryRequest
    extends RegistryRequestType
{

    @XmlElement(name = "ResponseOption", required = true)
    protected ResponseOptionType responseOption;
    @XmlElement(name = "AdhocQuery", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", required = true)
    protected AdhocQueryType adhocQuery;
    @XmlAttribute(name = "federated")
    protected Boolean federated;
    @XmlAttribute(name = "federation")
    @XmlSchemaType(name = "anyURI")
    protected String federation;
    @XmlAttribute(name = "startIndex")
    protected BigInteger startIndex;
    @XmlAttribute(name = "maxResults")
    protected BigInteger maxResults;

    /**
     * Obtiene el valor de la propiedad responseOption.
     * 
     * @return
     *     possible object is
     *     {@link ResponseOptionType }
     *     
     */
    public ResponseOptionType getResponseOption() {
        return responseOption;
    }

    /**
     * Define el valor de la propiedad responseOption.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseOptionType }
     *     
     */
    public void setResponseOption(ResponseOptionType value) {
        this.responseOption = value;
    }

    /**
     * Obtiene el valor de la propiedad adhocQuery.
     * 
     * @return
     *     possible object is
     *     {@link AdhocQueryType }
     *     
     */
    public AdhocQueryType getAdhocQuery() {
        return adhocQuery;
    }

    /**
     * Define el valor de la propiedad adhocQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link AdhocQueryType }
     *     
     */
    public void setAdhocQuery(AdhocQueryType value) {
        this.adhocQuery = value;
    }

    /**
     * Obtiene el valor de la propiedad federated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFederated() {
        if (federated == null) {
            return false;
        } else {
            return federated;
        }
    }

    /**
     * Define el valor de la propiedad federated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederated(Boolean value) {
        this.federated = value;
    }

    /**
     * Obtiene el valor de la propiedad federation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederation() {
        return federation;
    }

    /**
     * Define el valor de la propiedad federation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederation(String value) {
        this.federation = value;
    }

    /**
     * Obtiene el valor de la propiedad startIndex.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartIndex() {
        if (startIndex == null) {
            return new BigInteger("0");
        } else {
            return startIndex;
        }
    }

    /**
     * Define el valor de la propiedad startIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartIndex(BigInteger value) {
        this.startIndex = value;
    }

    /**
     * Obtiene el valor de la propiedad maxResults.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxResults() {
        if (maxResults == null) {
            return new BigInteger("-1");
        } else {
            return maxResults;
        }
    }

    /**
     * Define el valor de la propiedad maxResults.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxResults(BigInteger value) {
        this.maxResults = value;
    }

}
