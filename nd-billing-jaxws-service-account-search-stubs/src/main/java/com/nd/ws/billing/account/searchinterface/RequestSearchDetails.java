
package com.nd.ws.billing.account.searchinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestSearchDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestSearchDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/nd/ws/billing/account/searchinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PolicyNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceSystemEntityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestSearchDetails", propOrder = {
    "fullName",
    "policyNo",
    "sourceSystemEntityCode"
})
public class RequestSearchDetails
    extends BaseWSVo
{

    @XmlElement(name = "FullName", required = true, nillable = true)
    protected String fullName;
    @XmlElement(name = "PolicyNo", required = true, nillable = true)
    protected String policyNo;
    @XmlElement(name = "SourceSystemEntityCode", required = true, nillable = true)
    protected String sourceSystemEntityCode;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the policyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNo() {
        return policyNo;
    }

    /**
     * Sets the value of the policyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNo(String value) {
        this.policyNo = value;
    }

    /**
     * Gets the value of the sourceSystemEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemEntityCode() {
        return sourceSystemEntityCode;
    }

    /**
     * Sets the value of the sourceSystemEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemEntityCode(String value) {
        this.sourceSystemEntityCode = value;
    }

}
