//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.21 at 09:49:19 PM AEDT 
//


package com.mentor.harness.schema.bridgesharness;

import java.util.ArrayList;
import java.util.List;
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
 *                 A construct to hold the details of terminal, seal, plug and other related requirements for a particular cavity (and wire combination)
 *             
 * 
 * <p>Java class for CavityDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CavityDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="wirecombination" type="{http://www.mentor.com/harness/Schema/bridgesharness}WireCombinationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="selectcontact" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="selectseal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="contactref" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *       &lt;attribute name="sealref" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CavityDetailType", propOrder = {
    "wirecombination"
})
public class CavityDetailType {

    protected List<WireCombinationType> wirecombination;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "selectcontact")
    protected Boolean selectcontact;
    @XmlAttribute(name = "selectseal")
    protected Boolean selectseal;
    @XmlAttribute(name = "contactref")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object contactref;
    @XmlAttribute(name = "sealref")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sealref;

    /**
     * Gets the value of the wirecombination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the wirecombination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirecombination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireCombinationType }
     * 
     * 
     */
    public List<WireCombinationType> getWirecombination() {
        if (wirecombination == null) {
            wirecombination = new ArrayList<WireCombinationType>();
        }
        return this.wirecombination;
    }

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
     * Gets the value of the selectcontact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectcontact() {
        return selectcontact;
    }

    /**
     * Sets the value of the selectcontact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectcontact(Boolean value) {
        this.selectcontact = value;
    }

    /**
     * Gets the value of the selectseal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectseal() {
        return selectseal;
    }

    /**
     * Sets the value of the selectseal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectseal(Boolean value) {
        this.selectseal = value;
    }

    /**
     * Gets the value of the contactref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContactref() {
        return contactref;
    }

    /**
     * Sets the value of the contactref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContactref(Object value) {
        this.contactref = value;
    }

    /**
     * Gets the value of the sealref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSealref() {
        return sealref;
    }

    /**
     * Sets the value of the sealref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSealref(Object value) {
        this.sealref = value;
    }

}
