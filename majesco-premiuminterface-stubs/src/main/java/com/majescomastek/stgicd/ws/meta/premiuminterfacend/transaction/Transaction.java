
package com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.BaseWSVo;


/**
 * <p>Java class for transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountBillOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountSpreadOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuditFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuditSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrokerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionPaidBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionSacrifice" type="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend/transaction}inboundCommissionSacrifice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Entities" type="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend/transaction}inboundEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeedingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegacyBalanceForwardYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LossDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NedrFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoncancellableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyInceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousPolicyEffDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PreviousPolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivableDetails" type="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend/transaction}receivableDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecurringEftTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedDueDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SDIPRatingPlan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SiuFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SlidingScaleCommissionSchedule" type="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend/transaction}inboundSlidingScaleCommission" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SlidingScaleCommissionYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceAccountingMonth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SourcePolicyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourcePolicyMod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemProcessDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SourceSystemRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemTransactionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceTransactionRequestNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialNoticePeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubbrokerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SublineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionEffDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TransactionExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TransactionReason" type="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend/transaction}inboundTransactionReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnderwritingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "amountBillOption",
    "amountSpreadOption",
    "applicationNo",
    "auditFlag",
    "auditSubType",
    "billingFlag",
    "billType",
    "brokerNo",
    "cancellationMethod",
    "cancellationReason",
    "cancellationType",
    "claimNo",
    "commissionPaidBasis",
    "commissionSacrifice",
    "country",
    "crtCode",
    "discountPlanCode",
    "entities",
    "feedingSystem",
    "groupNo",
    "invoicingCurrency",
    "legacyBalanceForwardYN",
    "lineOfBusiness",
    "lossDate",
    "nedrFlag",
    "noncancellableFlag",
    "nonRenewalFlag",
    "operatingCompany",
    "operatingRegion",
    "paymentMethod",
    "paymentPlan",
    "policyEffectiveDate",
    "policyInceptionDate",
    "policyNo",
    "previousPolicyEffDate",
    "previousPolicyNo",
    "primaryLocation",
    "productCode",
    "programType",
    "receivableDetails",
    "recurringEftTokenId",
    "requestedDueDay",
    "sdipRatingPlan",
    "siuFlag",
    "slidingScaleCommissionSchedule",
    "slidingScaleCommissionYN",
    "sourceAccountingMonth",
    "sourcePolicyId",
    "sourcePolicyMod",
    "sourceSystem",
    "sourceSystemProcessDate",
    "sourceSystemRemarks",
    "sourceSystemTransactionNo",
    "sourceSystemUserId",
    "sourceTransactionRequestNo",
    "specialNoticePeriod",
    "stateCode",
    "subbrokerNo",
    "sublineOfBusiness",
    "transactionCurrency",
    "transactionEffDate",
    "transactionExpiryDate",
    "transactionReason",
    "transactionType",
    "underwritingCompany"
})
public class Transaction
    extends BaseWSVo
{

    @XmlElement(name = "AccountNo")
    protected String accountNo;
    @XmlElement(name = "AmountBillOption")
    protected String amountBillOption;
    @XmlElement(name = "AmountSpreadOption")
    protected String amountSpreadOption;
    @XmlElement(name = "ApplicationNo")
    protected String applicationNo;
    @XmlElement(name = "AuditFlag")
    protected String auditFlag;
    @XmlElement(name = "AuditSubType")
    protected String auditSubType;
    @XmlElement(name = "BillingFlag")
    protected String billingFlag;
    @XmlElement(name = "BillType")
    protected String billType;
    @XmlElement(name = "BrokerNo")
    protected String brokerNo;
    @XmlElement(name = "CancellationMethod")
    protected String cancellationMethod;
    @XmlElement(name = "CancellationReason")
    protected String cancellationReason;
    @XmlElement(name = "CancellationType")
    protected String cancellationType;
    @XmlElement(name = "ClaimNo")
    protected String claimNo;
    @XmlElement(name = "CommissionPaidBasis")
    protected String commissionPaidBasis;
    @XmlElement(name = "CommissionSacrifice")
    protected List<InboundCommissionSacrifice> commissionSacrifice;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "CrtCode")
    protected String crtCode;
    @XmlElement(name = "DiscountPlanCode")
    protected String discountPlanCode;
    @XmlElement(name = "Entities")
    protected List<InboundEntity> entities;
    @XmlElement(name = "FeedingSystem")
    protected String feedingSystem;
    @XmlElement(name = "GroupNo")
    protected String groupNo;
    @XmlElement(name = "InvoicingCurrency")
    protected String invoicingCurrency;
    @XmlElement(name = "LegacyBalanceForwardYN")
    protected String legacyBalanceForwardYN;
    @XmlElement(name = "LineOfBusiness")
    protected String lineOfBusiness;
    @XmlElement(name = "LossDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lossDate;
    @XmlElement(name = "NedrFlag")
    protected String nedrFlag;
    @XmlElement(name = "NoncancellableFlag")
    protected String noncancellableFlag;
    @XmlElement(name = "NonRenewalFlag")
    protected String nonRenewalFlag;
    @XmlElement(name = "OperatingCompany")
    protected String operatingCompany;
    @XmlElement(name = "OperatingRegion")
    protected String operatingRegion;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "PaymentPlan")
    protected String paymentPlan;
    @XmlElement(name = "PolicyEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyEffectiveDate;
    @XmlElement(name = "PolicyInceptionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyInceptionDate;
    @XmlElement(name = "PolicyNo")
    protected String policyNo;
    @XmlElement(name = "PreviousPolicyEffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar previousPolicyEffDate;
    @XmlElement(name = "PreviousPolicyNo")
    protected String previousPolicyNo;
    @XmlElement(name = "PrimaryLocation")
    protected String primaryLocation;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "ProgramType")
    protected String programType;
    @XmlElement(name = "ReceivableDetails")
    protected List<ReceivableDetails> receivableDetails;
    @XmlElement(name = "RecurringEftTokenId")
    protected String recurringEftTokenId;
    @XmlElement(name = "RequestedDueDay")
    protected BigDecimal requestedDueDay;
    @XmlElement(name = "SDIPRatingPlan")
    protected BigDecimal sdipRatingPlan;
    @XmlElement(name = "SiuFlag")
    protected String siuFlag;
    @XmlElement(name = "SlidingScaleCommissionSchedule")
    protected List<InboundSlidingScaleCommission> slidingScaleCommissionSchedule;
    @XmlElement(name = "SlidingScaleCommissionYN")
    protected String slidingScaleCommissionYN;
    @XmlElement(name = "SourceAccountingMonth")
    protected BigDecimal sourceAccountingMonth;
    @XmlElement(name = "SourcePolicyId")
    protected String sourcePolicyId;
    @XmlElement(name = "SourcePolicyMod")
    protected BigDecimal sourcePolicyMod;
    @XmlElement(name = "SourceSystem")
    protected String sourceSystem;
    @XmlElement(name = "SourceSystemProcessDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sourceSystemProcessDate;
    @XmlElement(name = "SourceSystemRemarks")
    protected String sourceSystemRemarks;
    @XmlElement(name = "SourceSystemTransactionNo")
    protected String sourceSystemTransactionNo;
    @XmlElement(name = "SourceSystemUserId")
    protected String sourceSystemUserId;
    @XmlElement(name = "SourceTransactionRequestNo")
    protected String sourceTransactionRequestNo;
    @XmlElement(name = "SpecialNoticePeriod")
    protected BigDecimal specialNoticePeriod;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "SubbrokerNo")
    protected String subbrokerNo;
    @XmlElement(name = "SublineOfBusiness")
    protected String sublineOfBusiness;
    @XmlElement(name = "TransactionCurrency")
    protected String transactionCurrency;
    @XmlElement(name = "TransactionEffDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionEffDate;
    @XmlElement(name = "TransactionExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionExpiryDate;
    @XmlElement(name = "TransactionReason")
    protected List<InboundTransactionReason> transactionReason;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "UnderwritingCompany")
    protected String underwritingCompany;

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
     * Gets the value of the applicationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNo() {
        return applicationNo;
    }

    /**
     * Sets the value of the applicationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNo(String value) {
        this.applicationNo = value;
    }

    /**
     * Gets the value of the auditFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditFlag() {
        return auditFlag;
    }

    /**
     * Sets the value of the auditFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditFlag(String value) {
        this.auditFlag = value;
    }

    /**
     * Gets the value of the auditSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditSubType() {
        return auditSubType;
    }

    /**
     * Sets the value of the auditSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditSubType(String value) {
        this.auditSubType = value;
    }

    /**
     * Gets the value of the billingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingFlag() {
        return billingFlag;
    }

    /**
     * Sets the value of the billingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingFlag(String value) {
        this.billingFlag = value;
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
     * Gets the value of the cancellationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationMethod() {
        return cancellationMethod;
    }

    /**
     * Sets the value of the cancellationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationMethod(String value) {
        this.cancellationMethod = value;
    }

    /**
     * Gets the value of the cancellationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationReason() {
        return cancellationReason;
    }

    /**
     * Sets the value of the cancellationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationReason(String value) {
        this.cancellationReason = value;
    }

    /**
     * Gets the value of the cancellationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationType() {
        return cancellationType;
    }

    /**
     * Sets the value of the cancellationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationType(String value) {
        this.cancellationType = value;
    }

    /**
     * Gets the value of the claimNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNo() {
        return claimNo;
    }

    /**
     * Sets the value of the claimNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNo(String value) {
        this.claimNo = value;
    }

    /**
     * Gets the value of the commissionPaidBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPaidBasis() {
        return commissionPaidBasis;
    }

    /**
     * Sets the value of the commissionPaidBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPaidBasis(String value) {
        this.commissionPaidBasis = value;
    }

    /**
     * Gets the value of the commissionSacrifice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionSacrifice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionSacrifice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InboundCommissionSacrifice }
     * 
     * 
     */
    public List<InboundCommissionSacrifice> getCommissionSacrifice() {
        if (commissionSacrifice == null) {
            commissionSacrifice = new ArrayList<InboundCommissionSacrifice>();
        }
        return this.commissionSacrifice;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the crtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrtCode() {
        return crtCode;
    }

    /**
     * Sets the value of the crtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrtCode(String value) {
        this.crtCode = value;
    }

    /**
     * Gets the value of the discountPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPlanCode() {
        return discountPlanCode;
    }

    /**
     * Sets the value of the discountPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPlanCode(String value) {
        this.discountPlanCode = value;
    }

    /**
     * Gets the value of the entities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InboundEntity }
     * 
     * 
     */
    public List<InboundEntity> getEntities() {
        if (entities == null) {
            entities = new ArrayList<InboundEntity>();
        }
        return this.entities;
    }

    /**
     * Gets the value of the feedingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedingSystem() {
        return feedingSystem;
    }

    /**
     * Sets the value of the feedingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedingSystem(String value) {
        this.feedingSystem = value;
    }

    /**
     * Gets the value of the groupNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * Sets the value of the groupNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNo(String value) {
        this.groupNo = value;
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
     * Gets the value of the legacyBalanceForwardYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyBalanceForwardYN() {
        return legacyBalanceForwardYN;
    }

    /**
     * Sets the value of the legacyBalanceForwardYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyBalanceForwardYN(String value) {
        this.legacyBalanceForwardYN = value;
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
     * Gets the value of the lossDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLossDate() {
        return lossDate;
    }

    /**
     * Sets the value of the lossDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLossDate(XMLGregorianCalendar value) {
        this.lossDate = value;
    }

    /**
     * Gets the value of the nedrFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNedrFlag() {
        return nedrFlag;
    }

    /**
     * Sets the value of the nedrFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNedrFlag(String value) {
        this.nedrFlag = value;
    }

    /**
     * Gets the value of the noncancellableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoncancellableFlag() {
        return noncancellableFlag;
    }

    /**
     * Sets the value of the noncancellableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoncancellableFlag(String value) {
        this.noncancellableFlag = value;
    }

    /**
     * Gets the value of the nonRenewalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRenewalFlag() {
        return nonRenewalFlag;
    }

    /**
     * Sets the value of the nonRenewalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRenewalFlag(String value) {
        this.nonRenewalFlag = value;
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
     * Gets the value of the operatingRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingRegion() {
        return operatingRegion;
    }

    /**
     * Sets the value of the operatingRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingRegion(String value) {
        this.operatingRegion = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPlan() {
        return paymentPlan;
    }

    /**
     * Sets the value of the paymentPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPlan(String value) {
        this.paymentPlan = value;
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
     * Gets the value of the policyInceptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyInceptionDate() {
        return policyInceptionDate;
    }

    /**
     * Sets the value of the policyInceptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyInceptionDate(XMLGregorianCalendar value) {
        this.policyInceptionDate = value;
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
     * Gets the value of the previousPolicyEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousPolicyEffDate() {
        return previousPolicyEffDate;
    }

    /**
     * Sets the value of the previousPolicyEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousPolicyEffDate(XMLGregorianCalendar value) {
        this.previousPolicyEffDate = value;
    }

    /**
     * Gets the value of the previousPolicyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousPolicyNo() {
        return previousPolicyNo;
    }

    /**
     * Sets the value of the previousPolicyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousPolicyNo(String value) {
        this.previousPolicyNo = value;
    }

    /**
     * Gets the value of the primaryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLocation() {
        return primaryLocation;
    }

    /**
     * Sets the value of the primaryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLocation(String value) {
        this.primaryLocation = value;
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
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramType(String value) {
        this.programType = value;
    }

    /**
     * Gets the value of the receivableDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivableDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivableDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceivableDetails }
     * 
     * 
     */
    public List<ReceivableDetails> getReceivableDetails() {
        if (receivableDetails == null) {
            receivableDetails = new ArrayList<ReceivableDetails>();
        }
        return this.receivableDetails;
    }

    /**
     * Gets the value of the recurringEftTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringEftTokenId() {
        return recurringEftTokenId;
    }

    /**
     * Sets the value of the recurringEftTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringEftTokenId(String value) {
        this.recurringEftTokenId = value;
    }

    /**
     * Gets the value of the requestedDueDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedDueDay() {
        return requestedDueDay;
    }

    /**
     * Sets the value of the requestedDueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedDueDay(BigDecimal value) {
        this.requestedDueDay = value;
    }

    /**
     * Gets the value of the sdipRatingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSDIPRatingPlan() {
        return sdipRatingPlan;
    }

    /**
     * Sets the value of the sdipRatingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSDIPRatingPlan(BigDecimal value) {
        this.sdipRatingPlan = value;
    }

    /**
     * Gets the value of the siuFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiuFlag() {
        return siuFlag;
    }

    /**
     * Sets the value of the siuFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiuFlag(String value) {
        this.siuFlag = value;
    }

    /**
     * Gets the value of the slidingScaleCommissionSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slidingScaleCommissionSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlidingScaleCommissionSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InboundSlidingScaleCommission }
     * 
     * 
     */
    public List<InboundSlidingScaleCommission> getSlidingScaleCommissionSchedule() {
        if (slidingScaleCommissionSchedule == null) {
            slidingScaleCommissionSchedule = new ArrayList<InboundSlidingScaleCommission>();
        }
        return this.slidingScaleCommissionSchedule;
    }

    /**
     * Gets the value of the slidingScaleCommissionYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlidingScaleCommissionYN() {
        return slidingScaleCommissionYN;
    }

    /**
     * Sets the value of the slidingScaleCommissionYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlidingScaleCommissionYN(String value) {
        this.slidingScaleCommissionYN = value;
    }

    /**
     * Gets the value of the sourceAccountingMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceAccountingMonth() {
        return sourceAccountingMonth;
    }

    /**
     * Sets the value of the sourceAccountingMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceAccountingMonth(BigDecimal value) {
        this.sourceAccountingMonth = value;
    }

    /**
     * Gets the value of the sourcePolicyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePolicyId() {
        return sourcePolicyId;
    }

    /**
     * Sets the value of the sourcePolicyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePolicyId(String value) {
        this.sourcePolicyId = value;
    }

    /**
     * Gets the value of the sourcePolicyMod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourcePolicyMod() {
        return sourcePolicyMod;
    }

    /**
     * Sets the value of the sourcePolicyMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourcePolicyMod(BigDecimal value) {
        this.sourcePolicyMod = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the sourceSystemProcessDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSourceSystemProcessDate() {
        return sourceSystemProcessDate;
    }

    /**
     * Sets the value of the sourceSystemProcessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSourceSystemProcessDate(XMLGregorianCalendar value) {
        this.sourceSystemProcessDate = value;
    }

    /**
     * Gets the value of the sourceSystemRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemRemarks() {
        return sourceSystemRemarks;
    }

    /**
     * Sets the value of the sourceSystemRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemRemarks(String value) {
        this.sourceSystemRemarks = value;
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
     * Gets the value of the sourceSystemUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemUserId() {
        return sourceSystemUserId;
    }

    /**
     * Sets the value of the sourceSystemUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemUserId(String value) {
        this.sourceSystemUserId = value;
    }

    /**
     * Gets the value of the sourceTransactionRequestNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTransactionRequestNo() {
        return sourceTransactionRequestNo;
    }

    /**
     * Sets the value of the sourceTransactionRequestNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTransactionRequestNo(String value) {
        this.sourceTransactionRequestNo = value;
    }

    /**
     * Gets the value of the specialNoticePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecialNoticePeriod() {
        return specialNoticePeriod;
    }

    /**
     * Sets the value of the specialNoticePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecialNoticePeriod(BigDecimal value) {
        this.specialNoticePeriod = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the subbrokerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubbrokerNo() {
        return subbrokerNo;
    }

    /**
     * Sets the value of the subbrokerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubbrokerNo(String value) {
        this.subbrokerNo = value;
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
     * Gets the value of the transactionExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionExpiryDate() {
        return transactionExpiryDate;
    }

    /**
     * Sets the value of the transactionExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionExpiryDate(XMLGregorianCalendar value) {
        this.transactionExpiryDate = value;
    }

    /**
     * Gets the value of the transactionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InboundTransactionReason }
     * 
     * 
     */
    public List<InboundTransactionReason> getTransactionReason() {
        if (transactionReason == null) {
            transactionReason = new ArrayList<InboundTransactionReason>();
        }
        return this.transactionReason;
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

}
