
package com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.BaseWSVo;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.transaction.inboundentity.InboundEntityAddress;


/**
 * <p>Java class for inboundEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inboundEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="Acronym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend/transaction/inboundentity}inboundEntityAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillingEntityYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoingBusinessAsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MortgageeBillingEntityYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutputDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "inboundEntity", propOrder = {
    "acronym",
    "addresses",
    "billingEntityYn",
    "doingBusinessAsName",
    "entityType",
    "loanNo",
    "mortgageeBillingEntityYn",
    "outputDeliveryMethod",
    "sourceSystemEntityCode"
})
public class InboundEntity
    extends BaseWSVo
{

    @XmlElement(name = "Acronym")
    protected String acronym;
    @XmlElement(name = "Addresses")
    protected List<InboundEntityAddress> addresses;
    @XmlElement(name = "BillingEntityYn")
    protected String billingEntityYn;
    @XmlElement(name = "DoingBusinessAsName")
    protected String doingBusinessAsName;
    @XmlElement(name = "EntityType")
    protected String entityType;
    @XmlElement(name = "LoanNo")
    protected String loanNo;
    @XmlElement(name = "MortgageeBillingEntityYn")
    protected String mortgageeBillingEntityYn;
    @XmlElement(name = "OutputDeliveryMethod")
    protected String outputDeliveryMethod;
    @XmlElement(name = "SourceSystemEntityCode")
    protected String sourceSystemEntityCode;

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
     * Gets the value of the billingEntityYn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingEntityYn() {
        return billingEntityYn;
    }

    /**
     * Sets the value of the billingEntityYn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingEntityYn(String value) {
        this.billingEntityYn = value;
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
     * Gets the value of the loanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanNo() {
        return loanNo;
    }

    /**
     * Sets the value of the loanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanNo(String value) {
        this.loanNo = value;
    }

    /**
     * Gets the value of the mortgageeBillingEntityYn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageeBillingEntityYn() {
        return mortgageeBillingEntityYn;
    }

    /**
     * Sets the value of the mortgageeBillingEntityYn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageeBillingEntityYn(String value) {
        this.mortgageeBillingEntityYn = value;
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

}
