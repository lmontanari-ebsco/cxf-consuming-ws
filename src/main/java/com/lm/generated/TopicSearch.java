
package com.lm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopicSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopicSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2016_1.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2016_1.platform.webservices.netsuite.com}TopicSearchBasic" minOccurs="0"/>
 *         &lt;element name="solutionJoin" type="{urn:common_2016_1.platform.webservices.netsuite.com}SolutionSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2016_1.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopicSearch", namespace = "urn:support_2016_1.lists.webservices.netsuite.com", propOrder = {
    "basic",
    "solutionJoin",
    "userJoin"
})
public class TopicSearch
    extends SearchRecord
{

    protected TopicSearchBasic basic;
    protected SolutionSearchBasic solutionJoin;
    protected EmployeeSearchBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link TopicSearchBasic }
     *     
     */
    public TopicSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicSearchBasic }
     *     
     */
    public void setBasic(TopicSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the solutionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionSearchBasic }
     *     
     */
    public SolutionSearchBasic getSolutionJoin() {
        return solutionJoin;
    }

    /**
     * Sets the value of the solutionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionSearchBasic }
     *     
     */
    public void setSolutionJoin(SolutionSearchBasic value) {
        this.solutionJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

}
