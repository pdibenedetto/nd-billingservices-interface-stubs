package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserInstallationRoleDetailsResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getUserInstallationRoleDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.server.ws.monitor.stgmastek.com/}resUserDetailsVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserInstallationRoleDetailsResponse", propOrder = {
    "_return"
})
public class GetUserInstallationRoleDetailsResponse
{

  @XmlElement(name = "return")
  protected ResUserDetailsVO _return;

  /**
   * Gets the value of the return property.
   *
   * @return possible object is {@link ResUserDetailsVO }
   */
  public ResUserDetailsVO getReturn()
  {
    return _return;
  }

  /**
   * Sets the value of the return property.
   *
   * @param value allowed object is {@link ResUserDetailsVO }
   */
  public void setReturn(ResUserDetailsVO value)
  {
    this._return = value;
  }

}
