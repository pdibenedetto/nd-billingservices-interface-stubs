package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="systemDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="batchRevNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="javaVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxMemory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="osConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputDirFreeMem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputDirPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usedMemory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemDetails", propOrder = {
    "batchNo",
    "batchRevNo",
    "javaVersion",
    "maxMemory",
    "osConfig",
    "outputDirFreeMem",
    "outputDirPath",
    "preVersion",
    "usedMemory"
})
public class SystemDetails
    extends BaseVO
{

  protected Integer batchNo;

  protected Integer batchRevNo;

  protected String javaVersion;

  protected Integer maxMemory;

  protected String osConfig;

  protected String outputDirFreeMem;

  protected String outputDirPath;

  protected String preVersion;

  protected Integer usedMemory;

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
   * Gets the value of the javaVersion property.
   *
   * @return possible object is {@link String }
   */
  public String getJavaVersion()
  {
    return javaVersion;
  }

  /**
   * Sets the value of the javaVersion property.
   *
   * @param value allowed object is {@link String }
   */
  public void setJavaVersion(String value)
  {
    this.javaVersion = value;
  }

  /**
   * Gets the value of the maxMemory property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getMaxMemory()
  {
    return maxMemory;
  }

  /**
   * Sets the value of the maxMemory property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setMaxMemory(Integer value)
  {
    this.maxMemory = value;
  }

  /**
   * Gets the value of the osConfig property.
   *
   * @return possible object is {@link String }
   */
  public String getOsConfig()
  {
    return osConfig;
  }

  /**
   * Sets the value of the osConfig property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOsConfig(String value)
  {
    this.osConfig = value;
  }

  /**
   * Gets the value of the outputDirFreeMem property.
   *
   * @return possible object is {@link String }
   */
  public String getOutputDirFreeMem()
  {
    return outputDirFreeMem;
  }

  /**
   * Sets the value of the outputDirFreeMem property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOutputDirFreeMem(String value)
  {
    this.outputDirFreeMem = value;
  }

  /**
   * Gets the value of the outputDirPath property.
   *
   * @return possible object is {@link String }
   */
  public String getOutputDirPath()
  {
    return outputDirPath;
  }

  /**
   * Sets the value of the outputDirPath property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOutputDirPath(String value)
  {
    this.outputDirPath = value;
  }

  /**
   * Gets the value of the preVersion property.
   *
   * @return possible object is {@link String }
   */
  public String getPreVersion()
  {
    return preVersion;
  }

  /**
   * Sets the value of the preVersion property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPreVersion(String value)
  {
    this.preVersion = value;
  }

  /**
   * Gets the value of the usedMemory property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getUsedMemory()
  {
    return usedMemory;
  }

  /**
   * Sets the value of the usedMemory property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setUsedMemory(Integer value)
  {
    this.usedMemory = value;
  }

}
