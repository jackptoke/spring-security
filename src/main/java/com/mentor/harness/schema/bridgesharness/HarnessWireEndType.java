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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *                 Wire end extends the electrical connection to add physical information.
 *                 It also allows to specify the wire is not connected at this end.
 *                 An unconnected wire end must have a node or bundle position identifier
 *                 as value of its pinref attribute. If the location is specified by a
 *                 bundle position, it must be added as a child element of the wire end.
 *             
 * 
 * <p>Java class for HarnessWireEndType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HarnessWireEndType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.mentor.com/harness/Schema/bridgesharness}BaseWireConnectionType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="unconnectedlocation" type="{http://www.mentor.com/harness/Schema/bridgesharness}BundleLocationType"/&gt;
 *         &lt;element name="addpart" type="{http://www.mentor.com/harness/Schema/bridgesharness}AdditionalComponentType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="terminaltypecode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="unconnected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="route" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="loopAmount" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="striplength" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="terminationmethod" type="{http://www.mentor.com/harness/Schema/bridgesharness}TerminationMethodType" default="systemcalculated" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HarnessWireEndType", propOrder = {
    "unconnectedlocationOrAddpart"
})
public class HarnessWireEndType
    extends BaseWireConnectionType
{

    @XmlElements({
        @XmlElement(name = "unconnectedlocation", type = BundleLocationType.class),
        @XmlElement(name = "addpart", type = AdditionalComponentType.class)
    })
    protected List<Object> unconnectedlocationOrAddpart;
    @XmlAttribute(name = "terminaltypecode")
    protected String terminaltypecode;
    @XmlAttribute(name = "unconnected")
    protected Boolean unconnected;
    @XmlAttribute(name = "route")
    protected String route;
    @XmlAttribute(name = "loopAmount")
    protected Double loopAmount;
    @XmlAttribute(name = "striplength")
    protected Double striplength;
    @XmlAttribute(name = "terminationmethod")
    protected TerminationMethodType terminationmethod;

    /**
     * Gets the value of the unconnectedlocationOrAddpart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unconnectedlocationOrAddpart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnconnectedlocationOrAddpart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BundleLocationType }
     * {@link AdditionalComponentType }
     * 
     * 
     */
    public List<Object> getUnconnectedlocationOrAddpart() {
        if (unconnectedlocationOrAddpart == null) {
            unconnectedlocationOrAddpart = new ArrayList<Object>();
        }
        return this.unconnectedlocationOrAddpart;
    }

    /**
     * Gets the value of the terminaltypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminaltypecode() {
        return terminaltypecode;
    }

    /**
     * Sets the value of the terminaltypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminaltypecode(String value) {
        this.terminaltypecode = value;
    }

    /**
     * Gets the value of the unconnected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnconnected() {
        if (unconnected == null) {
            return false;
        } else {
            return unconnected;
        }
    }

    /**
     * Sets the value of the unconnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnconnected(Boolean value) {
        this.unconnected = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the loopAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoopAmount() {
        return loopAmount;
    }

    /**
     * Sets the value of the loopAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoopAmount(Double value) {
        this.loopAmount = value;
    }

    /**
     * Gets the value of the striplength property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStriplength() {
        return striplength;
    }

    /**
     * Sets the value of the striplength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStriplength(Double value) {
        this.striplength = value;
    }

    /**
     * Gets the value of the terminationmethod property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationMethodType }
     *     
     */
    public TerminationMethodType getTerminationmethod() {
        if (terminationmethod == null) {
            return TerminationMethodType.SYSTEMCALCULATED;
        } else {
            return terminationmethod;
        }
    }

    /**
     * Sets the value of the terminationmethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationMethodType }
     *     
     */
    public void setTerminationmethod(TerminationMethodType value) {
        this.terminationmethod = value;
    }

}
