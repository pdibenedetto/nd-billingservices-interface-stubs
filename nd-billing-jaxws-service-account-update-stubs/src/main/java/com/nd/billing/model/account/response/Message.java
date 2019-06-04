package com.nd.billing.model.account.response;

import com.nd.ws.billing.account.updateinterface.BaseWSVo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="message">
 *   &lt;complexContent>
 *     &lt;extension base="{http://com/nd/ws/billing/account/updateinterface}baseWSVo">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message",
         propOrder = {"code", "description"})
public class Message extends BaseWSVo
{

    @XmlElement(name = "Code") protected String code;

    @XmlElement(name = "Description") protected String description;

    /**
     * Gets the value of the code property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setCode(String value)
    {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     *     {@link String }
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setDescription(String value)
    {
        this.description = value;
    }
}
