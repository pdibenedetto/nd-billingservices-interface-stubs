package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resBatchInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resBatchInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="batchDetails" type="{http://services.server.ws.monitor.stgmastek.com/}batchDetails" minOccurs="0"/>
 *         &lt;element name="batchDetailsList" type="{http://services.server.ws.monitor.stgmastek.com/}batchDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instructionParametersList" type="{http://services.server.ws.monitor.stgmastek.com/}instructionParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="revisionBatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scheduledBatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resBatchInfo", propOrder = {
    "batchDetails",
    "batchDetailsList",
    "instructionParametersList",
    "revisionBatch",
    "scheduledBatch"
})
public class ResBatchInfo
    extends BaseResponseVO
{

  protected BatchDetails batchDetails;

  @XmlElement(nillable = true)
  protected List<BatchDetails> batchDetailsList;

  @XmlElement(nillable = true)
  protected List<InstructionParameter> instructionParametersList;

  protected Boolean revisionBatch;

  protected Boolean scheduledBatch;

  /**
   * Gets the value of the batchDetails property.
   *
   * @return possible object is {@link BatchDetails }
   */
  public BatchDetails getBatchDetails()
  {
    return batchDetails;
  }

  /**
   * Sets the value of the batchDetails property.
   *
   * @param value allowed object is {@link BatchDetails }
   */
  public void setBatchDetails(BatchDetails value)
  {
    this.batchDetails = value;
  }

  /**
   * Gets the value of the batchDetailsList property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the batchDetailsList property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBatchDetailsList().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link BatchDetails }
   */
  public List<BatchDetails> getBatchDetailsList()
  {
    if (batchDetailsList == null)
    {
      batchDetailsList = new ArrayList<BatchDetails>();
    }
    return this.batchDetailsList;
  }

  /**
   * Gets the value of the instructionParametersList property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the instructionParametersList property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getInstructionParametersList().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link InstructionParameter }
   */
  public List<InstructionParameter> getInstructionParametersList()
  {
    if (instructionParametersList == null)
    {
      instructionParametersList = new ArrayList<InstructionParameter>();
    }
    return this.instructionParametersList;
  }

  /**
   * Gets the value of the revisionBatch property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isRevisionBatch()
  {
    return revisionBatch;
  }

  /**
   * Sets the value of the revisionBatch property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setRevisionBatch(Boolean value)
  {
    this.revisionBatch = value;
  }

  /**
   * Gets the value of the scheduledBatch property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isScheduledBatch()
  {
    return scheduledBatch;
  }

  /**
   * Sets the value of the scheduledBatch property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setScheduledBatch(Boolean value)
  {
    this.scheduledBatch = value;
  }

}
