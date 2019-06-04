package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for menuData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="menuData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="functionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="functionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorFunctionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menuData", propOrder = {
    "functionId",
    "functionName",
    "priorFunctionId",
    "roleId"
})
public class MenuData
    extends BaseVO
{

  protected String functionId;

  protected String functionName;

  protected String priorFunctionId;

  protected String roleId;

  /**
   * Gets the value of the functionId property.
   *
   * @return possible object is {@link String }
   */
  public String getFunctionId()
  {
    return functionId;
  }

  /**
   * Sets the value of the functionId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFunctionId(String value)
  {
    this.functionId = value;
  }

  /**
   * Gets the value of the functionName property.
   *
   * @return possible object is {@link String }
   */
  public String getFunctionName()
  {
    return functionName;
  }

  /**
   * Sets the value of the functionName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFunctionName(String value)
  {
    this.functionName = value;
  }

  /**
   * Gets the value of the priorFunctionId property.
   *
   * @return possible object is {@link String }
   */
  public String getPriorFunctionId()
  {
    return priorFunctionId;
  }

  /**
   * Sets the value of the priorFunctionId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPriorFunctionId(String value)
  {
    this.priorFunctionId = value;
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

}
