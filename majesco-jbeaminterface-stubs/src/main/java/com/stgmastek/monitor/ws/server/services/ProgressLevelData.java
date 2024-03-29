package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for progressLevelData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="progressLevelData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="batchRevNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cycleNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endDatetime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="errorDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failedOver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicatorNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="installationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prgActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prgLevelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDatetime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "progressLevelData", propOrder = {
    "batchNo",
    "batchRevNo",
    "cycleNo",
    "endDatetime",
    "errorDesc",
    "failedOver",
    "indicatorNo",
    "installationCode",
    "prgActivityType",
    "prgLevelType",
    "startDatetime",
    "status"
})
public class ProgressLevelData
    extends BaseVO
{

  protected Integer batchNo;

  protected Integer batchRevNo;

  protected Integer cycleNo;

  protected Long endDatetime;

  protected String errorDesc;

  protected String failedOver;

  protected Integer indicatorNo;

  protected String installationCode;

  protected String prgActivityType;

  protected String prgLevelType;

  protected Long startDatetime;

  protected String status;

  /**
   * Gets the value of the batchNo property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getBatchNo()
  {
    return batchNo;
  }

  /**
   * Sets the value of the batchNo property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setBatchNo(Integer value)
  {
    this.batchNo = value;
  }

  /**
   * Gets the value of the batchRevNo property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getBatchRevNo()
  {
    return batchRevNo;
  }

  /**
   * Sets the value of the batchRevNo property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setBatchRevNo(Integer value)
  {
    this.batchRevNo = value;
  }

  /**
   * Gets the value of the cycleNo property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getCycleNo()
  {
    return cycleNo;
  }

  /**
   * Sets the value of the cycleNo property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setCycleNo(Integer value)
  {
    this.cycleNo = value;
  }

  /**
   * Gets the value of the endDatetime property.
   *
   * @return possible object is {@link Long }
   */
  public Long getEndDatetime()
  {
    return endDatetime;
  }

  /**
   * Sets the value of the endDatetime property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setEndDatetime(Long value)
  {
    this.endDatetime = value;
  }

  /**
   * Gets the value of the errorDesc property.
   *
   * @return possible object is {@link String }
   */
  public String getErrorDesc()
  {
    return errorDesc;
  }

  /**
   * Sets the value of the errorDesc property.
   *
   * @param value allowed object is {@link String }
   */
  public void setErrorDesc(String value)
  {
    this.errorDesc = value;
  }

  /**
   * Gets the value of the failedOver property.
   *
   * @return possible object is {@link String }
   */
  public String getFailedOver()
  {
    return failedOver;
  }

  /**
   * Sets the value of the failedOver property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFailedOver(String value)
  {
    this.failedOver = value;
  }

  /**
   * Gets the value of the indicatorNo property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getIndicatorNo()
  {
    return indicatorNo;
  }

  /**
   * Sets the value of the indicatorNo property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setIndicatorNo(Integer value)
  {
    this.indicatorNo = value;
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
   * Gets the value of the prgActivityType property.
   *
   * @return possible object is {@link String }
   */
  public String getPrgActivityType()
  {
    return prgActivityType;
  }

  /**
   * Sets the value of the prgActivityType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPrgActivityType(String value)
  {
    this.prgActivityType = value;
  }

  /**
   * Gets the value of the prgLevelType property.
   *
   * @return possible object is {@link String }
   */
  public String getPrgLevelType()
  {
    return prgLevelType;
  }

  /**
   * Sets the value of the prgLevelType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPrgLevelType(String value)
  {
    this.prgLevelType = value;
  }

  /**
   * Gets the value of the startDatetime property.
   *
   * @return possible object is {@link Long }
   */
  public Long getStartDatetime()
  {
    return startDatetime;
  }

  /**
   * Sets the value of the startDatetime property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setStartDatetime(Long value)
  {
    this.startDatetime = value;
  }

  /**
   * Gets the value of the status property.
   *
   * @return possible object is {@link String }
   */
  public String getStatus()
  {
    return status;
  }

  /**
   * Sets the value of the status property.
   *
   * @param value allowed object is {@link String }
   */
  public void setStatus(String value)
  {
    this.status = value;
  }

}
