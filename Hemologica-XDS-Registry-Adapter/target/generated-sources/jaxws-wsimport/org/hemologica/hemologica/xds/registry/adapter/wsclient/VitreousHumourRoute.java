
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VitreousHumourRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="VitreousHumourRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IVITIMPLNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VitreousHumourRoute")
@XmlEnum
public enum VitreousHumourRoute {

    IVITIMPLNT;

    public String value() {
        return name();
    }

    public static VitreousHumourRoute fromValue(String v) {
        return valueOf(v);
    }

}
