
package com.lm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitializeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitializeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:messages_2016_1.platform.webservices.netsuite.com}readResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeResponse", namespace = "urn:messages_2016_1.platform.webservices.netsuite.com", propOrder = {
    "readResponse"
})
public class InitializeResponse {

    @XmlElement(required = true)
    protected ReadResponse readResponse;

    /**
     * Gets the value of the readResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ReadResponse }
     *     
     */
    public ReadResponse getReadResponse() {
        return readResponse;
    }

    /**
     * Sets the value of the readResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadResponse }
     *     
     */
    public void setReadResponse(ReadResponse value) {
        this.readResponse = value;
    }

}
