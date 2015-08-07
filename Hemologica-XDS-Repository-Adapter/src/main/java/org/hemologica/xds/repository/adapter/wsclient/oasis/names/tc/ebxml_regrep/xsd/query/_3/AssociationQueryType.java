
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AssociationQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AssociationQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociationTypeQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/&gt;
 *         &lt;element name="SourceObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/&gt;
 *         &lt;element name="TargetObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationQueryType", propOrder = {
    "associationTypeQuery",
    "sourceObjectQuery",
    "targetObjectQuery"
})
public class AssociationQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "AssociationTypeQuery")
    protected ClassificationNodeQueryType associationTypeQuery;
    @XmlElement(name = "SourceObjectQuery")
    protected RegistryObjectQueryType sourceObjectQuery;
    @XmlElement(name = "TargetObjectQuery")
    protected RegistryObjectQueryType targetObjectQuery;

    /**
     * Obtiene el valor de la propiedad associationTypeQuery.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getAssociationTypeQuery() {
        return associationTypeQuery;
    }

    /**
     * Define el valor de la propiedad associationTypeQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setAssociationTypeQuery(ClassificationNodeQueryType value) {
        this.associationTypeQuery = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceObjectQuery.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getSourceObjectQuery() {
        return sourceObjectQuery;
    }

    /**
     * Define el valor de la propiedad sourceObjectQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setSourceObjectQuery(RegistryObjectQueryType value) {
        this.sourceObjectQuery = value;
    }

    /**
     * Obtiene el valor de la propiedad targetObjectQuery.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getTargetObjectQuery() {
        return targetObjectQuery;
    }

    /**
     * Define el valor de la propiedad targetObjectQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setTargetObjectQuery(RegistryObjectQueryType value) {
        this.targetObjectQuery = value;
    }

}
