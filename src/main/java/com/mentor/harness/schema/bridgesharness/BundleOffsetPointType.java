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
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 Defines a location along a bundle as a one-dimensional positive offset, from either the start or end node, towards the bundle center.
 *             
 * 
 * <p>Java class for BundleOffsetPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleOffsetPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="offsetparameter" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" /&gt;
 *       &lt;attribute name="offsetnoderef" use="required" type="{http://www.mentor.com/harness/Schema/bridgesharness}BundleEndTypeAttribute" /&gt;
 *       &lt;attribute name="anchorRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *       &lt;attribute name="viewFromNode" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleOffsetPointType")
public class BundleOffsetPointType {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "offsetparameter")
    protected Double offsetparameter;
    @XmlAttribute(name = "offsetnoderef", required = true)
    protected BundleEndTypeAttribute offsetnoderef;
    @XmlAttribute(name = "anchorRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object anchorRef;
    @XmlAttribute(name = "viewFromNode")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object viewFromNode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the offsetparameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getOffsetparameter() {
        if (offsetparameter == null) {
            return  0.0D;
        } else {
            return offsetparameter;
        }
    }

    /**
     * Sets the value of the offsetparameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffsetparameter(Double value) {
        this.offsetparameter = value;
    }

    /**
     * Gets the value of the offsetnoderef property.
     * 
     * @return
     *     possible object is
     *     {@link BundleEndTypeAttribute }
     *     
     */
    public BundleEndTypeAttribute getOffsetnoderef() {
        return offsetnoderef;
    }

    /**
     * Sets the value of the offsetnoderef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleEndTypeAttribute }
     *     
     */
    public void setOffsetnoderef(BundleEndTypeAttribute value) {
        this.offsetnoderef = value;
    }

    /**
     * Gets the value of the anchorRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAnchorRef() {
        return anchorRef;
    }

    /**
     * Sets the value of the anchorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAnchorRef(Object value) {
        this.anchorRef = value;
    }

    /**
     * Gets the value of the viewFromNode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getViewFromNode() {
        return viewFromNode;
    }

    /**
     * Sets the value of the viewFromNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setViewFromNode(Object value) {
        this.viewFromNode = value;
    }

}
