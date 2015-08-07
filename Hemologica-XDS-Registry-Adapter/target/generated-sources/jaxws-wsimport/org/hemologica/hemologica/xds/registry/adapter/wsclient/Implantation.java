
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Implantation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Implantation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IDIMPLNT"/>
 *     &lt;enumeration value="IVITIMPLNT"/>
 *     &lt;enumeration value="SQIMPLNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Implantation")
@XmlEnum
public enum Implantation {

    IDIMPLNT,
    IVITIMPLNT,
    SQIMPLNT;

    public String value() {
        return name();
    }

    public static Implantation fromValue(String v) {
        return valueOf(v);
    }

}
