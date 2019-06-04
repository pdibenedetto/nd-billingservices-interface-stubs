
package com.nd.ws.billing.account.searchinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for policy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/nd/ws/billing/account/searchinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrokerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicingCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonCancellableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyEntityList" type="{http://com/nd/ws/billing/account/searchinterface}policyEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PolicyEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PolicyInceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PolicyNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PreviousPolicyEffDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PreviousPolicyNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurringEftTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RenewalCounter" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RequestedDueDay" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SDIPRatingPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiuFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubbrokerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SublineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "policy", propOrder = {
    "accountNo",
    "billTo",
    "billType",
    "brokerNo",
    "country",
    "groupNo",
    "invoicingCurrency",
    "lineOfBusiness",
    "nonRenewalFlag",
    "nonCancellableFlag",
    "operatingCompany",
    "operatingRegion",
    "paymentMethod",
    "paymentPlan",
    "policyEntityList",
    "policyEffectiveDate",
    "policyInceptionDate",
    "policyNo",
    "previousPolicyEffDate",
    "previousPolicyNo",
    "productCode",
    "programType",
    "recurringEftTokenId",
    "renewalCounter",
    "requestedDueDay",
    "sdipRatingPlan",
    "siuFlag",
    "sourceSystem",
    "stateCode",
    "subbrokerNo",
    "sublineOfBusiness",
    "underwritingCompany"
})
public class Policy
    extends BaseWSVo
{

    @XmlElement(name = "AccountNo")
    protected String accountNo;
    @XmlElement(name = "BillTo")
    protected String billTo;
    @XmlElement(name = "BillType")
    protected String billType;
    @XmlElement(name = "BrokerNo")
    protected String brokerNo;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "GroupNo")
    protected String groupNo;
    @XmlElement(name = "InvoicingCurrency", required = true)
    protected String invoicingCurrency;
    @XmlElement(name = "LineOfBusiness")
    protected String lineOfBusiness;
    @XmlElement(name = "NonRenewalFlag")
    protected String nonRenewalFlag;
    @XmlElement(name = "NonCancellableFlag")
    protected String nonCancellableFlag;
    @XmlElement(name = "OperatingCompany")
    protected String operatingCompany;
    @XmlElement(name = "OperatingRegion")
    protected String operatingRegion;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "PaymentPlan")
    protected String paymentPlan;
    @XmlElement(name = "PolicyEntityList", nillable = true)
    protected List<PolicyEntity> policyEntityList;
    @XmlElement(name = "PolicyEffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar policyEffectiveDate;
    @XmlElementRef(name = "PolicyInceptionDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> policyInceptionDate;
    @XmlElement(name = "PolicyNo", required = true)
    protected String policyNo;
    @XmlElementRef(name = "PreviousPolicyEffDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> previousPolicyEffDate;
    @XmlElement(name = "PreviousPolicyNo")
    protected String previousPolicyNo;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "ProgramType")
    protected String programType;
    @XmlElementRef(name = "RecurringEftTokenId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recurringEftTokenId;
    @XmlElement(name = "RenewalCounter")
    protected Long renewalCounter;
    @XmlElementRef(name = "RequestedDueDay", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requestedDueDay;
    @XmlElement(name = "SDIPRatingPlan")
    protected String sdipRatingPlan;
    @XmlElement(name = "SiuFlag")
    protected String siuFlag;
    @XmlElement(name = "SourceSystem", required = true)
    protected String sourceSystem;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "SubbrokerNo")
    protected String subbrokerNo;
    @XmlElement(name = "SublineOfBusiness")
    protected String sublineOfBusiness;
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
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillTo(String value) {
        this.billTo = value;
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
     * Gets the value of the nonCancellableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonCancellableFlag() {
        return nonCancellableFlag;
    }

    /**
     * Sets the value of the nonCancellableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonCancellableFlag(String value) {
        this.nonCancellableFlag = value;
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
     * Gets the value of the policyEntityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyEntityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyEntityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyEntity }
     * 
     * 
     */
    public List<PolicyEntity> getPolicyEntityList() {
        if (policyEntityList == null) {
            policyEntityList = new ArrayList<PolicyEntity>();
        }
        return this.policyEntityList;
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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPolicyInceptionDate() {
        return policyInceptionDate;
    }

    /**
     * Sets the value of the policyInceptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPolicyInceptionDate(JAXBElement<XMLGregorianCalendar> value) {
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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPreviousPolicyEffDate() {
        return previousPolicyEffDate;
    }

    /**
     * Sets the value of the previousPolicyEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPreviousPolicyEffDate(JAXBElement<XMLGregorianCalendar> value) {
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
     * Gets the value of the recurringEftTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecurringEftTokenId() {
        return recurringEftTokenId;
    }

    /**
     * Sets the value of the recurringEftTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecurringEftTokenId(JAXBElement<String> value) {
        this.recurringEftTokenId = value;
    }

    /**
     * Gets the value of the renewalCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRenewalCounter() {
        return renewalCounter;
    }

    /**
     * Sets the value of the renewalCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRenewalCounter(Long value) {
        this.renewalCounter = value;
    }

    /**
     * Gets the value of the requestedDueDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequestedDueDay() {
        return requestedDueDay;
    }

    /**
     * Sets the value of the requestedDueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequestedDueDay(JAXBElement<Long> value) {
        this.requestedDueDay = value;
    }

    /**
     * Gets the value of the sdipRatingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDIPRatingPlan() {
        return sdipRatingPlan;
    }

    /**
     * Sets the value of the sdipRatingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDIPRatingPlan(String value) {
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
