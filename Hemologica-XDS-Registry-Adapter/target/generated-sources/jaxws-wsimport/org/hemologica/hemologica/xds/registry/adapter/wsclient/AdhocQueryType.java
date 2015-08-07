
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       A registry query.
 *       A QueryExpression child element is not required when invoking a stored query.
 *       
 * 
 * <p>Clase Java para AdhocQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdhocQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}QueryExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocQueryType", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", propOrder = {
    "queryExpression"
})
public class AdhocQueryType
    extends RegistryObjectType
{

    @XmlElement(name = "QueryExpression")
    protected QueryExpressionType queryExpression;

    /**
     * Obtiene el valor de la propiedad queryExpression.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionType }
     *     
     */
    public QueryExpressionType getQueryExpression() {
        return queryExpression;
    }

    /**
     * Define el valor de la propiedad queryExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionType }
     *     
     */
    public void setQueryExpression(QueryExpressionType value) {
        this.queryExpression = value;
    }

}
