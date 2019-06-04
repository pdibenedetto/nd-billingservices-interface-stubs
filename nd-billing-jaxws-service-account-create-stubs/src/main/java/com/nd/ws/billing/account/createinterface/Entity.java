
package com.nd.ws.billing.account.createinterface;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/nd/ws/billing/account/createinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="BillTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DoingBusinessAsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityAddressList" type="{http://com/nd/ws/billing/account/createinterface}entityAddress" maxOccurs="unbounded"/>
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstrumentDetail" type="{http://com/nd/ws/billing/account/createinterface}instrumentDetail" minOccurs="0"/>
 *         &lt;element name="InvoicingCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PolicyList" type="{http://com/nd/ws/billing/account/createinterface}policy" maxOccurs="unbounded"/>
 *         &lt;element name="RecurringEftTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedDueDay" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SourceSystemEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "billTo",
    "billType",
    "doingBusinessAsName",
    "entityAddressList",
    "entityType",
    "instrumentDetail",
    "invoicingCurrency",
    "paymentMethod",
    "policyList",
    "recurringEftTokenId",
    "requestedDueDay",
    "sourceSystem",
    "sourceSystemEntityCode"
})
public class Entity
    extends BaseWSVo
{

    @XmlElement(name = "BillTo", required = true)
    protected String billTo;
    @XmlElement(name = "BillType", required = true)
    protected String billType;
    @XmlElementRef(name = "DoingBusinessAsName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doingBusinessAsName;
    @XmlElement(name = "EntityAddressList", required = true)
    protected List<EntityAddress> entityAddressList;
    @XmlElement(name = "EntityType", required = true)
    protected String entityType;
    @XmlElement(name = "InstrumentDetail")
    protected InstrumentDetail instrumentDetail;
    @XmlElement(name = "InvoicingCurrency", required = true)
    protected String invoicingCurrency;
    @XmlElement(name = "PaymentMethod", required = true)
    protected String paymentMethod;
    @XmlElement(name = "PolicyList", required = true)
    protected List<Policy> policyList;
    @XmlElementRef(name = "RecurringEftTokenId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recurringEftTokenId;
    @XmlElementRef(name = "RequestedDueDay", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requestedDueDay;
    @XmlElement(name = "SourceSystem", required = true)
    protected String sourceSystem;
    @XmlElementRef(name = "SourceSystemEntityCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystemEntityCode;

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
     * Gets the value of the doingBusinessAsName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoingBusinessAsName() {
        return doingBusinessAsName;
    }

    /**
     * Sets the value of the doingBusinessAsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoingBusinessAsName(JAXBElement<String> value) {
        this.doingBusinessAsName = value;
    }

    /**
     * Gets the value of the entityAddressList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityAddressList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityAddressList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityAddress }
     * 
     * 
     */
    public List<EntityAddress> getEntityAddressList() {
        if (entityAddressList == null) {
            entityAddressList = new ArrayList<EntityAddress>();
        }
        return this.entityAddressList;
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
     * Gets the value of the instrumentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentDetail }
     *     
     */
    public InstrumentDetail getInstrumentDetail() {
        return instrumentDetail;
    }

    /**
     * Sets the value of the instrumentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentDetail }
     *     
     */
    public void setInstrumentDetail(InstrumentDetail value) {
        this.instrumentDetail = value;
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
     * Gets the value of the policyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Policy }
     * 
     * 
     */
    public List<Policy> getPolicyList() {
        if (policyList == null) {
            policyList = new ArrayList<Policy>();
        }
        return this.policyList;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystemEntityCode() {
        return sourceSystemEntityCode;
    }

    /**
     * Sets the value of the sourceSystemEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystemEntityCode(JAXBElement<String> value) {
        this.sourceSystemEntityCode = value;
    }

}
