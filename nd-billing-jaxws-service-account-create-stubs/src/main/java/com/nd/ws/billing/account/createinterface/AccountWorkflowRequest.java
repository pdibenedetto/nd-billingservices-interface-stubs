
package com.nd.ws.billing.account.createinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountWorkflowRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountWorkflowRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/nd/ws/billing/account/createinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="Authentication" type="{http://com/nd/ws/billing/account/createinterface}authentication"/>
 *         &lt;element name="RequestHeader" type="{http://com/nd/ws/billing/account/createinterface}requestHeader"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountWorkflowRequest", propOrder = {
    "authentication",
    "requestHeader"
})
public class AccountWorkflowRequest
    extends BaseWSVo
{

    @XmlElement(name = "Authentication", required = true)
    protected Authentication authentication;
    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

}
