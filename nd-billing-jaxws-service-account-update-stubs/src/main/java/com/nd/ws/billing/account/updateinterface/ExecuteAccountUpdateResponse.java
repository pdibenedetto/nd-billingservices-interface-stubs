package com.nd.ws.billing.account.updateinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeAccountUpdateResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="executeAccountUpdateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://com/nd/ws/billing/account/updateinterface}accountWorkflowResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeAccountUpdateResponse",
         propOrder = {"_return"})
public class ExecuteAccountUpdateResponse
{

    @XmlElement(name = "return") protected AccountWorkflowResponse _return;

    /**
     * Gets the value of the return property.
     *
     * @return possible object is
     *     {@link AccountWorkflowResponse }
     */
    public AccountWorkflowResponse getReturn()
    {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link AccountWorkflowResponse }
     */
    public void setReturn(AccountWorkflowResponse value)
    {
        this._return = value;
    }
}
