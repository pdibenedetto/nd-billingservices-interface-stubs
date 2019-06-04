package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqCalendarVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="reqCalendarVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="calendarData" type="{http://services.server.ws.monitor.stgmastek.com/}monitorCalendarData" minOccurs="0"/>
 *         &lt;element name="calendarList" type="{http://services.server.ws.monitor.stgmastek.com/}monitorCalendarData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqCalendarVO", propOrder = {
    "calendarData",
    "calendarList"
})
public class ReqCalendarVO
    extends BaseResponseVO
{

  protected MonitorCalendarData calendarData;

  @XmlElement(nillable = true)
  protected List<MonitorCalendarData> calendarList;

  /**
   * Gets the value of the calendarData property.
   *
   * @return possible object is {@link MonitorCalendarData }
   */
  public MonitorCalendarData getCalendarData()
  {
    return calendarData;
  }

  /**
   * Sets the value of the calendarData property.
   *
   * @param value allowed object is {@link MonitorCalendarData }
   */
  public void setCalendarData(MonitorCalendarData value)
  {
    this.calendarData = value;
  }

  /**
   * Gets the value of the calendarList property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the calendarList property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCalendarList().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link MonitorCalendarData }
   */
  public List<MonitorCalendarData> getCalendarList()
  {
    if (calendarList == null)
    {
      calendarList = new ArrayList<MonitorCalendarData>();
    }
    return this.calendarList;
  }

}
