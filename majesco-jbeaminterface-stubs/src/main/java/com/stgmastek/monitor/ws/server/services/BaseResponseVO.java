package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseResponseVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="baseResponseVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="responseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseResponseVO", propOrder = {
    "description",
    "responseTime",
    "responseType"
})
@XmlSeeAlso({
                ResFailedObjectVO.class,
                ResUserDetailsVO.class,
                ResGraphVO.class,
                ResBatchInfo.class,
                ResInstructionVO.class,
                ResListenerVO.class,
                ResInstallationEntitiesVO.class,
                ReportParameter.class,
                ResMenuDetails.class,
                ExecuteReport.class,
                ReqCalendarVO.class,
                Report.class,
                ReqProcessRequestScheduleVO.class,
                ResBatchObjectVO.class,
                ResRoleDetailsVO.class,
                ResUserProfile.class,
                ResInstallationVO.class,
                ResUserDetails.class,
                ResBatchDataVO.class,
                ResCalendarVO.class,
                ResProcessRequestScheduleVO.class,
                ResSystemDetails.class,
                ResDropDownEntry.class
            })
public class BaseResponseVO
    extends BaseVO
{

  protected String description;

  protected Long responseTime;

  protected String responseType;

  /**
   * Gets the value of the description property.
   *
   * @return possible object is {@link String }
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Sets the value of the description property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDescription(String value)
  {
    this.description = value;
  }

  /**
   * Gets the value of the responseTime property.
   *
   * @return possible object is {@link Long }
   */
  public Long getResponseTime()
  {
    return responseTime;
  }

  /**
   * Sets the value of the responseTime property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setResponseTime(Long value)
  {
    this.responseTime = value;
  }

  /**
   * Gets the value of the responseType property.
   *
   * @return possible object is {@link String }
   */
  public String getResponseType()
  {
    return responseType;
  }

  /**
   * Sets the value of the responseType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setResponseType(String value)
  {
    this.responseType = value;
  }

}
