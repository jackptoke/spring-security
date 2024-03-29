//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.21 at 09:49:19 PM AEDT 
//


package com.mentor.harness.schema.bridgesharness;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectorPinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectorPinType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mentor.com/harness/Schema/bridgesharness}CavityType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="seal" type="{http://www.mentor.com/harness/Schema/bridgesharness}CavityComponentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://www.mentor.com/harness/Schema/bridgesharness}CavityComponentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addpart" type="{http://www.mentor.com/harness/Schema/bridgesharness}AdditionalComponentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cavitydetail" type="{http://www.mentor.com/harness/Schema/bridgesharness}CavityDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="plug" type="{http://www.mentor.com/harness/Schema/bridgesharness}BaseCavityComponentType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="selectplug" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectorPinType", propOrder = {
    "sealOrContactOrAddpart"
})
@XmlSeeAlso({
    CavityPinType.class
})
public class ConnectorPinType
    extends CavityType
{

    @XmlElementRefs({
        @XmlElementRef(name = "seal", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contact", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "addpart", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cavitydetail", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "plug", namespace = "http://www.mentor.com/harness/Schema/bridgesharness", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> sealOrContactOrAddpart;
    @XmlAttribute(name = "selectplug")
    protected Boolean selectplug;

    /**
     * Gets the value of the sealOrContactOrAddpart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sealOrContactOrAddpart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSealOrContactOrAddpart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CavityComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link CavityComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdditionalComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link CavityDetailType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseCavityComponentType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getSealOrContactOrAddpart() {
        if (sealOrContactOrAddpart == null) {
            sealOrContactOrAddpart = new ArrayList<JAXBElement<?>>();
        }
        return this.sealOrContactOrAddpart;
    }

    /**
     * Gets the value of the selectplug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectplug() {
        return selectplug;
    }

    /**
     * Sets the value of the selectplug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectplug(Boolean value) {
        this.selectplug = value;
    }

}
