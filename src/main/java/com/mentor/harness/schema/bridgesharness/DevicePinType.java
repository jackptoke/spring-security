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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevicePinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevicePinType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mentor.com/harness/Schema/bridgesharness}PinType"&gt;
 *       &lt;attribute name="connectorcavity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="connectorgroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePinType")
public class DevicePinType
    extends PinType
{

    @XmlAttribute(name = "connectorcavity")
    protected String connectorcavity;
    @XmlAttribute(name = "connectorgroup")
    protected String connectorgroup;

    /**
     * Gets the value of the connectorcavity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorcavity() {
        return connectorcavity;
    }

    /**
     * Sets the value of the connectorcavity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorcavity(String value) {
        this.connectorcavity = value;
    }

    /**
     * Gets the value of the connectorgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorgroup() {
        return connectorgroup;
    }

    /**
     * Sets the value of the connectorgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorgroup(String value) {
        this.connectorgroup = value;
    }

}