package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBatchCompletedData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getBatchCompletedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchBatch" type="{http://services.server.ws.monitor.stgmastek.com/}reqSearchBatch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBatchCompletedData", propOrder = {
    "searchBatch"
})
public class GetBatchCompletedData
{

  protected ReqSearchBatch searchBatch;

  /**
   * Gets the value of the searchBatch property.
   *
   * @return possible object is {@link ReqSearchBatch }
   */
  public ReqSearchBatch getSearchBatch()
  {
    return searchBatch;
  }

  /**
   * Sets the value of the searchBatch property.
   *
   * @param value allowed object is {@link ReqSearchBatch }
   */
  public void setSearchBatch(ReqSearchBatch value)
  {
    this.searchBatch = value;
  }

}
