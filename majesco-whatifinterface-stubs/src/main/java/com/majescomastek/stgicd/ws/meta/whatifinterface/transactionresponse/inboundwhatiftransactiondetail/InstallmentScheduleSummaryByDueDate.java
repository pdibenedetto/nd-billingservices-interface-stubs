
package com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.inboundwhatiftransactiondetail;

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
import com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.inboundwhatiftransactiondetail.installmentschedulesummarybyduedate.InstallmentScheduleSummaryByTransactionReceivable;


/**
 * <p>Java class for installmentScheduleSummaryByDueDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="installmentScheduleSummaryByDueDate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/whatifinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="BillDatePrepared" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BillDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BillSendDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="InstallmentSequenceNo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TransactionReceivableSummary" type="{http://com/majescomastek/stgicd/ws/meta/whatifinterface/transactionresponse/inboundwhatiftransactiondetail/installmentschedulesummarybyduedate}installmentScheduleSummaryByTransactionReceivable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "installmentScheduleSummaryByDueDate", propOrder = {
    "billDatePrepared",
    "billDueDate",
    "billSendDate",
    "installmentSequenceNo",
    "transactionReceivableSummary"
})
public class InstallmentScheduleSummaryByDueDate
    extends BaseWSVo
{

    @XmlElement(name = "BillDatePrepared")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billDatePrepared;
    @XmlElement(name = "BillDueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billDueDate;
    @XmlElement(name = "BillSendDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billSendDate;
    @XmlElement(name = "InstallmentSequenceNo")
    protected BigDecimal installmentSequenceNo;
    @XmlElement(name = "TransactionReceivableSummary")
    protected List<InstallmentScheduleSummaryByTransactionReceivable> transactionReceivableSummary;

    /**
     * Gets the value of the billDatePrepared property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDatePrepared() {
        return billDatePrepared;
    }

    /**
     * Sets the value of the billDatePrepared property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDatePrepared(XMLGregorianCalendar value) {
        this.billDatePrepared = value;
    }

    /**
     * Gets the value of the billDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDueDate() {
        return billDueDate;
    }

    /**
     * Sets the value of the billDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDueDate(XMLGregorianCalendar value) {
        this.billDueDate = value;
    }

    /**
     * Gets the value of the billSendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillSendDate() {
        return billSendDate;
    }

    /**
     * Sets the value of the billSendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillSendDate(XMLGregorianCalendar value) {
        this.billSendDate = value;
    }

    /**
     * Gets the value of the installmentSequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentSequenceNo() {
        return installmentSequenceNo;
    }

    /**
     * Sets the value of the installmentSequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentSequenceNo(BigDecimal value) {
        this.installmentSequenceNo = value;
    }

    /**
     * Gets the value of the transactionReceivableSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionReceivableSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionReceivableSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstallmentScheduleSummaryByTransactionReceivable }
     * 
     * 
     */
    public List<InstallmentScheduleSummaryByTransactionReceivable> getTransactionReceivableSummary() {
        if (transactionReceivableSummary == null) {
            transactionReceivableSummary = new ArrayList<InstallmentScheduleSummaryByTransactionReceivable>();
        }
        return this.transactionReceivableSummary;
    }

}
