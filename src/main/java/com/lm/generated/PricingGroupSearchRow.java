
package com.lm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingGroupSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingGroupSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2016_1.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2016_1.platform.webservices.netsuite.com}PricingGroupSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2016_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingGroupSearchRow", propOrder = {
    "basic",
    "userJoin"
})
public class PricingGroupSearchRow
    extends SearchRow
{

    protected PricingGroupSearchRowBasic basic;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link PricingGroupSearchRowBasic }
     *     
     */
    public PricingGroupSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingGroupSearchRowBasic }
     *     
     */
    public void setBasic(PricingGroupSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

}
