
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntravenousInfusion.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntravenousInfusion">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IV"/>
 *     &lt;enumeration value="IVC"/>
 *     &lt;enumeration value="IVCC"/>
 *     &lt;enumeration value="IVCI"/>
 *     &lt;enumeration value="PCA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntravenousInfusion")
@XmlEnum
public enum IntravenousInfusion {

    IV,
    IVC,
    IVCC,
    IVCI,
    PCA;

    public String value() {
        return name();
    }

    public static IntravenousInfusion fromValue(String v) {
        return valueOf(v);
    }

}
