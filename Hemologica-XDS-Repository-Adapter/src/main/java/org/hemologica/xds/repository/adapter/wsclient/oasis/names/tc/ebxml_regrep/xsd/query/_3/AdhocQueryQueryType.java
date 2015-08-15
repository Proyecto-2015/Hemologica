
package org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdhocQueryQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdhocQueryQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryExpressionBranch" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}QueryExpressionBranchType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocQueryQueryType", propOrder = {
    "queryExpressionBranch"
})
public class AdhocQueryQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "QueryExpressionBranch")
    protected QueryExpressionBranchType queryExpressionBranch;

    /**
     * Obtiene el valor de la propiedad queryExpressionBranch.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionBranchType }
     *     
     */
    public QueryExpressionBranchType getQueryExpressionBranch() {
        return queryExpressionBranch;
    }

    /**
     * Define el valor de la propiedad queryExpressionBranch.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionBranchType }
     *     
     */
    public void setQueryExpressionBranch(QueryExpressionBranchType value) {
        this.queryExpressionBranch = value;
    }

}
