
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SiblingInLaw.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SiblingInLaw">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SIBINLAW"/>
 *     &lt;enumeration value="BROINLAW"/>
 *     &lt;enumeration value="SISINLAW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiblingInLaw")
@XmlEnum
public enum SiblingInLaw {

    SIBINLAW,
    BROINLAW,
    SISINLAW;

    public String value() {
        return name();
    }

    public static SiblingInLaw fromValue(String v) {
        return valueOf(v);
    }

}
