package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="userInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseRequestVO">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInfo", propOrder = {
    "userId"
})
@XmlSeeAlso({
                UserCredentials.class
            })
public class UserInfo
    extends BaseRequestVO
{

  protected String userId;

  /**
   * Gets the value of the userId property.
   *
   * @return possible object is {@link String }
   */
  public String getUserId()
  {
    return userId;
  }

  /**
   * Sets the value of the userId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setUserId(String value)
  {
    this.userId = value;
  }

}
