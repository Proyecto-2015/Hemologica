
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TableCellHorizontalAlign.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TableCellHorizontalAlign">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="center"/>
 *     &lt;enumeration value="char"/>
 *     &lt;enumeration value="justify"/>
 *     &lt;enumeration value="left"/>
 *     &lt;enumeration value="right"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TableCellHorizontalAlign")
@XmlEnum
public enum TableCellHorizontalAlign {

    @XmlEnumValue("center")
    CENTER("center"),
    @XmlEnumValue("char")
    CHAR("char"),
    @XmlEnumValue("justify")
    JUSTIFY("justify"),
    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("right")
    RIGHT("right");
    private final String value;

    TableCellHorizontalAlign(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableCellHorizontalAlign fromValue(String v) {
        for (TableCellHorizontalAlign c: TableCellHorizontalAlign.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
