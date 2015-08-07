
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActSpecObsDilutionCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecObsDilutionCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DILUTION"/>
 *     &lt;enumeration value="AUTO-HIGH"/>
 *     &lt;enumeration value="AUTO-LOW"/>
 *     &lt;enumeration value="PRE"/>
 *     &lt;enumeration value="RERUN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActSpecObsDilutionCode")
@XmlEnum
public enum ActSpecObsDilutionCode {

    DILUTION("DILUTION"),
    @XmlEnumValue("AUTO-HIGH")
    AUTO_HIGH("AUTO-HIGH"),
    @XmlEnumValue("AUTO-LOW")
    AUTO_LOW("AUTO-LOW"),
    PRE("PRE"),
    RERUN("RERUN");
    private final String value;

    ActSpecObsDilutionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActSpecObsDilutionCode fromValue(String v) {
        for (ActSpecObsDilutionCode c: ActSpecObsDilutionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
