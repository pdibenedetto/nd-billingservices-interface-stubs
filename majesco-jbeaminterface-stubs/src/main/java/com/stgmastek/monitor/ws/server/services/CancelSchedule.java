package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelSchedule complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cancelSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processRequestScheduleVO" type="{http://services.server.ws.monitor.stgmastek.com/}reqProcessRequestScheduleVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelSchedule", propOrder = {
    "processRequestScheduleVO"
})
public class CancelSchedule
{

  protected ReqProcessRequestScheduleVO processRequestScheduleVO;

  /**
   * Gets the value of the processRequestScheduleVO property.
   *
   * @return possible object is {@link ReqProcessRequestScheduleVO }
   */
  public ReqProcessRequestScheduleVO getProcessRequestScheduleVO()
  {
    return processRequestScheduleVO;
  }

  /**
   * Sets the value of the processRequestScheduleVO property.
   *
   * @param value allowed object is {@link ReqProcessRequestScheduleVO }
   */
  public void setProcessRequestScheduleVO(ReqProcessRequestScheduleVO value)
  {
    this.processRequestScheduleVO = value;
  }

}
