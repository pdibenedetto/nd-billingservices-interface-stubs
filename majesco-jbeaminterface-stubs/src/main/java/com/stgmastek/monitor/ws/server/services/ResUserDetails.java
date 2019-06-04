package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resUserDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resUserDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="userDetails" type="{http://services.server.ws.monitor.stgmastek.com/}userDetails" minOccurs="0"/>
 *         &lt;element name="userInstallationRoleList" type="{http://services.server.ws.monitor.stgmastek.com/}userInstallationRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resUserDetails", propOrder = {
    "userDetails",
    "userInstallationRoleList"
})
public class ResUserDetails
    extends BaseResponseVO
{

  protected UserDetails userDetails;

  @XmlElement(nillable = true)
  protected List<UserInstallationRole> userInstallationRoleList;

  /**
   * Gets the value of the userDetails property.
   *
   * @return possible object is {@link UserDetails }
   */
  public UserDetails getUserDetails()
  {
    return userDetails;
  }

  /**
   * Sets the value of the userDetails property.
   *
   * @param value allowed object is {@link UserDetails }
   */
  public void setUserDetails(UserDetails value)
  {
    this.userDetails = value;
  }

  /**
   * Gets the value of the userInstallationRoleList property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the userInstallationRoleList property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUserInstallationRoleList().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link UserInstallationRole }
   */
  public List<UserInstallationRole> getUserInstallationRoleList()
  {
    if (userInstallationRoleList == null)
    {
      userInstallationRoleList = new ArrayList<UserInstallationRole>();
    }
    return this.userInstallationRoleList;
  }

}
