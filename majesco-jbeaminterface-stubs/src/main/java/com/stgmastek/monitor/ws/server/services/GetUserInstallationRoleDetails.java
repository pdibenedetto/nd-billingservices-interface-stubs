package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserInstallationRoleDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getUserInstallationRoleDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqUserDetailsVO" type="{http://services.server.ws.monitor.stgmastek.com/}reqUserDetailsVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserInstallationRoleDetails", propOrder = {
    "reqUserDetailsVO"
})
public class GetUserInstallationRoleDetails
{

  protected ReqUserDetailsVO reqUserDetailsVO;

  /**
   * Gets the value of the reqUserDetailsVO property.
   *
   * @return possible object is {@link ReqUserDetailsVO }
   */
  public ReqUserDetailsVO getReqUserDetailsVO()
  {
    return reqUserDetailsVO;
  }

  /**
   * Sets the value of the reqUserDetailsVO property.
   *
   * @param value allowed object is {@link ReqUserDetailsVO }
   */
  public void setReqUserDetailsVO(ReqUserDetailsVO value)
  {
    this.reqUserDetailsVO = value;
  }

}
