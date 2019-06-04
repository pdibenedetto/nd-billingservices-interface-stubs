package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBatchEntityData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getBatchEntityData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqInstallationVO" type="{http://services.server.ws.monitor.stgmastek.com/}reqInstallationVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBatchEntityData", propOrder = {
    "reqInstallationVO"
})
public class GetBatchEntityData
{

  protected ReqInstallationVO reqInstallationVO;

  /**
   * Gets the value of the reqInstallationVO property.
   *
   * @return possible object is {@link ReqInstallationVO }
   */
  public ReqInstallationVO getReqInstallationVO()
  {
    return reqInstallationVO;
  }

  /**
   * Sets the value of the reqInstallationVO property.
   *
   * @param value allowed object is {@link ReqInstallationVO }
   */
  public void setReqInstallationVO(ReqInstallationVO value)
  {
    this.reqInstallationVO = value;
  }

}
