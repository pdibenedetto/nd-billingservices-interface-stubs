
package com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.majescomastek.stgicd.ws.meta.whatifinterface.BaseWSVo;


/**
 * <p>Java class for transactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/whatifinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousSourceTransactionRequestNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduleAsOfDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TransactionDetail" type="{http://com/majescomastek/stgicd/ws/meta/whatifinterface/transactionresponse}inboundWhatIfTransactionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WhatIfTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionResponse", propOrder = {
    "accountNo",
    "policyEffectiveDate",
    "policyExpirationDate",
    "policyNo",
    "previousSourceTransactionRequestNo",
    "scheduleAsOfDate",
    "transactionDetail",
    "whatIfTransaction"
})
public class TransactionResponse
    extends BaseWSVo
{

    @XmlElement(name = "AccountNo")
    protected String accountNo;
    @XmlElement(name = "PolicyEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyEffectiveDate;
    @XmlElement(name = "PolicyExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyExpirationDate;
    @XmlElement(name = "PolicyNo")
    protected String policyNo;
    @XmlElement(name = "PreviousSourceTransactionRequestNo")
    protected String previousSourceTransactionRequestNo;
    @XmlElement(name = "ScheduleAsOfDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleAsOfDate;
    @XmlElement(name = "TransactionDetail")
    protected List<InboundWhatIfTransactionDetail> transactionDetail;
    @XmlElement(name = "WhatIfTransaction")
    protected String whatIfTransaction;

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the policyEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }

    /**
     * Sets the value of the policyEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyEffectiveDate(XMLGregorianCalendar value) {
        this.policyEffectiveDate = value;
    }

    /**
     * Gets the value of the policyExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyExpirationDate() {
        return policyExpirationDate;
    }

    /**
     * Sets the value of the policyExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyExpirationDate(XMLGregorianCalendar value) {
        this.policyExpirationDate = value;
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
     * Gets the value of the previousSourceTransactionRequestNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSourceTransactionRequestNo() {
        return previousSourceTransactionRequestNo;
    }

    /**
     * Sets the value of the previousSourceTransactionRequestNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSourceTransactionRequestNo(String value) {
        this.previousSourceTransactionRequestNo = value;
    }

    /**
     * Gets the value of the scheduleAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleAsOfDate() {
        return scheduleAsOfDate;
    }

    /**
     * Sets the value of the scheduleAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleAsOfDate(XMLGregorianCalendar value) {
        this.scheduleAsOfDate = value;
    }

    /**
     * Gets the value of the transactionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InboundWhatIfTransactionDetail }
     * 
     * 
     */
    public List<InboundWhatIfTransactionDetail> getTransactionDetail() {
        if (transactionDetail == null) {
            transactionDetail = new ArrayList<InboundWhatIfTransactionDetail>();
        }
        return this.transactionDetail;
    }

    /**
     * Gets the value of the whatIfTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhatIfTransaction() {
        return whatIfTransaction;
    }

    /**
     * Sets the value of the whatIfTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhatIfTransaction(String value) {
        this.whatIfTransaction = value;
    }

}
