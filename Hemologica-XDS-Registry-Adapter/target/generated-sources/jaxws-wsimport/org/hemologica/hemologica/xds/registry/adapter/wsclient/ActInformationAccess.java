
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActInformationAccess.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInformationAccess">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INFA"/>
 *     &lt;enumeration value="INFASO"/>
 *     &lt;enumeration value="INFAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInformationAccess")
@XmlEnum
public enum ActInformationAccess {

    INFA,
    INFASO,
    INFAO;

    public String value() {
        return name();
    }

    public static ActInformationAccess fromValue(String v) {
        return valueOf(v);
    }

}
