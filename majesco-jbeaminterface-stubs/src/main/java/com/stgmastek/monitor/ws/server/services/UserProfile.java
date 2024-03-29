package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userProfile complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="userProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}userCredentials">
 *       &lt;sequence>
 *         &lt;element name="adminRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdOn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="defaultView" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="faxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forcePasswordFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hintAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hintQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedOn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="telephoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userProfile", propOrder = {
    "adminRole",
    "connectRole",
    "createdBy",
    "createdOn",
    "defaultView",
    "effDate",
    "emailId",
    "expDate",
    "faxNo",
    "forcePasswordFlag",
    "hintAnswer",
    "hintQuestion",
    "installationCode",
    "modifiedBy",
    "modifiedOn",
    "telephoneNo",
    "userName"
})
public class UserProfile
    extends UserCredentials
{

  protected String adminRole;

  protected String connectRole;

  protected String createdBy;

  protected Long createdOn;

  protected String defaultView;

  protected Long effDate;

  protected String emailId;

  protected Long expDate;

  protected String faxNo;

  protected String forcePasswordFlag;

  protected String hintAnswer;

  protected String hintQuestion;

  protected String installationCode;

  protected String modifiedBy;

  protected Long modifiedOn;

  protected String telephoneNo;

  protected String userName;

  /**
   * Gets the value of the adminRole property.
   *
   * @return possible object is {@link String }
   */
  public String getAdminRole()
  {
    return adminRole;
  }

  /**
   * Sets the value of the adminRole property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAdminRole(String value)
  {
    this.adminRole = value;
  }

  /**
   * Gets the value of the connectRole property.
   *
   * @return possible object is {@link String }
   */
  public String getConnectRole()
  {
    return connectRole;
  }

  /**
   * Sets the value of the connectRole property.
   *
   * @param value allowed object is {@link String }
   */
  public void setConnectRole(String value)
  {
    this.connectRole = value;
  }

  /**
   * Gets the value of the createdBy property.
   *
   * @return possible object is {@link String }
   */
  public String getCreatedBy()
  {
    return createdBy;
  }

  /**
   * Sets the value of the createdBy property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCreatedBy(String value)
  {
    this.createdBy = value;
  }

  /**
   * Gets the value of the createdOn property.
   *
   * @return possible object is {@link Long }
   */
  public Long getCreatedOn()
  {
    return createdOn;
  }

  /**
   * Sets the value of the createdOn property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setCreatedOn(Long value)
  {
    this.createdOn = value;
  }

  /**
   * Gets the value of the defaultView property.
   *
   * @return possible object is {@link String }
   */
  public String getDefaultView()
  {
    return defaultView;
  }

  /**
   * Sets the value of the defaultView property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDefaultView(String value)
  {
    this.defaultView = value;
  }

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
   * Gets the value of the emailId property.
   *
   * @return possible object is {@link String }
   */
  public String getEmailId()
  {
    return emailId;
  }

  /**
   * Sets the value of the emailId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setEmailId(String value)
  {
    this.emailId = value;
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
   * Gets the value of the faxNo property.
   *
   * @return possible object is {@link String }
   */
  public String getFaxNo()
  {
    return faxNo;
  }

  /**
   * Sets the value of the faxNo property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFaxNo(String value)
  {
    this.faxNo = value;
  }

  /**
   * Gets the value of the forcePasswordFlag property.
   *
   * @return possible object is {@link String }
   */
  public String getForcePasswordFlag()
  {
    return forcePasswordFlag;
  }

  /**
   * Sets the value of the forcePasswordFlag property.
   *
   * @param value allowed object is {@link String }
   */
  public void setForcePasswordFlag(String value)
  {
    this.forcePasswordFlag = value;
  }

  /**
   * Gets the value of the hintAnswer property.
   *
   * @return possible object is {@link String }
   */
  public String getHintAnswer()
  {
    return hintAnswer;
  }

  /**
   * Sets the value of the hintAnswer property.
   *
   * @param value allowed object is {@link String }
   */
  public void setHintAnswer(String value)
  {
    this.hintAnswer = value;
  }

  /**
   * Gets the value of the hintQuestion property.
   *
   * @return possible object is {@link String }
   */
  public String getHintQuestion()
  {
    return hintQuestion;
  }

  /**
   * Sets the value of the hintQuestion property.
   *
   * @param value allowed object is {@link String }
   */
  public void setHintQuestion(String value)
  {
    this.hintQuestion = value;
  }

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
   * Gets the value of the modifiedBy property.
   *
   * @return possible object is {@link String }
   */
  public String getModifiedBy()
  {
    return modifiedBy;
  }

  /**
   * Sets the value of the modifiedBy property.
   *
   * @param value allowed object is {@link String }
   */
  public void setModifiedBy(String value)
  {
    this.modifiedBy = value;
  }

  /**
   * Gets the value of the modifiedOn property.
   *
   * @return possible object is {@link Long }
   */
  public Long getModifiedOn()
  {
    return modifiedOn;
  }

  /**
   * Sets the value of the modifiedOn property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setModifiedOn(Long value)
  {
    this.modifiedOn = value;
  }

  /**
   * Gets the value of the telephoneNo property.
   *
   * @return possible object is {@link String }
   */
  public String getTelephoneNo()
  {
    return telephoneNo;
  }

  /**
   * Sets the value of the telephoneNo property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTelephoneNo(String value)
  {
    this.telephoneNo = value;
  }

  /**
   * Gets the value of the userName property.
   *
   * @return possible object is {@link String }
   */
  public String getUserName()
  {
    return userName;
  }

  /**
   * Sets the value of the userName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setUserName(String value)
  {
    this.userName = value;
  }

}
