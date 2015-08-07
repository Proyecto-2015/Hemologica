
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InhalantDrugForm.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="InhalantDrugForm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INHL"/>
 *     &lt;enumeration value="BAINHLPWD"/>
 *     &lt;enumeration value="INHLPWD"/>
 *     &lt;enumeration value="MDINHLPWD"/>
 *     &lt;enumeration value="NASINHL"/>
 *     &lt;enumeration value="ORINHL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InhalantDrugForm")
@XmlEnum
public enum InhalantDrugForm {

    INHL,
    BAINHLPWD,
    INHLPWD,
    MDINHLPWD,
    NASINHL,
    ORINHL;

    public String value() {
        return name();
    }

    public static InhalantDrugForm fromValue(String v) {
        return valueOf(v);
    }

}
