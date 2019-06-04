package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqSearchBatch complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="reqSearchBatch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseRequestVO">
 *       &lt;sequence>
 *         &lt;element name="batchDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchEndReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="batchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqSearchBatch", propOrder = {
    "batchDate",
    "batchEndReason",
    "batchName",
    "batchNo",
    "batchType",
    "installationCode"
})
public class ReqSearchBatch
    extends BaseRequestVO
{

  protected String batchDate;

  protected String batchEndReason;

  protected String batchName;

  protected Integer batchNo;

  protected String batchType;

  protected String installationCode;

  /**
   * Gets the value of the batchDate property.
   *
   * @return possible object is {@link String }
   */
  public String getBatchDate()
  {
    return batchDate;
  }

  /**
   * Sets the value of the batchDate property.
   *
   * @param value allowed object is {@link String }
   */
  public void setBatchDate(String value)
  {
    this.batchDate = value;
  }

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

}
