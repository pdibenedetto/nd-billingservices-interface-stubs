package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelScheduleResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cancelScheduleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.server.ws.monitor.stgmastek.com/}resProcessRequestScheduleVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelScheduleResponse", propOrder = {
    "_return"
})
public class CancelScheduleResponse
{

  @XmlElement(name = "return")
  protected ResProcessRequestScheduleVO _return;

  /**
   * Gets the value of the return property.
   *
   * @return possible object is {@link ResProcessRequestScheduleVO }
   */
  public ResProcessRequestScheduleVO getReturn()
  {
    return _return;
  }

  /**
   * Sets the value of the return property.
   *
   * @param value allowed object is {@link ResProcessRequestScheduleVO }
   */
  public void setReturn(ResProcessRequestScheduleVO value)
  {
    this._return = value;
  }

}
