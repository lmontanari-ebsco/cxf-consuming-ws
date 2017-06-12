
package com.lm.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCreateRevenuePlansOn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCreateRevenuePlansOn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_billing"/>
 *     &lt;enumeration value="_fulfillment"/>
 *     &lt;enumeration value="_projectProgress"/>
 *     &lt;enumeration value="_revenueArrangementCreation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemCreateRevenuePlansOn", namespace = "urn:types.accounting_2016_1.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemCreateRevenuePlansOn {

    @XmlEnumValue("_billing")
    BILLING("_billing"),
    @XmlEnumValue("_fulfillment")
    FULFILLMENT("_fulfillment"),
    @XmlEnumValue("_projectProgress")
    PROJECT_PROGRESS("_projectProgress"),
    @XmlEnumValue("_revenueArrangementCreation")
    REVENUE_ARRANGEMENT_CREATION("_revenueArrangementCreation");
    private final String value;

    ItemCreateRevenuePlansOn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCreateRevenuePlansOn fromValue(String v) {
        for (ItemCreateRevenuePlansOn c: ItemCreateRevenuePlansOn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
