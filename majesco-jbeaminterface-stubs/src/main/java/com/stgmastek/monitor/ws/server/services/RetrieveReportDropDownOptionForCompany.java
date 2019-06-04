package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveReportDropDownOptionForCompany complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="retrieveReportDropDownOptionForCompany">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserProfile" type="{http://services.server.ws.monitor.stgmastek.com/}userProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveReportDropDownOptionForCompany", propOrder = {
    "userProfile"
})
public class RetrieveReportDropDownOptionForCompany
{

  @XmlElement(name = "UserProfile")
  protected UserProfile userProfile;

  /**
   * Gets the value of the userProfile property.
   *
   * @return possible object is {@link UserProfile }
   */
  public UserProfile getUserProfile()
  {
    return userProfile;
  }

  /**
   * Sets the value of the userProfile property.
   *
   * @param value allowed object is {@link UserProfile }
   */
  public void setUserProfile(UserProfile value)
  {
    this.userProfile = value;
  }

}
