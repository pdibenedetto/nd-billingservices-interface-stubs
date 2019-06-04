
package com.majescomastek.stgicd.ws.meta.paymentinterface.paymentdepositheader;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.majescomastek.stgicd.ws.meta.paymentinterface.BaseWSVo;


/**
 * <p>Java class for paymentDepositHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentDepositHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/paymentinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="BankAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepositDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PaymentChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentCount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PaymentDepositNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDetail" type="{http://com/majescomastek/stgicd/ws/meta/paymentinterface/paymentdepositheader}paymentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SourceSystemDepositNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalDepositAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentDepositHeader", propOrder = {
    "bankAccountName",
    "currencyCode",
    "depositDate",
    "paymentChannel",
    "paymentCount",
    "paymentDepositNo",
    "paymentDetail",
    "sourceSystemDepositNo",
    "totalDepositAmount"
})
public class PaymentDepositHeader
    extends BaseWSVo
{

    @XmlElement(name = "BankAccountName", required = true)
    protected String bankAccountName;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "DepositDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar depositDate;
    @XmlElement(name = "PaymentChannel", required = true)
    protected String paymentChannel;
    @XmlElement(name = "PaymentCount", required = true)
    protected BigDecimal paymentCount;
    @XmlElement(name = "PaymentDepositNo")
    protected String paymentDepositNo;
    @XmlElement(name = "PaymentDetail")
    protected List<PaymentDetail> paymentDetail;
    @XmlElement(name = "SourceSystemDepositNo", required = true)
    protected String sourceSystemDepositNo;
    @XmlElement(name = "TotalDepositAmount", required = true)
    protected BigDecimal totalDepositAmount;

    /**
     * Gets the value of the bankAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * Sets the value of the bankAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountName(String value) {
        this.bankAccountName = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the depositDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositDate() {
        return depositDate;
    }

    /**
     * Sets the value of the depositDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositDate(XMLGregorianCalendar value) {
        this.depositDate = value;
    }

    /**
     * Gets the value of the paymentChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentChannel() {
        return paymentChannel;
    }

    /**
     * Sets the value of the paymentChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentChannel(String value) {
        this.paymentChannel = value;
    }

    /**
     * Gets the value of the paymentCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentCount() {
        return paymentCount;
    }

    /**
     * Sets the value of the paymentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentCount(BigDecimal value) {
        this.paymentCount = value;
    }

    /**
     * Gets the value of the paymentDepositNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDepositNo() {
        return paymentDepositNo;
    }

    /**
     * Sets the value of the paymentDepositNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDepositNo(String value) {
        this.paymentDepositNo = value;
    }

    /**
     * Gets the value of the paymentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetail }
     * 
     * 
     */
    public List<PaymentDetail> getPaymentDetail() {
        if (paymentDetail == null) {
            paymentDetail = new ArrayList<PaymentDetail>();
        }
        return this.paymentDetail;
    }

    /**
     * Gets the value of the sourceSystemDepositNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemDepositNo() {
        return sourceSystemDepositNo;
    }

    /**
     * Sets the value of the sourceSystemDepositNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemDepositNo(String value) {
        this.sourceSystemDepositNo = value;
    }

    /**
     * Gets the value of the totalDepositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDepositAmount() {
        return totalDepositAmount;
    }

    /**
     * Sets the value of the totalDepositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDepositAmount(BigDecimal value) {
        this.totalDepositAmount = value;
    }

}
