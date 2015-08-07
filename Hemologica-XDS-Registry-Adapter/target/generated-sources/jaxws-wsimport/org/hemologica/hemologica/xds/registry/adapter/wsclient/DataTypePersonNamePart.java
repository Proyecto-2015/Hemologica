
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTypePersonNamePart.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypePersonNamePart">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PNXP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypePersonNamePart")
@XmlEnum
public enum DataTypePersonNamePart {

    PNXP;

    public String value() {
        return name();
    }

    public static DataTypePersonNamePart fromValue(String v) {
        return valueOf(v);
    }

}
