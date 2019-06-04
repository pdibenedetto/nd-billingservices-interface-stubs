
package com.majescomastek.stgicd.ws.meta.whatifinterface.whatifinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.whatifinterface.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.whatifinterface.requestheader.RequestHeader;
import com.majescomastek.stgicd.ws.meta.whatifinterface.transaction.Transaction;


/**
 * <p>Java class for whatIfTransactionSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="whatIfTransactionSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/whatifinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="RequestHeader" type="{http://com/majescomastek/stgicd/ws/meta/whatifinterface/requestheader}requestHeader"/>
 *         &lt;element name="Transaction" type="{http://com/majescomastek/stgicd/ws/meta/whatifinterface/transaction}transaction"/>
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
@XmlType(name = "whatIfTransactionSchedule", propOrder = {
    "requestHeader",
    "transaction"
})
public class WhatIfTransactionSchedule
    extends BaseWSVo
{

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "Transaction", required = true)
    protected Transaction transaction;

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

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction }
     *     
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction }
     *     
     */
    public void setTransaction(Transaction value) {
        this.transaction = value;
    }

}
