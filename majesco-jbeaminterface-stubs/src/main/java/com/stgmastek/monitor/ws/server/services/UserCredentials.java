package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userCredentials complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="userCredentials">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}userInfo">
 *       &lt;sequence>
 *         &lt;element name="newPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userCredentials", propOrder = {
    "newPassword",
    "password"
})
@XmlSeeAlso({
                UserProfile.class
            })
public class UserCredentials
    extends UserInfo
{

  protected String newPassword;

  protected String password;

  /**
   * Gets the value of the newPassword property.
   *
   * @return possible object is {@link String }
   */
  public String getNewPassword()
  {
    return newPassword;
  }

  /**
   * Sets the value of the newPassword property.
   *
   * @param value allowed object is {@link String }
   */
  public void setNewPassword(String value)
  {
    this.newPassword = value;
  }

  /**
   * Gets the value of the password property.
   *
   * @return possible object is {@link String }
   */
  public String getPassword()
  {
    return password;
  }

  /**
   * Sets the value of the password property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPassword(String value)
  {
    this.password = value;
  }

}
