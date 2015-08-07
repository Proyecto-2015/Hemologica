
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObservationAlert.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationAlert">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="OBSA"/>
 *     &lt;enumeration value="AGE"/>
 *     &lt;enumeration value="COND"/>
 *     &lt;enumeration value="GEND"/>
 *     &lt;enumeration value="GEN"/>
 *     &lt;enumeration value="LAB"/>
 *     &lt;enumeration value="REACT"/>
 *     &lt;enumeration value="RREACT"/>
 *     &lt;enumeration value="CREACT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationAlert")
@XmlEnum
public enum ObservationAlert {

    OBSA,
    AGE,
    COND,
    GEND,
    GEN,
    LAB,
    REACT,
    RREACT,
    CREACT;

    public String value() {
        return name();
    }

    public static ObservationAlert fromValue(String v) {
        return valueOf(v);
    }

}
