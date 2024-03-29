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
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageMappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageMappingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="intref"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="intrefid" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="messagerefid" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageMappingType", propOrder = {
    "intref"
})
public class MessageMappingType {

    protected List<MessageMappingType.Intref> intref;
    @XmlAttribute(name = "messagerefid")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object messagerefid;

    /**
     * Gets the value of the intref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the intref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageMappingType.Intref }
     * 
     * 
     */
    public List<MessageMappingType.Intref> getIntref() {
        if (intref == null) {
            intref = new ArrayList<MessageMappingType.Intref>();
        }
        return this.intref;
    }

    /**
     * Gets the value of the messagerefid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMessagerefid() {
        return messagerefid;
    }

    /**
     * Sets the value of the messagerefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMessagerefid(Object value) {
        this.messagerefid = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="intrefid" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Intref {

        @XmlAttribute(name = "intrefid")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object intrefid;

        /**
         * Gets the value of the intrefid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getIntrefid() {
            return intrefid;
        }

        /**
         * Sets the value of the intrefid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setIntrefid(Object value) {
            this.intrefid = value;
        }

    }

}
