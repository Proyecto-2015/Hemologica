
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para SimpleFilterType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SimpleFilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType"&gt;
 *       &lt;attribute name="domainAttribute" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="comparator" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName"&gt;
 *             &lt;enumeration value="LE"/&gt;
 *             &lt;enumeration value="LT"/&gt;
 *             &lt;enumeration value="GE"/&gt;
 *             &lt;enumeration value="GT"/&gt;
 *             &lt;enumeration value="EQ"/&gt;
 *             &lt;enumeration value="NE"/&gt;
 *             &lt;enumeration value="Like"/&gt;
 *             &lt;enumeration value="NotLike"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleFilterType")
@XmlSeeAlso({
    BooleanFilterType.class,
    IntegerFilterType.class,
    FloatFilterType.class,
    DateTimeFilterType.class,
    StringFilterType.class
})
public abstract class SimpleFilterType
    extends FilterType
{

    @XmlAttribute(name = "domainAttribute", required = true)
    protected String domainAttribute;
    @XmlAttribute(name = "comparator", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String comparator;

    /**
     * Obtiene el valor de la propiedad domainAttribute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainAttribute() {
        return domainAttribute;
    }

    /**
     * Define el valor de la propiedad domainAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainAttribute(String value) {
        this.domainAttribute = value;
    }

    /**
     * Obtiene el valor de la propiedad comparator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparator() {
        return comparator;
    }

    /**
     * Define el valor de la propiedad comparator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparator(String value) {
        this.comparator = value;
    }

}
