package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resUserDetailsVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resUserDetailsVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="userCredentials" type="{http://services.server.ws.monitor.stgmastek.com/}userCredentials" minOccurs="0"/>
 *         &lt;element name="userInstallationRoles" type="{http://services.server.ws.monitor.stgmastek.com/}userInstallationRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userProfile" type="{http://services.server.ws.monitor.stgmastek.com/}userProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resUserDetailsVO", propOrder = {
    "userCredentials",
    "userInstallationRoles",
    "userProfile"
})
public class ResUserDetailsVO
    extends BaseResponseVO
{

  protected UserCredentials userCredentials;

  @XmlElement(nillable = true)
  protected List<UserInstallationRole> userInstallationRoles;

  protected UserProfile userProfile;

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

  /**
   * Gets the value of the userInstallationRoles property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the userInstallationRoles property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUserInstallationRoles().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link UserInstallationRole }
   */
  public List<UserInstallationRole> getUserInstallationRoles()
  {
    if (userInstallationRoles == null)
    {
      userInstallationRoles = new ArrayList<UserInstallationRole>();
    }
    return this.userInstallationRoles;
  }

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
