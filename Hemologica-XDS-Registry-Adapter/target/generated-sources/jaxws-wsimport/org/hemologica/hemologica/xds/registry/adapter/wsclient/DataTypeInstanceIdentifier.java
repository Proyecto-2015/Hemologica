
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTypeInstanceIdentifier.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeInstanceIdentifier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="II"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeInstanceIdentifier")
@XmlEnum
public enum DataTypeInstanceIdentifier {

    II;

    public String value() {
        return name();
    }

    public static DataTypeInstanceIdentifier fromValue(String v) {
        return valueOf(v);
    }

}
