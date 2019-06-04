
package com.majescomastek.stgicd.ws.meta.entityinterface.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.entityinterface.BaseWSVo;


/**
 * <p>Java class for entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/entityinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="AccMonthToBeExtracted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acronym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://com/majescomastek/stgicd/ws/meta/entityinterface/entity}inboundEntityAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AgentStatementEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoCommClosingDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AutoCommExtractionYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionEftTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionEntityYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionPayeeEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionPayeeEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionStatementEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommissionStatementEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditTermDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditTermMonths" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoingBusinessAsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EftDraftOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequencyDayOfMonth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FrequencyDayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FrequencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NcanGraceDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OutputDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Process1099Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurringEftTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedDueDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatementFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatementIndicatorYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatementMailingDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Taxid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entity", propOrder = {
    "accMonthToBeExtracted",
    "acronym",
    "addresses",
    "agentStatementEntityCode",
    "agentType",
    "autoCommClosingDays",
    "autoCommExtractionYN",
    "billingContactName",
    "commissionCurrency",
    "commissionEftTokenId",
    "commissionEntityYN",
    "commissionPayeeEntityCode",
    "commissionPayeeEntityType",
    "commissionPaymentMethod",
    "commissionStatementEntityCode",
    "commissionStatementEntityType",
    "creditTermDays",
    "creditTermMonths",
    "customerNo",
    "doingBusinessAsName",
    "eftDraftOption",
    "entityType",
    "frequencyDayOfMonth",
    "frequencyDayOfWeek",
    "frequencyType",
    "invoicingCurrency",
    "ncanGraceDays",
    "outputDeliveryMethod",
    "parentEntityCode",
    "paymentMethod",
    "process1099Indicator",
    "recurringEftTokenId",
    "requestedDueDay",
    "sourceSystem",
    "sourceSystemEntityCode",
    "ssn",
    "statementFormat",
    "statementIndicatorYN",
    "statementMailingDay",
    "taxid",
    "userRemarks",
    "vendorCode"
})
public class Entity
    extends BaseWSVo
{

    @XmlElement(name = "AccMonthToBeExtracted")
    protected String accMonthToBeExtracted;
    @XmlElement(name = "Acronym")
    protected String acronym;
    @XmlElement(name = "Addresses")
    protected List<InboundEntityAddress> addresses;
    @XmlElement(name = "AgentStatementEntityCode")
    protected String agentStatementEntityCode;
    @XmlElement(name = "AgentType")
    protected String agentType;
    @XmlElement(name = "AutoCommClosingDays")
    protected BigDecimal autoCommClosingDays;
    @XmlElement(name = "AutoCommExtractionYN")
    protected String autoCommExtractionYN;
    @XmlElement(name = "BillingContactName")
    protected String billingContactName;
    @XmlElement(name = "CommissionCurrency")
    protected String commissionCurrency;
    @XmlElement(name = "CommissionEftTokenId")
    protected String commissionEftTokenId;
    @XmlElement(name = "CommissionEntityYN")
    protected String commissionEntityYN;
    @XmlElement(name = "CommissionPayeeEntityCode")
    protected String commissionPayeeEntityCode;
    @XmlElement(name = "CommissionPayeeEntityType")
    protected String commissionPayeeEntityType;
    @XmlElement(name = "CommissionPaymentMethod")
    protected String commissionPaymentMethod;
    @XmlElement(name = "CommissionStatementEntityCode")
    protected String commissionStatementEntityCode;
    @XmlElement(name = "CommissionStatementEntityType")
    protected String commissionStatementEntityType;
    @XmlElement(name = "CreditTermDays")
    protected BigDecimal creditTermDays;
    @XmlElement(name = "CreditTermMonths")
    protected BigDecimal creditTermMonths;
    @XmlElement(name = "CustomerNo")
    protected String customerNo;
    @XmlElement(name = "DoingBusinessAsName")
    protected String doingBusinessAsName;
    @XmlElement(name = "EftDraftOption")
    protected String eftDraftOption;
    @XmlElement(name = "EntityType")
    protected String entityType;
    @XmlElement(name = "FrequencyDayOfMonth")
    protected BigDecimal frequencyDayOfMonth;
    @XmlElement(name = "FrequencyDayOfWeek")
    protected String frequencyDayOfWeek;
    @XmlElement(name = "FrequencyType")
    protected String frequencyType;
    @XmlElement(name = "InvoicingCurrency")
    protected String invoicingCurrency;
    @XmlElement(name = "NcanGraceDays")
    protected BigDecimal ncanGraceDays;
    @XmlElement(name = "OutputDeliveryMethod")
    protected String outputDeliveryMethod;
    @XmlElement(name = "ParentEntityCode")
    protected String parentEntityCode;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "Process1099Indicator")
    protected String process1099Indicator;
    @XmlElement(name = "RecurringEftTokenId")
    protected String recurringEftTokenId;
    @XmlElement(name = "RequestedDueDay")
    protected BigDecimal requestedDueDay;
    @XmlElement(name = "SourceSystem")
    protected String sourceSystem;
    @XmlElement(name = "SourceSystemEntityCode")
    protected String sourceSystemEntityCode;
    @XmlElement(name = "Ssn")
    protected String ssn;
    @XmlElement(name = "StatementFormat")
    protected String statementFormat;
    @XmlElement(name = "StatementIndicatorYN")
    protected String statementIndicatorYN;
    @XmlElement(name = "StatementMailingDay")
    protected BigDecimal statementMailingDay;
    @XmlElement(name = "Taxid")
    protected String taxid;
    @XmlElement(name = "UserRemarks")
    protected String userRemarks;
    @XmlElement(name = "VendorCode")
    protected String vendorCode;

    /**
     * Gets the value of the accMonthToBeExtracted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccMonthToBeExtracted() {
        return accMonthToBeExtracted;
    }

    /**
     * Sets the value of the accMonthToBeExtracted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccMonthToBeExtracted(String value) {
        this.accMonthToBeExtracted = value;
    }

    /**
     * Gets the value of the acronym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * Sets the value of the acronym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcronym(String value) {
        this.acronym = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InboundEntityAddress }
     * 
     * 
     */
    public List<InboundEntityAddress> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<InboundEntityAddress>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the agentStatementEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentStatementEntityCode() {
        return agentStatementEntityCode;
    }

    /**
     * Sets the value of the agentStatementEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentStatementEntityCode(String value) {
        this.agentStatementEntityCode = value;
    }

    /**
     * Gets the value of the agentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentType() {
        return agentType;
    }

    /**
     * Sets the value of the agentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentType(String value) {
        this.agentType = value;
    }

    /**
     * Gets the value of the autoCommClosingDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutoCommClosingDays() {
        return autoCommClosingDays;
    }

    /**
     * Sets the value of the autoCommClosingDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAutoCommClosingDays(BigDecimal value) {
        this.autoCommClosingDays = value;
    }

    /**
     * Gets the value of the autoCommExtractionYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoCommExtractionYN() {
        return autoCommExtractionYN;
    }

    /**
     * Sets the value of the autoCommExtractionYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoCommExtractionYN(String value) {
        this.autoCommExtractionYN = value;
    }

    /**
     * Gets the value of the billingContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContactName() {
        return billingContactName;
    }

    /**
     * Sets the value of the billingContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContactName(String value) {
        this.billingContactName = value;
    }

    /**
     * Gets the value of the commissionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionCurrency() {
        return commissionCurrency;
    }

    /**
     * Sets the value of the commissionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionCurrency(String value) {
        this.commissionCurrency = value;
    }

    /**
     * Gets the value of the commissionEftTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionEftTokenId() {
        return commissionEftTokenId;
    }

    /**
     * Sets the value of the commissionEftTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionEftTokenId(String value) {
        this.commissionEftTokenId = value;
    }

    /**
     * Gets the value of the commissionEntityYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionEntityYN() {
        return commissionEntityYN;
    }

    /**
     * Sets the value of the commissionEntityYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionEntityYN(String value) {
        this.commissionEntityYN = value;
    }

    /**
     * Gets the value of the commissionPayeeEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPayeeEntityCode() {
        return commissionPayeeEntityCode;
    }

    /**
     * Sets the value of the commissionPayeeEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPayeeEntityCode(String value) {
        this.commissionPayeeEntityCode = value;
    }

    /**
     * Gets the value of the commissionPayeeEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPayeeEntityType() {
        return commissionPayeeEntityType;
    }

    /**
     * Sets the value of the commissionPayeeEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPayeeEntityType(String value) {
        this.commissionPayeeEntityType = value;
    }

    /**
     * Gets the value of the commissionPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPaymentMethod() {
        return commissionPaymentMethod;
    }

    /**
     * Sets the value of the commissionPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPaymentMethod(String value) {
        this.commissionPaymentMethod = value;
    }

    /**
     * Gets the value of the commissionStatementEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionStatementEntityCode() {
        return commissionStatementEntityCode;
    }

    /**
     * Sets the value of the commissionStatementEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionStatementEntityCode(String value) {
        this.commissionStatementEntityCode = value;
    }

    /**
     * Gets the value of the commissionStatementEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionStatementEntityType() {
        return commissionStatementEntityType;
    }

    /**
     * Sets the value of the commissionStatementEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionStatementEntityType(String value) {
        this.commissionStatementEntityType = value;
    }

    /**
     * Gets the value of the creditTermDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditTermDays() {
        return creditTermDays;
    }

    /**
     * Sets the value of the creditTermDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditTermDays(BigDecimal value) {
        this.creditTermDays = value;
    }

    /**
     * Gets the value of the creditTermMonths property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditTermMonths() {
        return creditTermMonths;
    }

    /**
     * Sets the value of the creditTermMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditTermMonths(BigDecimal value) {
        this.creditTermMonths = value;
    }

    /**
     * Gets the value of the customerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNo(String value) {
        this.customerNo = value;
    }

    /**
     * Gets the value of the doingBusinessAsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoingBusinessAsName() {
        return doingBusinessAsName;
    }

    /**
     * Sets the value of the doingBusinessAsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoingBusinessAsName(String value) {
        this.doingBusinessAsName = value;
    }

    /**
     * Gets the value of the eftDraftOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEftDraftOption() {
        return eftDraftOption;
    }

    /**
     * Sets the value of the eftDraftOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEftDraftOption(String value) {
        this.eftDraftOption = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the frequencyDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrequencyDayOfMonth() {
        return frequencyDayOfMonth;
    }

    /**
     * Sets the value of the frequencyDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrequencyDayOfMonth(BigDecimal value) {
        this.frequencyDayOfMonth = value;
    }

    /**
     * Gets the value of the frequencyDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyDayOfWeek() {
        return frequencyDayOfWeek;
    }

    /**
     * Sets the value of the frequencyDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyDayOfWeek(String value) {
        this.frequencyDayOfWeek = value;
    }

    /**
     * Gets the value of the frequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyType() {
        return frequencyType;
    }

    /**
     * Sets the value of the frequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyType(String value) {
        this.frequencyType = value;
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
     * Gets the value of the ncanGraceDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNcanGraceDays() {
        return ncanGraceDays;
    }

    /**
     * Sets the value of the ncanGraceDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNcanGraceDays(BigDecimal value) {
        this.ncanGraceDays = value;
    }

    /**
     * Gets the value of the outputDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDeliveryMethod() {
        return outputDeliveryMethod;
    }

    /**
     * Sets the value of the outputDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDeliveryMethod(String value) {
        this.outputDeliveryMethod = value;
    }

    /**
     * Gets the value of the parentEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEntityCode() {
        return parentEntityCode;
    }

    /**
     * Sets the value of the parentEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEntityCode(String value) {
        this.parentEntityCode = value;
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
     * Gets the value of the process1099Indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcess1099Indicator() {
        return process1099Indicator;
    }

    /**
     * Sets the value of the process1099Indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcess1099Indicator(String value) {
        this.process1099Indicator = value;
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
     * Gets the value of the sourceSystemEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemEntityCode() {
        return sourceSystemEntityCode;
    }

    /**
     * Sets the value of the sourceSystemEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemEntityCode(String value) {
        this.sourceSystemEntityCode = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the statementFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementFormat() {
        return statementFormat;
    }

    /**
     * Sets the value of the statementFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementFormat(String value) {
        this.statementFormat = value;
    }

    /**
     * Gets the value of the statementIndicatorYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementIndicatorYN() {
        return statementIndicatorYN;
    }

    /**
     * Sets the value of the statementIndicatorYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementIndicatorYN(String value) {
        this.statementIndicatorYN = value;
    }

    /**
     * Gets the value of the statementMailingDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStatementMailingDay() {
        return statementMailingDay;
    }

    /**
     * Sets the value of the statementMailingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStatementMailingDay(BigDecimal value) {
        this.statementMailingDay = value;
    }

    /**
     * Gets the value of the taxid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxid() {
        return taxid;
    }

    /**
     * Sets the value of the taxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxid(String value) {
        this.taxid = value;
    }

    /**
     * Gets the value of the userRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRemarks() {
        return userRemarks;
    }

    /**
     * Sets the value of the userRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRemarks(String value) {
        this.userRemarks = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

}
