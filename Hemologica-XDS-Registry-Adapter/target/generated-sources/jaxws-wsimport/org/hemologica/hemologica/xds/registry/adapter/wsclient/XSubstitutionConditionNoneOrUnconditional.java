
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_SubstitutionConditionNoneOrUnconditional.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_SubstitutionConditionNoneOrUnconditional">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NOSUB"/>
 *     &lt;enumeration value="UNCOND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_SubstitutionConditionNoneOrUnconditional")
@XmlEnum
public enum XSubstitutionConditionNoneOrUnconditional {

    NOSUB,
    UNCOND;

    public String value() {
        return name();
    }

    public static XSubstitutionConditionNoneOrUnconditional fromValue(String v) {
        return valueOf(v);
    }

}
