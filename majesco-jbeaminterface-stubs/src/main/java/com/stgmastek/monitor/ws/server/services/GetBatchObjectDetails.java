package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBatchObjectDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getBatchObjectDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBatchDetails" type="{http://services.server.ws.monitor.stgmastek.com/}reqBatchDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBatchObjectDetails", propOrder = {
    "reqBatchDetails"
})
public class GetBatchObjectDetails
{

  protected ReqBatchDetails reqBatchDetails;

  /**
   * Gets the value of the reqBatchDetails property.
   *
   * @return possible object is {@link ReqBatchDetails }
   */
  public ReqBatchDetails getReqBatchDetails()
  {
    return reqBatchDetails;
  }

  /**
   * Sets the value of the reqBatchDetails property.
   *
   * @param value allowed object is {@link ReqBatchDetails }
   */
  public void setReqBatchDetails(ReqBatchDetails value)
  {
    this.reqBatchDetails = value;
  }

}
