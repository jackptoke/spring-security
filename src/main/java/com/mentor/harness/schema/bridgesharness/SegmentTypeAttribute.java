//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.21 at 09:49:19 PM AEDT 
//


package com.mentor.harness.schema.bridgesharness;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentTypeAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SegmentTypeAttribute"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="straight"/&gt;
 *     &lt;enumeration value="bend"/&gt;
 *     &lt;enumeration value="dogleg"/&gt;
 *     &lt;enumeration value="arc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SegmentTypeAttribute")
@XmlEnum
public enum SegmentTypeAttribute {

    @XmlEnumValue("straight")
    STRAIGHT("straight"),
    @XmlEnumValue("bend")
    BEND("bend"),
    @XmlEnumValue("dogleg")
    DOGLEG("dogleg"),
    @XmlEnumValue("arc")
    ARC("arc");
    private final String value;

    SegmentTypeAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SegmentTypeAttribute fromValue(String v) {
        for (SegmentTypeAttribute c: SegmentTypeAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
