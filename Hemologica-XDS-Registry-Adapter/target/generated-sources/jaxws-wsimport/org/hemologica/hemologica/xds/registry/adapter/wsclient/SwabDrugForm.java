
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SwabDrugForm.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SwabDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SWAB"/>
 *     &lt;enumeration value="MEDSWAB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwabDrugForm")
@XmlEnum
public enum SwabDrugForm {

    SWAB,
    MEDSWAB;

    public String value() {
        return name();
    }

    public static SwabDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
