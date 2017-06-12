
package com.lm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchColumnField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchColumnField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchColumnField", namespace = "urn:core_2016_1.platform.webservices.netsuite.com", propOrder = {
    "customLabel"
})
@XmlSeeAlso({
    SearchColumnTextNumberField.class,
    SearchColumnDateField.class,
    SearchColumnEnumSelectField.class,
    SearchColumnStringField.class,
    SearchColumnBooleanField.class,
    SearchColumnDoubleField.class,
    SearchColumnLongField.class,
    SearchColumnSelectField.class
})
public abstract class SearchColumnField {

    protected String customLabel;

    /**
     * Gets the value of the customLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomLabel() {
        return customLabel;
    }

    /**
     * Sets the value of the customLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomLabel(String value) {
        this.customLabel = value;
    }

}
