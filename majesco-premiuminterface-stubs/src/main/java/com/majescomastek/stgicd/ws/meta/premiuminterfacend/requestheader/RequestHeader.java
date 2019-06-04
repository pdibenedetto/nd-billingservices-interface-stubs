
package com.majescomastek.stgicd.ws.meta.premiuminterfacend.requestheader;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.majescomastek.stgicd.ws.meta.premiuminterfacend.BaseWSVo;


/**
 * <p>Java class for requestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/majescomastek/stgicd/ws/meta/premiuminterfacend}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="CountOfRecords" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CountOfTransactions" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SourceSystemRequestNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalCommissionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalReceivableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValidateCountYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestHeader", propOrder = {
    "countOfRecords",
    "countOfTransactions",
    "requestDate",
    "sourceSystemRequestNo",
    "totalCommissionAmount",
    "totalReceivableAmount",
    "validateCountYN"
})
public class RequestHeader
    extends BaseWSVo
{

    @XmlElement(name = "CountOfRecords")
    protected BigDecimal countOfRecords;
    @XmlElement(name = "CountOfTransactions")
    protected BigDecimal countOfTransactions;
    @XmlElement(name = "RequestDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(name = "SourceSystemRequestNo")
    protected String sourceSystemRequestNo;
    @XmlElement(name = "TotalCommissionAmount")
    protected BigDecimal totalCommissionAmount;
    @XmlElement(name = "TotalReceivableAmount")
    protected BigDecimal totalReceivableAmount;
    @XmlElement(name = "ValidateCountYN")
    protected String validateCountYN;

    /**
     * Gets the value of the countOfRecords property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountOfRecords() {
        return countOfRecords;
    }

    /**
     * Sets the value of the countOfRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountOfRecords(BigDecimal value) {
        this.countOfRecords = value;
    }

    /**
     * Gets the value of the countOfTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCountOfTransactions() {
        return countOfTransactions;
    }

    /**
     * Sets the value of the countOfTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCountOfTransactions(BigDecimal value) {
        this.countOfTransactions = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the sourceSystemRequestNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemRequestNo() {
        return sourceSystemRequestNo;
    }

    /**
     * Sets the value of the sourceSystemRequestNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemRequestNo(String value) {
        this.sourceSystemRequestNo = value;
    }

    /**
     * Gets the value of the totalCommissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCommissionAmount() {
        return totalCommissionAmount;
    }

    /**
     * Sets the value of the totalCommissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCommissionAmount(BigDecimal value) {
        this.totalCommissionAmount = value;
    }

    /**
     * Gets the value of the totalReceivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalReceivableAmount() {
        return totalReceivableAmount;
    }

    /**
     * Sets the value of the totalReceivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalReceivableAmount(BigDecimal value) {
        this.totalReceivableAmount = value;
    }

    /**
     * Gets the value of the validateCountYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateCountYN() {
        return validateCountYN;
    }

    /**
     * Sets the value of the validateCountYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateCountYN(String value) {
        this.validateCountYN = value;
    }

}
