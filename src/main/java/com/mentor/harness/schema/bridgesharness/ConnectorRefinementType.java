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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectorRefinementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectorRefinementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="refedmodule" type="{http://www.mentor.com/harness/Schema/bridgesharness}BaseReferredModuleType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="harness" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="signal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="optionexpression" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="generalizedcavity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectorRefinementType", propOrder = {
    "refedmodule"
})
public class ConnectorRefinementType {

    protected List<BaseReferredModuleType> refedmodule;
    @XmlAttribute(name = "harness")
    protected String harness;
    @XmlAttribute(name = "signal")
    protected String signal;
    @XmlAttribute(name = "optionexpression")
    protected String optionexpression;
    @XmlAttribute(name = "generalizedcavity", required = true)
    protected String generalizedcavity;

    /**
     * Gets the value of the refedmodule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the refedmodule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefedmodule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseReferredModuleType }
     * 
     * 
     */
    public List<BaseReferredModuleType> getRefedmodule() {
        if (refedmodule == null) {
            refedmodule = new ArrayList<BaseReferredModuleType>();
        }
        return this.refedmodule;
    }

    /**
     * Gets the value of the harness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarness() {
        return harness;
    }

    /**
     * Sets the value of the harness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarness(String value) {
        this.harness = value;
    }

    /**
     * Gets the value of the signal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignal() {
        return signal;
    }

    /**
     * Sets the value of the signal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignal(String value) {
        this.signal = value;
    }

    /**
     * Gets the value of the optionexpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionexpression() {
        return optionexpression;
    }

    /**
     * Sets the value of the optionexpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionexpression(String value) {
        this.optionexpression = value;
    }

    /**
     * Gets the value of the generalizedcavity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralizedcavity() {
        return generalizedcavity;
    }

    /**
     * Sets the value of the generalizedcavity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralizedcavity(String value) {
        this.generalizedcavity = value;
    }

}