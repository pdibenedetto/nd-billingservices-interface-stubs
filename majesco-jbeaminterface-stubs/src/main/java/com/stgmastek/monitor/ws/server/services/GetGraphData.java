package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGraphData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getGraphData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batch" type="{http://services.server.ws.monitor.stgmastek.com/}reqBatch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGraphData", propOrder = {
    "batch"
})
public class GetGraphData
{

  protected ReqBatch batch;

  /**
   * Gets the value of the batch property.
   *
   * @return possible object is {@link ReqBatch }
   */
  public ReqBatch getBatch()
  {
    return batch;
  }

  /**
   * Sets the value of the batch property.
   *
   * @param value allowed object is {@link ReqBatch }
   */
  public void setBatch(ReqBatch value)
  {
    this.batch = value;
  }

}
