
package com.lm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetItemAvailabilityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemAvailabilityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2016_1.platform.webservices.netsuite.com}getItemAvailabilityResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemAvailabilityResponse", namespace = "urn:messages_2016_1.platform.webservices.netsuite.com", propOrder = {
    "getItemAvailabilityResult"
})
public class GetItemAvailabilityResponse {

    @XmlElement(namespace = "urn:core_2016_1.platform.webservices.netsuite.com", required = true)
    protected GetItemAvailabilityResult getItemAvailabilityResult;

    /**
     * Gets the value of the getItemAvailabilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetItemAvailabilityResult }
     *     
     */
    public GetItemAvailabilityResult getGetItemAvailabilityResult() {
        return getItemAvailabilityResult;
    }

    /**
     * Sets the value of the getItemAvailabilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetItemAvailabilityResult }
     *     
     */
    public void setGetItemAvailabilityResult(GetItemAvailabilityResult value) {
        this.getItemAvailabilityResult = value;
    }

}
