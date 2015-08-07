
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClassificationSchemeQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClassificationSchemeQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildrenQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NodeTypeQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationSchemeQueryType", propOrder = {
    "childrenQuery",
    "nodeTypeQuery"
})
public class ClassificationSchemeQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ChildrenQuery")
    protected List<ClassificationNodeQueryType> childrenQuery;
    @XmlElement(name = "NodeTypeQuery")
    protected ClassificationNodeQueryType nodeTypeQuery;

    /**
     * Gets the value of the childrenQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childrenQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildrenQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationNodeQueryType }
     * 
     * 
     */
    public List<ClassificationNodeQueryType> getChildrenQuery() {
        if (childrenQuery == null) {
            childrenQuery = new ArrayList<ClassificationNodeQueryType>();
        }
        return this.childrenQuery;
    }

    /**
     * Obtiene el valor de la propiedad nodeTypeQuery.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getNodeTypeQuery() {
        return nodeTypeQuery;
    }

    /**
     * Define el valor de la propiedad nodeTypeQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setNodeTypeQuery(ClassificationNodeQueryType value) {
        this.nodeTypeQuery = value;
    }

}
