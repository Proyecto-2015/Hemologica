
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VaginalFoam.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="VaginalFoam">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="VAGFOAM"/>
 *     &lt;enumeration value="VAGFOAMAPL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VaginalFoam")
@XmlEnum
public enum VaginalFoam {

    VAGFOAM,
    VAGFOAMAPL;

    public String value() {
        return name();
    }

    public static VaginalFoam fromValue(String v) {
        return valueOf(v);
    }

}
