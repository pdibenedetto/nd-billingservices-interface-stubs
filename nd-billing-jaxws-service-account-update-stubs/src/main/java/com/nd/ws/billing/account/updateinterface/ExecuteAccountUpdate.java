package com.nd.ws.billing.account.updateinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeAccountUpdate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="executeAccountUpdate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountWorkflowRequest" type="{http://com/nd/ws/billing/account/updateinterface}accountWorkflowRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeAccountUpdate",
         propOrder = {"accountWorkflowRequest"})
public class ExecuteAccountUpdate
{

    @XmlElement(name = "AccountWorkflowRequest") protected AccountWorkflowRequest
        accountWorkflowRequest;

    /**
     * Gets the value of the accountWorkflowRequest property.
     *
     * @return possible object is
     *     {@link AccountWorkflowRequest }
     */
    public AccountWorkflowRequest getAccountWorkflowRequest()
    {
        return accountWorkflowRequest;
    }

    /**
     * Sets the value of the accountWorkflowRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link AccountWorkflowRequest }
     */
    public void setAccountWorkflowRequest(AccountWorkflowRequest value)
    {
        this.accountWorkflowRequest = value;
    }
}
