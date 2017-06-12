
package com.lm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingTransactionSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingTransactionSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2016_1.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2016_1.platform.webservices.netsuite.com}AccountingTransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="accountJoin" type="{urn:common_2016_1.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="revRecScheduleJoin" type="{urn:common_2016_1.platform.webservices.netsuite.com}RevRecScheduleSearchBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2016_1.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingTransactionSearch", namespace = "urn:sales_2016_1.transactions.webservices.netsuite.com", propOrder = {
    "basic",
    "accountJoin",
    "revRecScheduleJoin",
    "transactionJoin"
})
public class AccountingTransactionSearch
    extends SearchRecord
{

    protected AccountingTransactionSearchBasic basic;
    protected AccountSearchBasic accountJoin;
    protected RevRecScheduleSearchBasic revRecScheduleJoin;
    protected TransactionSearchBasic transactionJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransactionSearchBasic }
     *     
     */
    public AccountingTransactionSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransactionSearchBasic }
     *     
     */
    public void setBasic(AccountingTransactionSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the accountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * Sets the value of the accountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setAccountJoin(AccountSearchBasic value) {
        this.accountJoin = value;
    }

    /**
     * Gets the value of the revRecScheduleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleSearchBasic }
     *     
     */
    public RevRecScheduleSearchBasic getRevRecScheduleJoin() {
        return revRecScheduleJoin;
    }

    /**
     * Sets the value of the revRecScheduleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleSearchBasic }
     *     
     */
    public void setRevRecScheduleJoin(RevRecScheduleSearchBasic value) {
        this.revRecScheduleJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
    }

}
