
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BarSoapDrugForm.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="BarSoapDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BARSOAP"/>
 *     &lt;enumeration value="MEDBAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BarSoapDrugForm")
@XmlEnum
public enum BarSoapDrugForm {

    BARSOAP,
    MEDBAR;

    public String value() {
        return name();
    }

    public static BarSoapDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
