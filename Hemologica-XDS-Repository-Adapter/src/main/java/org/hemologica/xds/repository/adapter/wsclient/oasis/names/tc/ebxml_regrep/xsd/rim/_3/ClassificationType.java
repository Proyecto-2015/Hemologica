
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Classification is the mapping of the same named interface in ebRIM.
 *         It extends RegistryObject.
 *         A Classification specifies references to two registry entrys.
 *         The classifiedObject is id of the Object being classified.
 *         The classificationNode is id of the ClassificationNode classying the object
 *       
 * 
 * <p>Clase Java para ClassificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;attribute name="classificationScheme" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="classifiedObject" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="classificationNode" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="nodeRepresentation" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationType")
public class ClassificationType
    extends RegistryObjectType
{

    @XmlAttribute(name = "classificationScheme")
    protected String classificationScheme;
    @XmlAttribute(name = "classifiedObject", required = true)
    protected String classifiedObject;
    @XmlAttribute(name = "classificationNode")
    protected String classificationNode;
    @XmlAttribute(name = "nodeRepresentation")
    protected String nodeRepresentation;

    /**
     * Obtiene el valor de la propiedad classificationScheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationScheme() {
        return classificationScheme;
    }

    /**
     * Define el valor de la propiedad classificationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationScheme(String value) {
        this.classificationScheme = value;
    }

    /**
     * Obtiene el valor de la propiedad classifiedObject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifiedObject() {
        return classifiedObject;
    }

    /**
     * Define el valor de la propiedad classifiedObject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifiedObject(String value) {
        this.classifiedObject = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationNode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationNode() {
        return classificationNode;
    }

    /**
     * Define el valor de la propiedad classificationNode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationNode(String value) {
        this.classificationNode = value;
    }

    /**
     * Obtiene el valor de la propiedad nodeRepresentation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeRepresentation() {
        return nodeRepresentation;
    }

    /**
     * Define el valor de la propiedad nodeRepresentation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeRepresentation(String value) {
        this.nodeRepresentation = value;
    }

}
