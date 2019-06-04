package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resRoleDetailsVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resRoleDetailsVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="roleData" type="{http://services.server.ws.monitor.stgmastek.com/}roleData" minOccurs="0"/>
 *         &lt;element name="roleDataList" type="{http://services.server.ws.monitor.stgmastek.com/}roleData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resRoleDetailsVO", propOrder = {
    "roleData",
    "roleDataList"
})
public class ResRoleDetailsVO
    extends BaseResponseVO
{

  protected RoleData roleData;

  @XmlElement(nillable = true)
  protected List<RoleData> roleDataList;

  /**
   * Gets the value of the roleData property.
   *
   * @return possible object is {@link RoleData }
   */
  public RoleData getRoleData()
  {
    return roleData;
  }

  /**
   * Sets the value of the roleData property.
   *
   * @param value allowed object is {@link RoleData }
   */
  public void setRoleData(RoleData value)
  {
    this.roleData = value;
  }

  /**
   * Gets the value of the roleDataList property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the roleDataList property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRoleDataList().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link RoleData }
   */
  public List<RoleData> getRoleDataList()
  {
    if (roleDataList == null)
    {
      roleDataList = new ArrayList<RoleData>();
    }
    return this.roleDataList;
  }

}
