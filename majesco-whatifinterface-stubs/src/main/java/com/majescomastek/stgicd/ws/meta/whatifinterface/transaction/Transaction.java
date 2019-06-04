
package com.majescomastek.stgicd.ws.meta.whatifinterface.transaction;

import java.math.BigDecimal;
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
 * <p>Java class for transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/whatifinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountRequestedDueDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AmountBillOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountSpreadOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrokerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyRequestedDueDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PreviousSourceTransactionRequestNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduleAsOfDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SublineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionDetail" type="{http://com/majescomastek/stgicd/ws/meta/whatifinterface/transaction}inboundWhatIfTransactionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="UnderwritingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "transaction", propOrder = {
    "accountNo",
    "accountRequestedDueDay",
    "amountBillOption",
    "amountSpreadOption",
    "billType",
    "brokerNo",
    "invoicingCurrency",
    "lineOfBusiness",
    "operatingCompany",
    "policyEffectiveDate",
    "policyExpirationDate",
    "policyNo",
    "policyRequestedDueDay",
    "previousSourceTransactionRequestNo",
    "productCode",
    "scheduleAsOfDate",
    "state",
    "sublineOfBusiness",
    "transactionCurrency",
    "transactionDetail",
    "transactionEffectiveDate",
    "underwritingCompany",
    "whatIfTransaction"
})
public class Transaction
    extends BaseWSVo
{

    @XmlElement(name = "AccountNo")
    protected String accountNo;
    @XmlElement(name = "AccountRequestedDueDay")
    protected BigDecimal accountRequestedDueDay;
    @XmlElement(name = "AmountBillOption")
    protected String amountBillOption;
    @XmlElement(name = "AmountSpreadOption")
    protected String amountSpreadOption;
    @XmlElement(name = "BillType")
    protected String billType;
    @XmlElement(name = "BrokerNo")
    protected String brokerNo;
    @XmlElement(name = "InvoicingCurrency")
    protected String invoicingCurrency;
    @XmlElement(name = "LineOfBusiness")
    protected String lineOfBusiness;
    @XmlElement(name = "OperatingCompany")
    protected String operatingCompany;
    @XmlElement(name = "PolicyEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyEffectiveDate;
    @XmlElement(name = "PolicyExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyExpirationDate;
    @XmlElement(name = "PolicyNo")
    protected String policyNo;
    @XmlElement(name = "PolicyRequestedDueDay")
    protected BigDecimal policyRequestedDueDay;
    @XmlElement(name = "PreviousSourceTransactionRequestNo")
    protected String previousSourceTransactionRequestNo;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "ScheduleAsOfDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleAsOfDate;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "SublineOfBusiness")
    protected String sublineOfBusiness;
    @XmlElement(name = "TransactionCurrency")
    protected String transactionCurrency;
    @XmlElement(name = "TransactionDetail")
    protected List<InboundWhatIfTransactionDetail> transactionDetail;
    @XmlElement(name = "TransactionEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionEffectiveDate;
    @XmlElement(name = "UnderwritingCompany")
    protected String underwritingCompany;
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
     * Gets the value of the accountRequestedDueDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountRequestedDueDay() {
        return accountRequestedDueDay;
    }

    /**
     * Sets the value of the accountRequestedDueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountRequestedDueDay(BigDecimal value) {
        this.accountRequestedDueDay = value;
    }

    /**
     * Gets the value of the amountBillOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountBillOption() {
        return amountBillOption;
    }

    /**
     * Sets the value of the amountBillOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountBillOption(String value) {
        this.amountBillOption = value;
    }

    /**
     * Gets the value of the amountSpreadOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountSpreadOption() {
        return amountSpreadOption;
    }

    /**
     * Sets the value of the amountSpreadOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountSpreadOption(String value) {
        this.amountSpreadOption = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

    /**
     * Gets the value of the brokerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerNo() {
        return brokerNo;
    }

    /**
     * Sets the value of the brokerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerNo(String value) {
        this.brokerNo = value;
    }

    /**
     * Gets the value of the invoicingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicingCurrency() {
        return invoicingCurrency;
    }

    /**
     * Sets the value of the invoicingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicingCurrency(String value) {
        this.invoicingCurrency = value;
    }

    /**
     * Gets the value of the lineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOfBusiness(String value) {
        this.lineOfBusiness = value;
    }

    /**
     * Gets the value of the operatingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * Sets the value of the operatingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCompany(String value) {
        this.operatingCompany = value;
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
     * Gets the value of the policyRequestedDueDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPolicyRequestedDueDay() {
        return policyRequestedDueDay;
    }

    /**
     * Sets the value of the policyRequestedDueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPolicyRequestedDueDay(BigDecimal value) {
        this.policyRequestedDueDay = value;
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
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the sublineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSublineOfBusiness() {
        return sublineOfBusiness;
    }

    /**
     * Sets the value of the sublineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSublineOfBusiness(String value) {
        this.sublineOfBusiness = value;
    }

    /**
     * Gets the value of the transactionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    /**
     * Sets the value of the transactionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrency(String value) {
        this.transactionCurrency = value;
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
     * Gets the value of the transactionEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionEffectiveDate() {
        return transactionEffectiveDate;
    }

    /**
     * Sets the value of the transactionEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionEffectiveDate(XMLGregorianCalendar value) {
        this.transactionEffectiveDate = value;
    }

    /**
     * Gets the value of the underwritingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderwritingCompany() {
        return underwritingCompany;
    }

    /**
     * Sets the value of the underwritingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderwritingCompany(String value) {
        this.underwritingCompany = value;
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
