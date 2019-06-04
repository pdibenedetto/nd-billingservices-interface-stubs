
package com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.BaseWSVo;


/**
 * <p>Java class for billingInquiryInvoiceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingInquiryInvoiceDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentAmountAfterLastInvoice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentMinDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LastInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LastInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastInvoiceDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NextInstallmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NextInstallmentDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NextInstallmentDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PastDueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentReceivedAfterLastInvoice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PleasePayAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalReceivableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingInquiryInvoiceDetail", propOrder = {
    "adjustmentAmountAfterLastInvoice",
    "balance",
    "currentMinDueAmount",
    "lastInvoiceAmount",
    "lastInvoiceDate",
    "lastInvoiceDueDate",
    "nextInstallmentDate",
    "nextInstallmentDueAmount",
    "nextInstallmentDueDate",
    "pastDueAmount",
    "paymentReceivedAfterLastInvoice",
    "pleasePayAmount",
    "totalAdjustmentAmount",
    "totalPaymentAmount",
    "totalReceivableAmount"
})
public class BillingInquiryInvoiceDetail
    extends BaseWSVo
{

    @XmlElement(name = "AdjustmentAmountAfterLastInvoice")
    protected BigDecimal adjustmentAmountAfterLastInvoice;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "CurrentMinDueAmount")
    protected BigDecimal currentMinDueAmount;
    @XmlElement(name = "LastInvoiceAmount")
    protected BigDecimal lastInvoiceAmount;
    @XmlElement(name = "LastInvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInvoiceDate;
    @XmlElement(name = "LastInvoiceDueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInvoiceDueDate;
    @XmlElement(name = "NextInstallmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextInstallmentDate;
    @XmlElement(name = "NextInstallmentDueAmount")
    protected BigDecimal nextInstallmentDueAmount;
    @XmlElement(name = "NextInstallmentDueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextInstallmentDueDate;
    @XmlElement(name = "PastDueAmount")
    protected BigDecimal pastDueAmount;
    @XmlElement(name = "PaymentReceivedAfterLastInvoice")
    protected BigDecimal paymentReceivedAfterLastInvoice;
    @XmlElement(name = "PleasePayAmount")
    protected BigDecimal pleasePayAmount;
    @XmlElement(name = "TotalAdjustmentAmount")
    protected BigDecimal totalAdjustmentAmount;
    @XmlElement(name = "TotalPaymentAmount")
    protected BigDecimal totalPaymentAmount;
    @XmlElement(name = "TotalReceivableAmount")
    protected BigDecimal totalReceivableAmount;

    /**
     * Gets the value of the adjustmentAmountAfterLastInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentAmountAfterLastInvoice() {
        return adjustmentAmountAfterLastInvoice;
    }

    /**
     * Sets the value of the adjustmentAmountAfterLastInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentAmountAfterLastInvoice(BigDecimal value) {
        this.adjustmentAmountAfterLastInvoice = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the currentMinDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentMinDueAmount() {
        return currentMinDueAmount;
    }

    /**
     * Sets the value of the currentMinDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentMinDueAmount(BigDecimal value) {
        this.currentMinDueAmount = value;
    }

    /**
     * Gets the value of the lastInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastInvoiceAmount() {
        return lastInvoiceAmount;
    }

    /**
     * Sets the value of the lastInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastInvoiceAmount(BigDecimal value) {
        this.lastInvoiceAmount = value;
    }

    /**
     * Gets the value of the lastInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInvoiceDate() {
        return lastInvoiceDate;
    }

    /**
     * Sets the value of the lastInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInvoiceDate(XMLGregorianCalendar value) {
        this.lastInvoiceDate = value;
    }

    /**
     * Gets the value of the lastInvoiceDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInvoiceDueDate() {
        return lastInvoiceDueDate;
    }

    /**
     * Sets the value of the lastInvoiceDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInvoiceDueDate(XMLGregorianCalendar value) {
        this.lastInvoiceDueDate = value;
    }

    /**
     * Gets the value of the nextInstallmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextInstallmentDate() {
        return nextInstallmentDate;
    }

    /**
     * Sets the value of the nextInstallmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextInstallmentDate(XMLGregorianCalendar value) {
        this.nextInstallmentDate = value;
    }

    /**
     * Gets the value of the nextInstallmentDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNextInstallmentDueAmount() {
        return nextInstallmentDueAmount;
    }

    /**
     * Sets the value of the nextInstallmentDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNextInstallmentDueAmount(BigDecimal value) {
        this.nextInstallmentDueAmount = value;
    }

    /**
     * Gets the value of the nextInstallmentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextInstallmentDueDate() {
        return nextInstallmentDueDate;
    }

    /**
     * Sets the value of the nextInstallmentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextInstallmentDueDate(XMLGregorianCalendar value) {
        this.nextInstallmentDueDate = value;
    }

    /**
     * Gets the value of the pastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastDueAmount() {
        return pastDueAmount;
    }

    /**
     * Sets the value of the pastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPastDueAmount(BigDecimal value) {
        this.pastDueAmount = value;
    }

    /**
     * Gets the value of the paymentReceivedAfterLastInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentReceivedAfterLastInvoice() {
        return paymentReceivedAfterLastInvoice;
    }

    /**
     * Sets the value of the paymentReceivedAfterLastInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentReceivedAfterLastInvoice(BigDecimal value) {
        this.paymentReceivedAfterLastInvoice = value;
    }

    /**
     * Gets the value of the pleasePayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPleasePayAmount() {
        return pleasePayAmount;
    }

    /**
     * Sets the value of the pleasePayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPleasePayAmount(BigDecimal value) {
        this.pleasePayAmount = value;
    }

    /**
     * Gets the value of the totalAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAdjustmentAmount() {
        return totalAdjustmentAmount;
    }

    /**
     * Sets the value of the totalAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAdjustmentAmount(BigDecimal value) {
        this.totalAdjustmentAmount = value;
    }

    /**
     * Gets the value of the totalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * Sets the value of the totalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPaymentAmount(BigDecimal value) {
        this.totalPaymentAmount = value;
    }

    /**
     * Gets the value of the totalReceivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalReceivableAmount() {
        return totalReceivableAmount;
    }

    /**
     * Sets the value of the totalReceivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalReceivableAmount(BigDecimal value) {
        this.totalReceivableAmount = value;
    }

}
