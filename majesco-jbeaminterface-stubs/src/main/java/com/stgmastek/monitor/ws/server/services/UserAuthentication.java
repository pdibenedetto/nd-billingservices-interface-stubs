package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userAuthentication complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="userAuthentication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userCredentials" type="{http://services.server.ws.monitor.stgmastek.com/}userCredentials" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userAuthentication", propOrder = {
    "userCredentials"
})
public class UserAuthentication
{

  protected UserCredentials userCredentials;

  /**
   * Gets the value of the userCredentials property.
   *
   * @return possible object is {@link UserCredentials }
   */
  public UserCredentials getUserCredentials()
  {
    return userCredentials;
  }

  /**
   * Sets the value of the userCredentials property.
   *
   * @param value allowed object is {@link UserCredentials }
   */
  public void setUserCredentials(UserCredentials value)
  {
    this.userCredentials = value;
  }

}
