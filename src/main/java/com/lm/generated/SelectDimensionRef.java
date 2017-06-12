
package com.lm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectDimensionRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectDimensionRef">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2016_1.platform.webservices.netsuite.com}DimensionRef">
 *       &lt;sequence>
 *         &lt;element name="value" type="{urn:core_2016_1.platform.webservices.netsuite.com}ListOrRecordRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectDimensionRef", namespace = "urn:core_2016_1.platform.webservices.netsuite.com", propOrder = {
    "value"
})
public class SelectDimensionRef
    extends DimensionRef
{

    @XmlElement(required = true)
    protected ListOrRecordRef value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ListOrRecordRef }
     *     
     */
    public ListOrRecordRef getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOrRecordRef }
     *     
     */
    public void setValue(ListOrRecordRef value) {
        this.value = value;
    }

}
