
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChildInLaw.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ChildInLaw">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CHLDINLAW"/>
 *     &lt;enumeration value="DAUINLAW"/>
 *     &lt;enumeration value="SONINLAW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChildInLaw")
@XmlEnum
public enum ChildInLaw {

    CHLDINLAW,
    DAUINLAW,
    SONINLAW;

    public String value() {
        return name();
    }

    public static ChildInLaw fromValue(String v) {
        return valueOf(v);
    }

}
