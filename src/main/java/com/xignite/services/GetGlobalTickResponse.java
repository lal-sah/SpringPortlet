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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetGlobalTickResult" type="{http://www.xignite.com/services/}SingleTick" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getGlobalTickResult"
})
@XmlRootElement(name = "GetGlobalTickResponse")
public class GetGlobalTickResponse {

    @XmlElement(name = "GetGlobalTickResult")
    protected SingleTick getGlobalTickResult;

    /**
     * Gets the value of the getGlobalTickResult property.
     * 
     * @return
     *     possible object is
     *     {@link SingleTick }
     *     
     */
    public SingleTick getGetGlobalTickResult() {
        return getGlobalTickResult;
    }

    /**
     * Sets the value of the getGlobalTickResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleTick }
     *     
     */
    public void setGetGlobalTickResult(SingleTick value) {
        this.getGlobalTickResult = value;
    }

}
