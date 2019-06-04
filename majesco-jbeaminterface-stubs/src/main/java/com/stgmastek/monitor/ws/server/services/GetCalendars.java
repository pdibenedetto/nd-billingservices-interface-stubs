package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCalendars complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getCalendars">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calendarVO" type="{http://services.server.ws.monitor.stgmastek.com/}reqCalendarVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCalendars", propOrder = {
    "calendarVO"
})
public class GetCalendars
{

  protected ReqCalendarVO calendarVO;

  /**
   * Gets the value of the calendarVO property.
   *
   * @return possible object is {@link ReqCalendarVO }
   */
  public ReqCalendarVO getCalendarVO()
  {
    return calendarVO;
  }

  /**
   * Sets the value of the calendarVO property.
   *
   * @param value allowed object is {@link ReqCalendarVO }
   */
  public void setCalendarVO(ReqCalendarVO value)
  {
    this.calendarVO = value;
  }

}
