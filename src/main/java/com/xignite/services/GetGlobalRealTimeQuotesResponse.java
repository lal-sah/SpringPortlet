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
 *         &lt;element name="GetGlobalRealTimeQuotesResult" type="{http://www.xignite.com/services/}ArrayOfGlobalQuote" minOccurs="0"/>
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
    "getGlobalRealTimeQuotesResult"
})
@XmlRootElement(name = "GetGlobalRealTimeQuotesResponse")
public class GetGlobalRealTimeQuotesResponse {

    @XmlElement(name = "GetGlobalRealTimeQuotesResult")
    protected ArrayOfGlobalQuote getGlobalRealTimeQuotesResult;

    /**
     * Gets the value of the getGlobalRealTimeQuotesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGlobalQuote }
     *     
     */
    public ArrayOfGlobalQuote getGetGlobalRealTimeQuotesResult() {
        return getGlobalRealTimeQuotesResult;
    }

    /**
     * Sets the value of the getGlobalRealTimeQuotesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGlobalQuote }
     *     
     */
    public void setGetGlobalRealTimeQuotesResult(ArrayOfGlobalQuote value) {
        this.getGlobalRealTimeQuotesResult = value;
    }

}
