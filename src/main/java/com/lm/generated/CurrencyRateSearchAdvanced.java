
package com.lm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyRateSearchAdvanced complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyRateSearchAdvanced">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2016_1.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="criteria" type="{urn:accounting_2016_1.lists.webservices.netsuite.com}CurrencyRateSearch" minOccurs="0"/>
 *         &lt;element name="columns" type="{urn:accounting_2016_1.lists.webservices.netsuite.com}CurrencyRateSearchRow" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="savedSearchId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="savedSearchScriptId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyRateSearchAdvanced", propOrder = {
    "criteria",
    "columns"
})
public class CurrencyRateSearchAdvanced
    extends SearchRecord
{

    protected CurrencyRateSearch criteria;
    protected CurrencyRateSearchRow columns;
    @XmlAttribute(name = "savedSearchId")
    protected String savedSearchId;
    @XmlAttribute(name = "savedSearchScriptId")
    protected String savedSearchScriptId;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRateSearch }
     *     
     */
    public CurrencyRateSearch getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRateSearch }
     *     
     */
    public void setCriteria(CurrencyRateSearch value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRateSearchRow }
     *     
     */
    public CurrencyRateSearchRow getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRateSearchRow }
     *     
     */
    public void setColumns(CurrencyRateSearchRow value) {
        this.columns = value;
    }

    /**
     * Gets the value of the savedSearchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchId() {
        return savedSearchId;
    }

    /**
     * Sets the value of the savedSearchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchId(String value) {
        this.savedSearchId = value;
    }

    /**
     * Gets the value of the savedSearchScriptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchScriptId() {
        return savedSearchScriptId;
    }

    /**
     * Sets the value of the savedSearchScriptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchScriptId(String value) {
        this.savedSearchScriptId = value;
    }

}
