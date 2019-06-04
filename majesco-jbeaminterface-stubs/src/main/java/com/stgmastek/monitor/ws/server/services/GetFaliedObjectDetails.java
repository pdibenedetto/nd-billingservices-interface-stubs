package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFaliedObjectDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getFaliedObjectDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqListenerInfo" type="{http://services.server.ws.monitor.stgmastek.com/}reqListenerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFaliedObjectDetails", propOrder = {
    "reqListenerInfo"
})
public class GetFaliedObjectDetails
{

  protected ReqListenerInfo reqListenerInfo;

  /**
   * Gets the value of the reqListenerInfo property.
   *
   * @return possible object is {@link ReqListenerInfo }
   */
  public ReqListenerInfo getReqListenerInfo()
  {
    return reqListenerInfo;
  }

  /**
   * Sets the value of the reqListenerInfo property.
   *
   * @param value allowed object is {@link ReqListenerInfo }
   */
  public void setReqListenerInfo(ReqListenerInfo value)
  {
    this.reqListenerInfo = value;
  }

}
