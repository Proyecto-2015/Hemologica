
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTypePostalAndResidentialAddress.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypePostalAndResidentialAddress">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypePostalAndResidentialAddress")
@XmlEnum
public enum DataTypePostalAndResidentialAddress {

    AD;

    public String value() {
        return name();
    }

    public static DataTypePostalAndResidentialAddress fromValue(String v) {
        return valueOf(v);
    }

}
