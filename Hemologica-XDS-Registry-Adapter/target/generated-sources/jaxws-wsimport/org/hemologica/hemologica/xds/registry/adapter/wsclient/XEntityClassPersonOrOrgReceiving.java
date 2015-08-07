
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_EntityClassPersonOrOrgReceiving.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_EntityClassPersonOrOrgReceiving">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PSN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_EntityClassPersonOrOrgReceiving")
@XmlEnum
public enum XEntityClassPersonOrOrgReceiving {

    PSN;

    public String value() {
        return name();
    }

    public static XEntityClassPersonOrOrgReceiving fromValue(String v) {
        return valueOf(v);
    }

}
