
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PadDrugForm.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PadDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PAD"/>
 *     &lt;enumeration value="MEDPAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PadDrugForm")
@XmlEnum
public enum PadDrugForm {

    PAD,
    MEDPAD;

    public String value() {
        return name();
    }

    public static PadDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
