package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reqProcessRequestScheduleVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="reqProcessRequestScheduleVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="installationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processRequestScheduleData" type="{http://services.server.ws.monitor.stgmastek.com/}processRequestScheduleData" minOccurs="0"/>
 *         &lt;element name="processRequestScheduleList" type="{http://services.server.ws.monitor.stgmastek.com/}processRequestScheduleData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reqProcessRequestScheduleVO", propOrder = {
    "installationCode",
    "processRequestScheduleData",
    "processRequestScheduleList"
})
public class ReqProcessRequestScheduleVO
    extends BaseResponseVO
{

  protected String installationCode;

  protected ProcessRequestScheduleData processRequestScheduleData;

  @XmlElement(nillable = true)
  protected List<ProcessRequestScheduleData> processRequestScheduleList;

  /**
   * Gets the value of the installationCode property.
   *
   * @return possible object is {@link String }
   */
  public String getInstallationCode()
  {
    return installationCode;
  }

  /**
   * Sets the value of the installationCode property.
   *
   * @param value allowed object is {@link String }
   */
  public void setInstallationCode(String value)
  {
    this.installationCode = value;
  }

  /**
   * Gets the value of the processRequestScheduleData property.
   *
   * @return possible object is {@link ProcessRequestScheduleData }
   */
  public ProcessRequestScheduleData getProcessRequestScheduleData()
  {
    return processRequestScheduleData;
  }

  /**
   * Sets the value of the processRequestScheduleData property.
   *
   * @param value allowed object is {@link ProcessRequestScheduleData }
   */
  public void setProcessRequestScheduleData(ProcessRequestScheduleData value)
  {
    this.processRequestScheduleData = value;
  }

  /**
   * Gets the value of the processRequestScheduleList property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the processRequestScheduleList property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getProcessRequestScheduleList().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ProcessRequestScheduleData }
   */
  public List<ProcessRequestScheduleData> getProcessRequestScheduleList()
  {
    if (processRequestScheduleList == null)
    {
      processRequestScheduleList = new ArrayList<ProcessRequestScheduleData>();
    }
    return this.processRequestScheduleList;
  }

}
