
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IDClinPracticeSetting.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IDClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INFD"/>
 *     &lt;enumeration value="PEDID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IDClinPracticeSetting")
@XmlEnum
public enum IDClinPracticeSetting {

    INFD,
    PEDID;

    public String value() {
        return name();
    }

    public static IDClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
