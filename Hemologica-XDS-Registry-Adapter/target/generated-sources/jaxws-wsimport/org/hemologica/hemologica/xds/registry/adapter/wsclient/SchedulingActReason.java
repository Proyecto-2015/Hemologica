
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SchedulingActReason.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SchedulingActReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MTG"/>
 *     &lt;enumeration value="MED"/>
 *     &lt;enumeration value="FIN"/>
 *     &lt;enumeration value="DEC"/>
 *     &lt;enumeration value="PAT"/>
 *     &lt;enumeration value="PHY"/>
 *     &lt;enumeration value="BLK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SchedulingActReason")
@XmlEnum
public enum SchedulingActReason {

    MTG,
    MED,
    FIN,
    DEC,
    PAT,
    PHY,
    BLK;

    public String value() {
        return name();
    }

    public static SchedulingActReason fromValue(String v) {
        return valueOf(v);
    }

}
