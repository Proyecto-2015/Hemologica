
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActClassGenomicObservation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassGenomicObservation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GEN"/>
 *     &lt;enumeration value="SEQ"/>
 *     &lt;enumeration value="SEQVAR"/>
 *     &lt;enumeration value="DETPOL"/>
 *     &lt;enumeration value="EXP"/>
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="PHN"/>
 *     &lt;enumeration value="POL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassGenomicObservation")
@XmlEnum
public enum ActClassGenomicObservation {

    GEN,
    SEQ,
    SEQVAR,
    DETPOL,
    EXP,
    LOC,
    PHN,
    POL;

    public String value() {
        return name();
    }

    public static ActClassGenomicObservation fromValue(String v) {
        return valueOf(v);
    }

}