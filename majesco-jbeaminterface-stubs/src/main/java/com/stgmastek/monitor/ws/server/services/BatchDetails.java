package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for batchDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="batchDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="batchEndReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchEndUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="batchRevNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="batchStartUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="execEndTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="execStartTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="failedOver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructionSeqNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "batchDetails", propOrder = {
    "batchEndReason",
    "batchEndUser",
    "batchName",
    "batchNo",
    "batchRevNo",
    "batchStartUser",
    "batchType",
    "execEndTime",
    "execStartTime",
    "failedOver",
    "installationCode",
    "instructionSeqNo",
    "processId"
})
public class BatchDetails
    extends BaseVO
{

  protected String batchEndReason;

  protected String batchEndUser;

  protected String batchName;

  protected Integer batchNo;

  protected Integer batchRevNo;

  protected String batchStartUser;

  protected String batchType;

  protected Long execEndTime;

  protected Long execStartTime;

  protected String failedOver;

  protected String installationCode;

  protected Integer instructionSeqNo;

  protected Integer processId;

  /**
   * Gets the value of the batchEndReason property.
   *
   * @return possible object is {@link String }
   */
  public String getBatchEndReason()
  {
    return batchEndReason;
  }

  /**
   * Sets the value of the batchEndReason property.
   *
   * @param value allowed object is {@link String }
   */
  public void setBatchEndReason(String value)
  {
    this.batchEndReason = value;
  }

  /**
   * Gets the value of the batchEndUser property.
   *
   * @return possible object is {@link String }
   */
  public String getBatchEndUser()
  {
    return batchEndUser;
  }

  /**
   * Sets the value of the batchEndUser property.
   *
   * @param value allowed object is {@link String }
   */
  public void setBatchEndUser(String value)
  {
    this.batchEndUser = value;
  }

  /**
   * Gets the value of the batchName property.
   *
   * @return possible object is {@link String }
   */
  public String getBatchName()
  {
    return batchName;
  }

  /**
   * Sets the value of the batchName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setBatchName(String value)
  {
    this.batchName = value;
  }

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
   * Gets the value of the batchStartUser property.
   *
   * @return possible object is {@link String }
   */
  public String getBatchStartUser()
  {
    return batchStartUser;
  }

  /**
   * Sets the value of the batchStartUser property.
   *
   * @param value allowed object is {@link String }
   */
  public void setBatchStartUser(String value)
  {
    this.batchStartUser = value;
  }

  /**
   * Gets the value of the batchType property.
   *
   * @return possible object is {@link String }
   */
  public String getBatchType()
  {
    return batchType;
  }

  /**
   * Sets the value of the batchType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setBatchType(String value)
  {
    this.batchType = value;
  }

  /**
   * Gets the value of the execEndTime property.
   *
   * @return possible object is {@link Long }
   */
  public Long getExecEndTime()
  {
    return execEndTime;
  }

  /**
   * Sets the value of the execEndTime property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setExecEndTime(Long value)
  {
    this.execEndTime = value;
  }

  /**
   * Gets the value of the execStartTime property.
   *
   * @return possible object is {@link Long }
   */
  public Long getExecStartTime()
  {
    return execStartTime;
  }

  /**
   * Sets the value of the execStartTime property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setExecStartTime(Long value)
  {
    this.execStartTime = value;
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
   * Gets the value of the instructionSeqNo property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getInstructionSeqNo()
  {
    return instructionSeqNo;
  }

  /**
   * Sets the value of the instructionSeqNo property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setInstructionSeqNo(Integer value)
  {
    this.instructionSeqNo = value;
  }

  /**
   * Gets the value of the processId property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getProcessId()
  {
    return processId;
  }

  /**
   * Sets the value of the processId property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setProcessId(Integer value)
  {
    this.processId = value;
  }

}
