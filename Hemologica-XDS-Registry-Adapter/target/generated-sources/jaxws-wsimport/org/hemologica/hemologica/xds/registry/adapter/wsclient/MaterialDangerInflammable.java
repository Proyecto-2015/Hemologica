
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MaterialDangerInflammable.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MaterialDangerInflammable">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IFL"/>
 *     &lt;enumeration value="EXP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaterialDangerInflammable")
@XmlEnum
public enum MaterialDangerInflammable {

    IFL,
    EXP;

    public String value() {
        return name();
    }

    public static MaterialDangerInflammable fromValue(String v) {
        return valueOf(v);
    }

}
