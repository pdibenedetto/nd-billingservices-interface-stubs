
package com.majescomastek.stgicd.ws.meta.whatifinterface.transactionresponse.inboundwhatiftransactiondetail.installmentschedulesummarybyduedate;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.majescomastek.stgicd.ws.meta.whatifinterface.BaseWSVo;


/**
 * <p>Java class for installmentScheduleSummaryByTransactionReceivable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="installmentScheduleSummaryByTransactionReceivable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/whatifinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommissionPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InstallmentNo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PolicyEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReceivableCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionReceivableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "installmentScheduleSummaryByTransactionReceivable", propOrder = {
    "balance",
    "commissionAmount",
    "commissionPercent",
    "installmentNo",
    "policyEffectiveDate",
    "policyNo",
    "receivableAmount",
    "receivableCategory",
    "receivableCode",
    "transactionReceivableAmount"
})
public class InstallmentScheduleSummaryByTransactionReceivable
    extends BaseWSVo
{

    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "CommissionAmount")
    protected BigDecimal commissionAmount;
    @XmlElement(name = "CommissionPercent")
    protected BigDecimal commissionPercent;
    @XmlElement(name = "InstallmentNo")
    protected BigDecimal installmentNo;
    @XmlElement(name = "PolicyEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyEffectiveDate;
    @XmlElement(name = "PolicyNo")
    protected String policyNo;
    @XmlElement(name = "ReceivableAmount")
    protected BigDecimal receivableAmount;
    @XmlElement(name = "ReceivableCategory")
    protected String receivableCategory;
    @XmlElement(name = "ReceivableCode")
    protected String receivableCode;
    @XmlElement(name = "TransactionReceivableAmount")
    protected BigDecimal transactionReceivableAmount;

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
     * Gets the value of the commissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    /**
     * Sets the value of the commissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionAmount(BigDecimal value) {
        this.commissionAmount = value;
    }

    /**
     * Gets the value of the commissionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionPercent() {
        return commissionPercent;
    }

    /**
     * Sets the value of the commissionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionPercent(BigDecimal value) {
        this.commissionPercent = value;
    }

    /**
     * Gets the value of the installmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentNo() {
        return installmentNo;
    }

    /**
     * Sets the value of the installmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentNo(BigDecimal value) {
        this.installmentNo = value;
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
     * Gets the value of the receivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableAmount() {
        return receivableAmount;
    }

    /**
     * Sets the value of the receivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableAmount(BigDecimal value) {
        this.receivableAmount = value;
    }

    /**
     * Gets the value of the receivableCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivableCategory() {
        return receivableCategory;
    }

    /**
     * Sets the value of the receivableCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivableCategory(String value) {
        this.receivableCategory = value;
    }

    /**
     * Gets the value of the receivableCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivableCode() {
        return receivableCode;
    }

    /**
     * Sets the value of the receivableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivableCode(String value) {
        this.receivableCode = value;
    }

    /**
     * Gets the value of the transactionReceivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionReceivableAmount() {
        return transactionReceivableAmount;
    }

    /**
     * Sets the value of the transactionReceivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionReceivableAmount(BigDecimal value) {
        this.transactionReceivableAmount = value;
    }

}
