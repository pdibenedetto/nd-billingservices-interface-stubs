package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for objectExecutionGraphData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="objectExecutionGraphData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="batchRevNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="collectTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="graphId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="graphValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="graphXAxis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="graphYAxis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectExecutionGraphData", propOrder = {
    "batchNo",
    "batchRevNo",
    "collectTime",
    "graphId",
    "graphValue",
    "graphXAxis",
    "graphYAxis",
    "installationCode"
})
public class ObjectExecutionGraphData
    extends BaseVO
{

  protected Integer batchNo;

  protected Integer batchRevNo;

  protected Long collectTime;

  protected String graphId;

  protected Double graphValue;

  protected String graphXAxis;

  protected String graphYAxis;

  protected String installationCode;

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
   * Gets the value of the collectTime property.
   *
   * @return possible object is {@link Long }
   */
  public Long getCollectTime()
  {
    return collectTime;
  }

  /**
   * Sets the value of the collectTime property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setCollectTime(Long value)
  {
    this.collectTime = value;
  }

  /**
   * Gets the value of the graphId property.
   *
   * @return possible object is {@link String }
   */
  public String getGraphId()
  {
    return graphId;
  }

  /**
   * Sets the value of the graphId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setGraphId(String value)
  {
    this.graphId = value;
  }

  /**
   * Gets the value of the graphValue property.
   *
   * @return possible object is {@link Double }
   */
  public Double getGraphValue()
  {
    return graphValue;
  }

  /**
   * Sets the value of the graphValue property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setGraphValue(Double value)
  {
    this.graphValue = value;
  }

  /**
   * Gets the value of the graphXAxis property.
   *
   * @return possible object is {@link String }
   */
  public String getGraphXAxis()
  {
    return graphXAxis;
  }

  /**
   * Sets the value of the graphXAxis property.
   *
   * @param value allowed object is {@link String }
   */
  public void setGraphXAxis(String value)
  {
    this.graphXAxis = value;
  }

  /**
   * Gets the value of the graphYAxis property.
   *
   * @return possible object is {@link String }
   */
  public String getGraphYAxis()
  {
    return graphYAxis;
  }

  /**
   * Sets the value of the graphYAxis property.
   *
   * @param value allowed object is {@link String }
   */
  public void setGraphYAxis(String value)
  {
    this.graphYAxis = value;
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
