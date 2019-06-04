package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monitorCalendarData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="monitorCalendarData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="calendarName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonWorkingDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitorCalendarData", propOrder = {
    "calendarName",
    "installationCode",
    "nonWorkingDate",
    "remark",
    "userId",
    "year"
})
public class MonitorCalendarData
    extends BaseVO
{

  protected String calendarName;

  protected String installationCode;

  protected Long nonWorkingDate;

  protected String remark;

  protected String userId;

  protected String year;

  /**
   * Gets the value of the calendarName property.
   *
   * @return possible object is {@link String }
   */
  public String getCalendarName()
  {
    return calendarName;
  }

  /**
   * Sets the value of the calendarName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCalendarName(String value)
  {
    this.calendarName = value;
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
   * Gets the value of the nonWorkingDate property.
   *
   * @return possible object is {@link Long }
   */
  public Long getNonWorkingDate()
  {
    return nonWorkingDate;
  }

  /**
   * Sets the value of the nonWorkingDate property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setNonWorkingDate(Long value)
  {
    this.nonWorkingDate = value;
  }

  /**
   * Gets the value of the remark property.
   *
   * @return possible object is {@link String }
   */
  public String getRemark()
  {
    return remark;
  }

  /**
   * Sets the value of the remark property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRemark(String value)
  {
    this.remark = value;
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

  /**
   * Gets the value of the year property.
   *
   * @return possible object is {@link String }
   */
  public String getYear()
  {
    return year;
  }

  /**
   * Sets the value of the year property.
   *
   * @param value allowed object is {@link String }
   */
  public void setYear(String value)
  {
    this.year = value;
  }

}
