package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqBatchDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="reqBatchDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}reqBatch">
 *       &lt;sequence>
 *         &lt;element name="cycleNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prePost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqBatchDetails", propOrder = {
    "cycleNo",
    "prePost"
})
public class ReqBatchDetails
    extends ReqBatch
{

  protected Integer cycleNo;

  protected String prePost;

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
   * Gets the value of the prePost property.
   *
   * @return possible object is {@link String }
   */
  public String getPrePost()
  {
    return prePost;
  }

  /**
   * Sets the value of the prePost property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPrePost(String value)
  {
    this.prePost = value;
  }

}
