package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userInstallationRole complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="userInstallationRole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="installationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInstallationRole", propOrder = {
    "installationCode",
    "roleId",
    "userId"
})
public class UserInstallationRole
    extends BaseVO
{

  protected String installationCode;

  protected String roleId;

  protected String userId;

  /**
   * Gets the value of the installationCode property.
   *
   * @return possible object is {@link String }
   */
  public String getInstallationCode()
  {
    return installationCode;
  }

  /**
   * Sets the value of the installationCode property.
   *
   * @param value allowed object is {@link String }
   */
  public void setInstallationCode(String value)
  {
    this.installationCode = value;
  }

  /**
   * Gets the value of the roleId property.
   *
   * @return possible object is {@link String }
   */
  public String getRoleId()
  {
    return roleId;
  }

  /**
   * Sets the value of the roleId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRoleId(String value)
  {
    this.roleId = value;
  }

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
