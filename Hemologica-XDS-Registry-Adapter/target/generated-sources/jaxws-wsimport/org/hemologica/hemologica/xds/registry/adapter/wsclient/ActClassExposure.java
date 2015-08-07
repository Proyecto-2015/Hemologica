
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActClassExposure.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassExposure">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXPOS"/>
 *     &lt;enumeration value="AEXPOS"/>
 *     &lt;enumeration value="TEXPOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassExposure")
@XmlEnum
public enum ActClassExposure {

    EXPOS,
    AEXPOS,
    TEXPOS;

    public String value() {
        return name();
    }

    public static ActClassExposure fromValue(String v) {
        return valueOf(v);
    }

}
