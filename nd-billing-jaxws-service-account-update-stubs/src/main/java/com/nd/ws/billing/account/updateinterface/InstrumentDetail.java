package com.nd.ws.billing.account.updateinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instrumentDetail complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="instrumentDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/nd/ws/billing/account/updateinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContextId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContextType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EftWithdrawalDay" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstrumentBankName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstrumentExpiryMonth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InstrumentExpiryYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InstrumentHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstrumentNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstrumentSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstrumentSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstrumentTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstrumentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instrumentDetail",
         propOrder = {"address1", "address2", "city", "contextId",
                      "contextType", "country", "county", "eftWithdrawalDay",
                      "emailID", "instrumentBankName", "instrumentExpiryMonth",
                      "instrumentExpiryYear", "instrumentHolderName",
                      "instrumentNo", "instrumentSecurityCode",
                      "instrumentSubType", "instrumentTitle", "instrumentType",
                      "phoneNo", "state", "zipCode"})
public class InstrumentDetail extends BaseWSVo
{

    @XmlElement(name = "Address1",
                required = true) protected String address1;

    @XmlElement(name = "Address2") protected String address2;

    @XmlElement(name = "City",
                required = true) protected String city;

    @XmlElement(name = "ContextId") protected String contextId;

    @XmlElement(name = "ContextType",
                required = true) protected String contextType;

    @XmlElement(name = "Country",
                required = true) protected String country;

    @XmlElement(name = "County",
                required = true) protected String county;

    @XmlElement(name = "EftWithdrawalDay") protected Long eftWithdrawalDay;

    @XmlElementRef(name = "EmailID",
                   type = JAXBElement.class,
                   required = false) protected JAXBElement<String> emailID;

    @XmlElement(name = "InstrumentBankName",
                required = true) protected String instrumentBankName;

    @XmlElement(name = "InstrumentExpiryMonth") protected Long
        instrumentExpiryMonth;

    @XmlElement(name = "InstrumentExpiryYear") protected Long
        instrumentExpiryYear;

    @XmlElement(name = "InstrumentHolderName",
                required = true) protected String instrumentHolderName;

    @XmlElement(name = "InstrumentNo",
                required = true) protected String instrumentNo;

    @XmlElement(name = "InstrumentSecurityCode",
                required = true) protected String instrumentSecurityCode;

    @XmlElement(name = "InstrumentSubType",
                required = true) protected String instrumentSubType;

    @XmlElement(name = "InstrumentTitle",
                required = true) protected String instrumentTitle;

    @XmlElement(name = "InstrumentType",
                required = true) protected String instrumentType;

    @XmlElement(name = "PhoneNo") protected String phoneNo;

    @XmlElement(name = "State",
                required = true) protected String state;

    @XmlElement(name = "ZipCode",
                required = true) protected String zipCode;

    /**
     * Gets the value of the address1 property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getAddress1()
    {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setAddress1(String value)
    {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getAddress2()
    {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setAddress2(String value)
    {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setCity(String value)
    {
        this.city = value;
    }

    /**
     * Gets the value of the contextId property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getContextId()
    {
        return contextId;
    }

    /**
     * Sets the value of the contextId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setContextId(String value)
    {
        this.contextId = value;
    }

    /**
     * Gets the value of the contextType property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getContextType()
    {
        return contextType;
    }

    /**
     * Sets the value of the contextType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setContextType(String value)
    {
        this.contextType = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getCountry()
    {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setCountry(String value)
    {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getCounty()
    {
        return county;
    }

    /**
     * Sets the value of the county property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setCounty(String value)
    {
        this.county = value;
    }

    /**
     * Gets the value of the eftWithdrawalDay property.
     *
     * @return possible object is
     *     {@link Long }
     */
    public Long getEftWithdrawalDay()
    {
        return eftWithdrawalDay;
    }

    /**
     * Sets the value of the eftWithdrawalDay property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     */
    public void setEftWithdrawalDay(Long value)
    {
        this.eftWithdrawalDay = value;
    }

    /**
     * Gets the value of the emailID property.
     *
     * @return possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getEmailID()
    {
        return emailID;
    }

    /**
     * Sets the value of the emailID property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setEmailID(JAXBElement<String> value)
    {
        this.emailID = value;
    }

    /**
     * Gets the value of the instrumentBankName property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getInstrumentBankName()
    {
        return instrumentBankName;
    }

    /**
     * Sets the value of the instrumentBankName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setInstrumentBankName(String value)
    {
        this.instrumentBankName = value;
    }

    /**
     * Gets the value of the instrumentExpiryMonth property.
     *
     * @return possible object is
     *     {@link Long }
     */
    public Long getInstrumentExpiryMonth()
    {
        return instrumentExpiryMonth;
    }

    /**
     * Sets the value of the instrumentExpiryMonth property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     */
    public void setInstrumentExpiryMonth(Long value)
    {
        this.instrumentExpiryMonth = value;
    }

    /**
     * Gets the value of the instrumentExpiryYear property.
     *
     * @return possible object is
     *     {@link Long }
     */
    public Long getInstrumentExpiryYear()
    {
        return instrumentExpiryYear;
    }

    /**
     * Sets the value of the instrumentExpiryYear property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     */
    public void setInstrumentExpiryYear(Long value)
    {
        this.instrumentExpiryYear = value;
    }

    /**
     * Gets the value of the instrumentHolderName property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getInstrumentHolderName()
    {
        return instrumentHolderName;
    }

    /**
     * Sets the value of the instrumentHolderName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setInstrumentHolderName(String value)
    {
        this.instrumentHolderName = value;
    }

    /**
     * Gets the value of the instrumentNo property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getInstrumentNo()
    {
        return instrumentNo;
    }

    /**
     * Sets the value of the instrumentNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setInstrumentNo(String value)
    {
        this.instrumentNo = value;
    }

    /**
     * Gets the value of the instrumentSecurityCode property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getInstrumentSecurityCode()
    {
        return instrumentSecurityCode;
    }

    /**
     * Sets the value of the instrumentSecurityCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setInstrumentSecurityCode(String value)
    {
        this.instrumentSecurityCode = value;
    }

    /**
     * Gets the value of the instrumentSubType property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getInstrumentSubType()
    {
        return instrumentSubType;
    }

    /**
     * Sets the value of the instrumentSubType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setInstrumentSubType(String value)
    {
        this.instrumentSubType = value;
    }

    /**
     * Gets the value of the instrumentTitle property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getInstrumentTitle()
    {
        return instrumentTitle;
    }

    /**
     * Sets the value of the instrumentTitle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setInstrumentTitle(String value)
    {
        this.instrumentTitle = value;
    }

    /**
     * Gets the value of the instrumentType property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getInstrumentType()
    {
        return instrumentType;
    }

    /**
     * Sets the value of the instrumentType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setInstrumentType(String value)
    {
        this.instrumentType = value;
    }

    /**
     * Gets the value of the phoneNo property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getPhoneNo()
    {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setPhoneNo(String value)
    {
        this.phoneNo = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setState(String value)
    {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getZipCode()
    {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setZipCode(String value)
    {
        this.zipCode = value;
    }
}
