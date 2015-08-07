
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AerosolDrugForm.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AerosolDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AER"/>
 *     &lt;enumeration value="BAINHL"/>
 *     &lt;enumeration value="INHLSOL"/>
 *     &lt;enumeration value="MDINHL"/>
 *     &lt;enumeration value="NASSPRY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AerosolDrugForm")
@XmlEnum
public enum AerosolDrugForm {

    AER,
    BAINHL,
    INHLSOL,
    MDINHL,
    NASSPRY;

    public String value() {
        return name();
    }

    public static AerosolDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
