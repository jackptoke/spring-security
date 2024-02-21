//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.21 at 09:49:19 PM AEDT 
//


package com.mentor.harness.schema.bridgesharness;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A modulecode can be an inclusive modulecode in another modulecode
 * 
 * <p>Java class for BaseInclusiveModuleCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseInclusiveModuleCodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="moduleref" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *       &lt;attribute name="mutual" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseInclusiveModuleCodeType")
public class BaseInclusiveModuleCodeType {

    @XmlAttribute(name = "moduleref")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object moduleref;
    @XmlAttribute(name = "mutual")
    protected Boolean mutual;

    /**
     * Gets the value of the moduleref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getModuleref() {
        return moduleref;
    }

    /**
     * Sets the value of the moduleref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setModuleref(Object value) {
        this.moduleref = value;
    }

    /**
     * Gets the value of the mutual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMutual() {
        return mutual;
    }

    /**
     * Sets the value of the mutual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMutual(Boolean value) {
        this.mutual = value;
    }

}
