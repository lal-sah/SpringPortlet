//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.02 at 08:51:44 AM CST 
//


package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ticks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ticks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}CommonDAObject">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TickSet" type="{http://www.xignite.com/services/}ArrayOfTick" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ticks", propOrder = {
    "symbol",
    "tickSet"
})
public class Ticks
    extends CommonDAObject
{

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "TickSet")
    protected ArrayOfTick tickSet;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the tickSet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTick }
     *     
     */
    public ArrayOfTick getTickSet() {
        return tickSet;
    }

    /**
     * Sets the value of the tickSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTick }
     *     
     */
    public void setTickSet(ArrayOfTick value) {
        this.tickSet = value;
    }

}
