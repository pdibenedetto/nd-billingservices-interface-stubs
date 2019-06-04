
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
 * <p>Java class for billingInquiryTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingInquiryTransactions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="PolicyEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemTransactionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspendTransactionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspendTransactionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspendTransactionReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TransactionEffDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingInquiryTransactions", propOrder = {
    "policyEffectiveDate",
    "policyNo",
    "sourceSystemTransactionNo",
    "suspendTransactionFlag",
    "suspendTransactionReason",
    "suspendTransactionReleaseDate",
    "transactionAmount",
    "transactionDate",
    "transactionEffDate",
    "transactionType"
})
public class BillingInquiryTransactions
    extends BaseWSVo
{

    @XmlElement(name = "PolicyEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyEffectiveDate;
    @XmlElement(name = "PolicyNo")
    protected String policyNo;
    @XmlElement(name = "SourceSystemTransactionNo")
    protected String sourceSystemTransactionNo;
    @XmlElement(name = "SuspendTransactionFlag")
    protected String suspendTransactionFlag;
    @XmlElement(name = "SuspendTransactionReason")
    protected String suspendTransactionReason;
    @XmlElement(name = "SuspendTransactionReleaseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspendTransactionReleaseDate;
    @XmlElement(name = "TransactionAmount")
    protected BigDecimal transactionAmount;
    @XmlElement(name = "TransactionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "TransactionEffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionEffDate;
    @XmlElement(name = "TransactionType")
    protected String transactionType;

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
     * Gets the value of the sourceSystemTransactionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemTransactionNo() {
        return sourceSystemTransactionNo;
    }

    /**
     * Sets the value of the sourceSystemTransactionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemTransactionNo(String value) {
        this.sourceSystemTransactionNo = value;
    }

    /**
     * Gets the value of the suspendTransactionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendTransactionFlag() {
        return suspendTransactionFlag;
    }

    /**
     * Sets the value of the suspendTransactionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendTransactionFlag(String value) {
        this.suspendTransactionFlag = value;
    }

    /**
     * Gets the value of the suspendTransactionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendTransactionReason() {
        return suspendTransactionReason;
    }

    /**
     * Sets the value of the suspendTransactionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendTransactionReason(String value) {
        this.suspendTransactionReason = value;
    }

    /**
     * Gets the value of the suspendTransactionReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendTransactionReleaseDate() {
        return suspendTransactionReleaseDate;
    }

    /**
     * Sets the value of the suspendTransactionReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendTransactionReleaseDate(XMLGregorianCalendar value) {
        this.suspendTransactionReleaseDate = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionAmount(BigDecimal value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionEffDate() {
        return transactionEffDate;
    }

    /**
     * Sets the value of the transactionEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionEffDate(XMLGregorianCalendar value) {
        this.transactionEffDate = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

}
