
package com.lm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoapFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoapFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{urn:types.faults_2016_1.platform.webservices.netsuite.com}FaultCodeType"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoapFault", namespace = "urn:faults_2016_1.platform.webservices.netsuite.com", propOrder = {
    "code",
    "message"
})
@XmlSeeAlso({
    InvalidVersionFault.class,
    InsufficientPermissionFault.class,
    ExceededRecordCountFault.class,
    AsyncFault.class,
    InvalidAccountFault.class,
    InvalidSessionFault.class,
    ExceededRequestLimitFault.class,
    ExceededUsageLimitFault.class,
    UnexpectedErrorFault.class,
    ExceededConcurrentRequestLimitFault.class,
    ExceededRequestSizeFault.class,
    InvalidCredentialsFault.class
})
public class SoapFault {

    @XmlElement(required = true)
    protected FaultCodeType code;
    @XmlElement(required = true)
    protected String message;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link FaultCodeType }
     *     
     */
    public FaultCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultCodeType }
     *     
     */
    public void setCode(FaultCodeType value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
