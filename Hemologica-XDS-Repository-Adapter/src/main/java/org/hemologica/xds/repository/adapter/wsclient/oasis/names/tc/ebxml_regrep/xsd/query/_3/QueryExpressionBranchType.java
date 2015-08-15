
package org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryExpressionBranchType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryExpressionBranchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}BranchType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryLanguageQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryExpressionBranchType", propOrder = {
    "queryLanguageQuery"
})
public class QueryExpressionBranchType
    extends BranchType
{

    @XmlElement(name = "QueryLanguageQuery")
    protected ClassificationNodeQueryType queryLanguageQuery;

    /**
     * Obtiene el valor de la propiedad queryLanguageQuery.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getQueryLanguageQuery() {
        return queryLanguageQuery;
    }

    /**
     * Define el valor de la propiedad queryLanguageQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setQueryLanguageQuery(ClassificationNodeQueryType value) {
        this.queryLanguageQuery = value;
    }

}
