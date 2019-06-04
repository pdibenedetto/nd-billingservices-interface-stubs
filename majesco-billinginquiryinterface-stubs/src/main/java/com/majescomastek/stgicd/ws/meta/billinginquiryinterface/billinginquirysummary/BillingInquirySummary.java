
package com.majescomastek.stgicd.ws.meta.billinginquiryinterface.billinginquirysummary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.majescomastek.stgicd.ws.meta.billinginquiryinterface.BaseWSVo;


/**
 * <p>Java class for billingInquirySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingInquirySummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingCycleDueDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BillingInquiryEntityDetail" type="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface/billinginquirysummary}billingInquiryEntityDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillingInquiryInstallments" type="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface/billinginquirysummary}billingInquiryInstallments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillingInquiryInvoiceDetail" type="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface/billinginquirysummary}billingInquiryInvoiceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillingInquiryNOCDetail" type="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface/billinginquirysummary}billingInquiryNOCDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillingInquiryReceivableDetail" type="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface/billinginquirysummary}billingInquiryReceivableDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillingInquiryTransactions" type="{http://com/majescomastek/stgicd/ws/meta/billinginquiryinterface/billinginquirysummary}billingInquiryTransactions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrokerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CancellationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationMethodDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoverningState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HoldSuspendFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldSuspendReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldSuspendReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldSuspendReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LineofBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingCompanyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutputDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentPlanDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyCreatedOn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PresentationDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgramTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SublineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspendNOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspendNOCReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspendNOCReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SystemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnderwritingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnderwritingCompanyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingInquirySummary", propOrder = {
    "accountNo",
    "address1",
    "address2",
    "billingCycleDueDay",
    "billingInquiryEntityDetail",
    "billingInquiryInstallments",
    "billingInquiryInvoiceDetail",
    "billingInquiryNOCDetail",
    "billingInquiryReceivableDetail",
    "billingInquiryTransactions",
    "billType",
    "brokerNo",
    "cancellationDate",
    "cancellationMethod",
    "cancellationMethodDescription",
    "cancellationReason",
    "cancellationReasonDescription",
    "city",
    "collectionAgencyName",
    "collectionFlag",
    "country",
    "county",
    "entityType",
    "fullName",
    "governingState",
    "holdDate",
    "holdSuspendFlag",
    "holdSuspendReason",
    "holdSuspendReasonDescription",
    "holdSuspendReleaseDate",
    "lineofBusiness",
    "operatingCompany",
    "operatingCompanyDescription",
    "outputDeliveryMethod",
    "paymentMethod",
    "paymentPlan",
    "paymentPlanDescription",
    "policyCreatedOn",
    "policyEffectiveDate",
    "policyExpirationDate",
    "policyNo",
    "policyStatusDescription",
    "presentationDays",
    "productCode",
    "productCodeDescription",
    "programType",
    "programTypeDescription",
    "sourceSystem",
    "state",
    "sublineOfBusiness",
    "suspendNOCFlag",
    "suspendNOCReason",
    "suspendNOCReleaseDate",
    "systemStatus",
    "underwritingCompany",
    "underwritingCompanyDescription",
    "zipCode"
})
public class BillingInquirySummary
    extends BaseWSVo
{

    @XmlElement(name = "AccountNo")
    protected String accountNo;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "BillingCycleDueDay")
    protected BigDecimal billingCycleDueDay;
    @XmlElement(name = "BillingInquiryEntityDetail")
    protected List<BillingInquiryEntityDetail> billingInquiryEntityDetail;
    @XmlElement(name = "BillingInquiryInstallments")
    protected List<BillingInquiryInstallments> billingInquiryInstallments;
    @XmlElement(name = "BillingInquiryInvoiceDetail")
    protected List<BillingInquiryInvoiceDetail> billingInquiryInvoiceDetail;
    @XmlElement(name = "BillingInquiryNOCDetail")
    protected List<BillingInquiryNOCDetail> billingInquiryNOCDetail;
    @XmlElement(name = "BillingInquiryReceivableDetail")
    protected List<BillingInquiryReceivableDetail> billingInquiryReceivableDetail;
    @XmlElement(name = "BillingInquiryTransactions")
    protected List<BillingInquiryTransactions> billingInquiryTransactions;
    @XmlElement(name = "BillType")
    protected String billType;
    @XmlElement(name = "BrokerNo")
    protected String brokerNo;
    @XmlElement(name = "CancellationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "CancellationMethod")
    protected String cancellationMethod;
    @XmlElement(name = "CancellationMethodDescription")
    protected String cancellationMethodDescription;
    @XmlElement(name = "CancellationReason")
    protected String cancellationReason;
    @XmlElement(name = "CancellationReasonDescription")
    protected String cancellationReasonDescription;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "CollectionAgencyName")
    protected String collectionAgencyName;
    @XmlElement(name = "CollectionFlag")
    protected String collectionFlag;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "EntityType")
    protected String entityType;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "GoverningState")
    protected String governingState;
    @XmlElement(name = "HoldDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar holdDate;
    @XmlElement(name = "HoldSuspendFlag")
    protected String holdSuspendFlag;
    @XmlElement(name = "HoldSuspendReason")
    protected String holdSuspendReason;
    @XmlElement(name = "HoldSuspendReasonDescription")
    protected String holdSuspendReasonDescription;
    @XmlElement(name = "HoldSuspendReleaseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar holdSuspendReleaseDate;
    @XmlElement(name = "LineofBusiness")
    protected String lineofBusiness;
    @XmlElement(name = "OperatingCompany")
    protected String operatingCompany;
    @XmlElement(name = "OperatingCompanyDescription")
    protected String operatingCompanyDescription;
    @XmlElement(name = "OutputDeliveryMethod")
    protected String outputDeliveryMethod;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "PaymentPlan")
    protected String paymentPlan;
    @XmlElement(name = "PaymentPlanDescription")
    protected String paymentPlanDescription;
    @XmlElement(name = "PolicyCreatedOn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyCreatedOn;
    @XmlElement(name = "PolicyEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyEffectiveDate;
    @XmlElement(name = "PolicyExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyExpirationDate;
    @XmlElement(name = "PolicyNo")
    protected String policyNo;
    @XmlElement(name = "PolicyStatusDescription")
    protected String policyStatusDescription;
    @XmlElement(name = "PresentationDays")
    protected BigDecimal presentationDays;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "ProductCodeDescription")
    protected String productCodeDescription;
    @XmlElement(name = "ProgramType")
    protected String programType;
    @XmlElement(name = "ProgramTypeDescription")
    protected String programTypeDescription;
    @XmlElement(name = "SourceSystem")
    protected String sourceSystem;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "SublineOfBusiness")
    protected String sublineOfBusiness;
    @XmlElement(name = "SuspendNOCFlag")
    protected String suspendNOCFlag;
    @XmlElement(name = "SuspendNOCReason")
    protected String suspendNOCReason;
    @XmlElement(name = "SuspendNOCReleaseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspendNOCReleaseDate;
    @XmlElement(name = "SystemStatus")
    protected String systemStatus;
    @XmlElement(name = "UnderwritingCompany")
    protected String underwritingCompany;
    @XmlElement(name = "UnderwritingCompanyDescription")
    protected String underwritingCompanyDescription;
    @XmlElement(name = "ZipCode")
    protected String zipCode;

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
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the billingCycleDueDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillingCycleDueDay() {
        return billingCycleDueDay;
    }

    /**
     * Sets the value of the billingCycleDueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillingCycleDueDay(BigDecimal value) {
        this.billingCycleDueDay = value;
    }

    /**
     * Gets the value of the billingInquiryEntityDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingInquiryEntityDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingInquiryEntityDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingInquiryEntityDetail }
     * 
     * 
     */
    public List<BillingInquiryEntityDetail> getBillingInquiryEntityDetail() {
        if (billingInquiryEntityDetail == null) {
            billingInquiryEntityDetail = new ArrayList<BillingInquiryEntityDetail>();
        }
        return this.billingInquiryEntityDetail;
    }

    /**
     * Gets the value of the billingInquiryInstallments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingInquiryInstallments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingInquiryInstallments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingInquiryInstallments }
     * 
     * 
     */
    public List<BillingInquiryInstallments> getBillingInquiryInstallments() {
        if (billingInquiryInstallments == null) {
            billingInquiryInstallments = new ArrayList<BillingInquiryInstallments>();
        }
        return this.billingInquiryInstallments;
    }

    /**
     * Gets the value of the billingInquiryInvoiceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingInquiryInvoiceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingInquiryInvoiceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingInquiryInvoiceDetail }
     * 
     * 
     */
    public List<BillingInquiryInvoiceDetail> getBillingInquiryInvoiceDetail() {
        if (billingInquiryInvoiceDetail == null) {
            billingInquiryInvoiceDetail = new ArrayList<BillingInquiryInvoiceDetail>();
        }
        return this.billingInquiryInvoiceDetail;
    }

    /**
     * Gets the value of the billingInquiryNOCDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingInquiryNOCDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingInquiryNOCDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingInquiryNOCDetail }
     * 
     * 
     */
    public List<BillingInquiryNOCDetail> getBillingInquiryNOCDetail() {
        if (billingInquiryNOCDetail == null) {
            billingInquiryNOCDetail = new ArrayList<BillingInquiryNOCDetail>();
        }
        return this.billingInquiryNOCDetail;
    }

    /**
     * Gets the value of the billingInquiryReceivableDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingInquiryReceivableDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingInquiryReceivableDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingInquiryReceivableDetail }
     * 
     * 
     */
    public List<BillingInquiryReceivableDetail> getBillingInquiryReceivableDetail() {
        if (billingInquiryReceivableDetail == null) {
            billingInquiryReceivableDetail = new ArrayList<BillingInquiryReceivableDetail>();
        }
        return this.billingInquiryReceivableDetail;
    }

    /**
     * Gets the value of the billingInquiryTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingInquiryTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingInquiryTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingInquiryTransactions }
     * 
     * 
     */
    public List<BillingInquiryTransactions> getBillingInquiryTransactions() {
        if (billingInquiryTransactions == null) {
            billingInquiryTransactions = new ArrayList<BillingInquiryTransactions>();
        }
        return this.billingInquiryTransactions;
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
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
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
     * Gets the value of the cancellationMethodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationMethodDescription() {
        return cancellationMethodDescription;
    }

    /**
     * Sets the value of the cancellationMethodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationMethodDescription(String value) {
        this.cancellationMethodDescription = value;
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
     * Gets the value of the cancellationReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationReasonDescription() {
        return cancellationReasonDescription;
    }

    /**
     * Sets the value of the cancellationReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationReasonDescription(String value) {
        this.cancellationReasonDescription = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the collectionAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionAgencyName() {
        return collectionAgencyName;
    }

    /**
     * Sets the value of the collectionAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionAgencyName(String value) {
        this.collectionAgencyName = value;
    }

    /**
     * Gets the value of the collectionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionFlag() {
        return collectionFlag;
    }

    /**
     * Sets the value of the collectionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionFlag(String value) {
        this.collectionFlag = value;
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
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
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
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the governingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoverningState() {
        return governingState;
    }

    /**
     * Sets the value of the governingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoverningState(String value) {
        this.governingState = value;
    }

    /**
     * Gets the value of the holdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoldDate() {
        return holdDate;
    }

    /**
     * Sets the value of the holdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoldDate(XMLGregorianCalendar value) {
        this.holdDate = value;
    }

    /**
     * Gets the value of the holdSuspendFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldSuspendFlag() {
        return holdSuspendFlag;
    }

    /**
     * Sets the value of the holdSuspendFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldSuspendFlag(String value) {
        this.holdSuspendFlag = value;
    }

    /**
     * Gets the value of the holdSuspendReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldSuspendReason() {
        return holdSuspendReason;
    }

    /**
     * Sets the value of the holdSuspendReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldSuspendReason(String value) {
        this.holdSuspendReason = value;
    }

    /**
     * Gets the value of the holdSuspendReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldSuspendReasonDescription() {
        return holdSuspendReasonDescription;
    }

    /**
     * Sets the value of the holdSuspendReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldSuspendReasonDescription(String value) {
        this.holdSuspendReasonDescription = value;
    }

    /**
     * Gets the value of the holdSuspendReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoldSuspendReleaseDate() {
        return holdSuspendReleaseDate;
    }

    /**
     * Sets the value of the holdSuspendReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoldSuspendReleaseDate(XMLGregorianCalendar value) {
        this.holdSuspendReleaseDate = value;
    }

    /**
     * Gets the value of the lineofBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineofBusiness() {
        return lineofBusiness;
    }

    /**
     * Sets the value of the lineofBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineofBusiness(String value) {
        this.lineofBusiness = value;
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
     * Gets the value of the operatingCompanyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCompanyDescription() {
        return operatingCompanyDescription;
    }

    /**
     * Sets the value of the operatingCompanyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCompanyDescription(String value) {
        this.operatingCompanyDescription = value;
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
     * Gets the value of the paymentPlanDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPlanDescription() {
        return paymentPlanDescription;
    }

    /**
     * Sets the value of the paymentPlanDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPlanDescription(String value) {
        this.paymentPlanDescription = value;
    }

    /**
     * Gets the value of the policyCreatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyCreatedOn() {
        return policyCreatedOn;
    }

    /**
     * Sets the value of the policyCreatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyCreatedOn(XMLGregorianCalendar value) {
        this.policyCreatedOn = value;
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
     * Gets the value of the policyStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyStatusDescription() {
        return policyStatusDescription;
    }

    /**
     * Sets the value of the policyStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyStatusDescription(String value) {
        this.policyStatusDescription = value;
    }

    /**
     * Gets the value of the presentationDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPresentationDays() {
        return presentationDays;
    }

    /**
     * Sets the value of the presentationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPresentationDays(BigDecimal value) {
        this.presentationDays = value;
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
     * Gets the value of the productCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCodeDescription() {
        return productCodeDescription;
    }

    /**
     * Sets the value of the productCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCodeDescription(String value) {
        this.productCodeDescription = value;
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
     * Gets the value of the programTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramTypeDescription() {
        return programTypeDescription;
    }

    /**
     * Sets the value of the programTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramTypeDescription(String value) {
        this.programTypeDescription = value;
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
     * Gets the value of the suspendNOCFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendNOCFlag() {
        return suspendNOCFlag;
    }

    /**
     * Sets the value of the suspendNOCFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendNOCFlag(String value) {
        this.suspendNOCFlag = value;
    }

    /**
     * Gets the value of the suspendNOCReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendNOCReason() {
        return suspendNOCReason;
    }

    /**
     * Sets the value of the suspendNOCReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendNOCReason(String value) {
        this.suspendNOCReason = value;
    }

    /**
     * Gets the value of the suspendNOCReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendNOCReleaseDate() {
        return suspendNOCReleaseDate;
    }

    /**
     * Sets the value of the suspendNOCReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendNOCReleaseDate(XMLGregorianCalendar value) {
        this.suspendNOCReleaseDate = value;
    }

    /**
     * Gets the value of the systemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemStatus() {
        return systemStatus;
    }

    /**
     * Sets the value of the systemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemStatus(String value) {
        this.systemStatus = value;
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
     * Gets the value of the underwritingCompanyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderwritingCompanyDescription() {
        return underwritingCompanyDescription;
    }

    /**
     * Sets the value of the underwritingCompanyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderwritingCompanyDescription(String value) {
        this.underwritingCompanyDescription = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
