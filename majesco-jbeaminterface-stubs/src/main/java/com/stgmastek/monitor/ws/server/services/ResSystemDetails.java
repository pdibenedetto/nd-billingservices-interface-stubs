package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resSystemDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resSystemDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="systemDetails" type="{http://services.server.ws.monitor.stgmastek.com/}systemDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resSystemDetails", propOrder = {
    "systemDetails"
})
public class ResSystemDetails
    extends BaseResponseVO
{

  protected SystemDetails systemDetails;

  /**
   * Gets the value of the systemDetails property.
   *
   * @return possible object is {@link SystemDetails }
   */
  public SystemDetails getSystemDetails()
  {
    return systemDetails;
  }

  /**
   * Sets the value of the systemDetails property.
   *
   * @param value allowed object is {@link SystemDetails }
   */
  public void setSystemDetails(SystemDetails value)
  {
    this.systemDetails = value;
  }

}
