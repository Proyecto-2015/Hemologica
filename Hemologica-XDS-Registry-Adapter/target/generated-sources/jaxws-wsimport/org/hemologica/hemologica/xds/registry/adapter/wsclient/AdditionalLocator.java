
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdditionalLocator.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalLocator">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ADL"/>
 *     &lt;enumeration value="UNIT"/>
 *     &lt;enumeration value="UNID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalLocator")
@XmlEnum
public enum AdditionalLocator {

    ADL,
    UNIT,
    UNID;

    public String value() {
        return name();
    }

    public static AdditionalLocator fromValue(String v) {
        return valueOf(v);
    }

}
