
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WeightAlert.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="WeightAlert">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DOSEHINDW"/>
 *     &lt;enumeration value="DOSELINDW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeightAlert")
@XmlEnum
public enum WeightAlert {

    DOSEHINDW,
    DOSELINDW;

    public String value() {
        return name();
    }

    public static WeightAlert fromValue(String v) {
        return valueOf(v);
    }

}
