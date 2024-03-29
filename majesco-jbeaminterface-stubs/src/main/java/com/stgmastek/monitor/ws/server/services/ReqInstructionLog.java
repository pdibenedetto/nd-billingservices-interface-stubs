package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqInstructionLog complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="reqInstructionLog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseRequestVO">
 *       &lt;sequence>
 *         &lt;element name="batchAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchActionTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="batchRevNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entityValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructingUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructionParameters" type="{http://services.server.ws.monitor.stgmastek.com/}instructionParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instructionTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seqNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqInstructionLog", propOrder = {
    "batchAction",
    "batchActionTime",
    "batchNo",
    "batchRevNo",
    "entityValues",
    "installationCode",
    "instructingUser",
    "instructionParameters",
    "instructionTime",
    "message",
    "messageParam",
    "seqNo"
})
public class ReqInstructionLog
    extends BaseRequestVO
{

  protected String batchAction;

  protected Long batchActionTime;

  protected Integer batchNo;

  protected Integer batchRevNo;

  protected String entityValues;

  protected String installationCode;

  protected String instructingUser;

  @XmlElement(nillable = true)
  protected List<InstructionParameter> instructionParameters;

  protected Long instructionTime;

  protected String message;

  protected String messageParam;

  protected Integer seqNo;

  /**
   * Gets the value of the batchAction property.
   *
   * @return possible object is {@link String }
   */
  public String getBatchAction()
  {
    return batchAction;
  }

  /**
   * Sets the value of the batchAction property.
   *
   * @param value allowed object is {@link String }
   */
  public void setBatchAction(String value)
  {
    this.batchAction = value;
  }

  /**
   * Gets the value of the batchActionTime property.
   *
   * @return possible object is {@link Long }
   */
  public Long getBatchActionTime()
  {
    return batchActionTime;
  }

  /**
   * Sets the value of the batchActionTime property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setBatchActionTime(Long value)
  {
    this.batchActionTime = value;
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
   * Gets the value of the entityValues property.
   *
   * @return possible object is {@link String }
   */
  public String getEntityValues()
  {
    return entityValues;
  }

  /**
   * Sets the value of the entityValues property.
   *
   * @param value allowed object is {@link String }
   */
  public void setEntityValues(String value)
  {
    this.entityValues = value;
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
   * Gets the value of the instructingUser property.
   *
   * @return possible object is {@link String }
   */
  public String getInstructingUser()
  {
    return instructingUser;
  }

  /**
   * Sets the value of the instructingUser property.
   *
   * @param value allowed object is {@link String }
   */
  public void setInstructingUser(String value)
  {
    this.instructingUser = value;
  }

  /**
   * Gets the value of the instructionParameters property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the instructionParameters property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getInstructionParameters().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link InstructionParameter }
   */
  public List<InstructionParameter> getInstructionParameters()
  {
    if (instructionParameters == null)
    {
      instructionParameters = new ArrayList<InstructionParameter>();
    }
    return this.instructionParameters;
  }

  /**
   * Gets the value of the instructionTime property.
   *
   * @return possible object is {@link Long }
   */
  public Long getInstructionTime()
  {
    return instructionTime;
  }

  /**
   * Sets the value of the instructionTime property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setInstructionTime(Long value)
  {
    this.instructionTime = value;
  }

  /**
   * Gets the value of the message property.
   *
   * @return possible object is {@link String }
   */
  public String getMessage()
  {
    return message;
  }

  /**
   * Sets the value of the message property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMessage(String value)
  {
    this.message = value;
  }

  /**
   * Gets the value of the messageParam property.
   *
   * @return possible object is {@link String }
   */
  public String getMessageParam()
  {
    return messageParam;
  }

  /**
   * Sets the value of the messageParam property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMessageParam(String value)
  {
    this.messageParam = value;
  }

  /**
   * Gets the value of the seqNo property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getSeqNo()
  {
    return seqNo;
  }

  /**
   * Sets the value of the seqNo property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setSeqNo(Integer value)
  {
    this.seqNo = value;
  }

}
