
package com.nd.ws.billing.account.createinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountWorkflowResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountWorkflowResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/nd/ws/billing/account/createinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="RequestResponse" type="{http://com/nd/ws/billing/account/createinterface}requestResponse" minOccurs="0"/>
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
@XmlType(name = "accountWorkflowResponse", propOrder = {
    "requestResponse"
})
public class AccountWorkflowResponse
    extends BaseWSVo
{

    @XmlElement(name = "RequestResponse")
    protected RequestResponse requestResponse;

    /**
     * Gets the value of the requestResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RequestResponse }
     *     
     */
    public RequestResponse getRequestResponse() {
        return requestResponse;
    }

    /**
     * Sets the value of the requestResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestResponse }
     *     
     */
    public void setRequestResponse(RequestResponse value) {
        this.requestResponse = value;
    }

}
