package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roleData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="roleData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="effDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="expDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roleData", propOrder = {
    "effDate",
    "expDate",
    "roleId",
    "roleName"
})
public class RoleData
    extends BaseVO
{

  protected Long effDate;

  protected Long expDate;

  protected String roleId;

  protected String roleName;

  /**
   * Gets the value of the effDate property.
   *
   * @return possible object is {@link Long }
   */
  public Long getEffDate()
  {
    return effDate;
  }

  /**
   * Sets the value of the effDate property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setEffDate(Long value)
  {
    this.effDate = value;
  }

  /**
   * Gets the value of the expDate property.
   *
   * @return possible object is {@link Long }
   */
  public Long getExpDate()
  {
    return expDate;
  }

  /**
   * Sets the value of the expDate property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setExpDate(Long value)
  {
    this.expDate = value;
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
   * Gets the value of the roleName property.
   *
   * @return possible object is {@link String }
   */
  public String getRoleName()
  {
    return roleName;
  }

  /**
   * Sets the value of the roleName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRoleName(String value)
  {
    this.roleName = value;
  }

}
