package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for failedObjectDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="failedObjectDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="errorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failedObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failedObjectNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="failedObjectSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listenerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeTaken" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "failedObjectDetails", propOrder = {
    "errorDescription",
    "errorType",
    "failedObjectName",
    "failedObjectNo",
    "failedObjectSequence",
    "listenerId",
    "taskName",
    "timeTaken"
})
public class FailedObjectDetails
    extends BaseVO
{

  protected String errorDescription;

  protected String errorType;

  protected String failedObjectName;

  protected Integer failedObjectNo;

  protected Integer failedObjectSequence;

  protected Integer listenerId;

  protected String taskName;

  protected Integer timeTaken;

  /**
   * Gets the value of the errorDescription property.
   *
   * @return possible object is {@link String }
   */
  public String getErrorDescription()
  {
    return errorDescription;
  }

  /**
   * Sets the value of the errorDescription property.
   *
   * @param value allowed object is {@link String }
   */
  public void setErrorDescription(String value)
  {
    this.errorDescription = value;
  }

  /**
   * Gets the value of the errorType property.
   *
   * @return possible object is {@link String }
   */
  public String getErrorType()
  {
    return errorType;
  }

  /**
   * Sets the value of the errorType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setErrorType(String value)
  {
    this.errorType = value;
  }

  /**
   * Gets the value of the failedObjectName property.
   *
   * @return possible object is {@link String }
   */
  public String getFailedObjectName()
  {
    return failedObjectName;
  }

  /**
   * Sets the value of the failedObjectName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFailedObjectName(String value)
  {
    this.failedObjectName = value;
  }

  /**
   * Gets the value of the failedObjectNo property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getFailedObjectNo()
  {
    return failedObjectNo;
  }

  /**
   * Sets the value of the failedObjectNo property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setFailedObjectNo(Integer value)
  {
    this.failedObjectNo = value;
  }

  /**
   * Gets the value of the failedObjectSequence property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getFailedObjectSequence()
  {
    return failedObjectSequence;
  }

  /**
   * Sets the value of the failedObjectSequence property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setFailedObjectSequence(Integer value)
  {
    this.failedObjectSequence = value;
  }

  /**
   * Gets the value of the listenerId property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getListenerId()
  {
    return listenerId;
  }

  /**
   * Sets the value of the listenerId property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setListenerId(Integer value)
  {
    this.listenerId = value;
  }

  /**
   * Gets the value of the taskName property.
   *
   * @return possible object is {@link String }
   */
  public String getTaskName()
  {
    return taskName;
  }

  /**
   * Sets the value of the taskName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTaskName(String value)
  {
    this.taskName = value;
  }

  /**
   * Gets the value of the timeTaken property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getTimeTaken()
  {
    return timeTaken;
  }

  /**
   * Sets the value of the timeTaken property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setTimeTaken(Integer value)
  {
    this.timeTaken = value;
  }

}
