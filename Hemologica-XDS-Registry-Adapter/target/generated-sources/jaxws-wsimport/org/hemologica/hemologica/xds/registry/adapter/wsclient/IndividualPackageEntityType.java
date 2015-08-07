
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IndividualPackageEntityType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IndividualPackageEntityType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AMP"/>
 *     &lt;enumeration value="MINIM"/>
 *     &lt;enumeration value="NEBAMP"/>
 *     &lt;enumeration value="OVUL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndividualPackageEntityType")
@XmlEnum
public enum IndividualPackageEntityType {

    AMP,
    MINIM,
    NEBAMP,
    OVUL;

    public String value() {
        return name();
    }

    public static IndividualPackageEntityType fromValue(String v) {
        return valueOf(v);
    }

}
