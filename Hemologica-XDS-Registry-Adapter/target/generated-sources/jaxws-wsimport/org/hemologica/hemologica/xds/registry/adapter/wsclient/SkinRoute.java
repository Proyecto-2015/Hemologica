
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SkinRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SkinRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="OCDRESTA"/>
 *     &lt;enumeration value="SKIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SkinRoute")
@XmlEnum
public enum SkinRoute {

    OCDRESTA,
    SKIN;

    public String value() {
        return name();
    }

    public static SkinRoute fromValue(String v) {
        return valueOf(v);
    }

}
