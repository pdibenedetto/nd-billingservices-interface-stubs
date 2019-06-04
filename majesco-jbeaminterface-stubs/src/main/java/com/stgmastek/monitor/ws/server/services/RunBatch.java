package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runBatch complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="runBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqInstructionLog" type="{http://services.server.ws.monitor.stgmastek.com/}reqInstructionLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runBatch", propOrder = {
    "reqInstructionLog"
})
public class RunBatch
{

  protected ReqInstructionLog reqInstructionLog;

  /**
   * Gets the value of the reqInstructionLog property.
   *
   * @return possible object is {@link ReqInstructionLog }
   */
  public ReqInstructionLog getReqInstructionLog()
  {
    return reqInstructionLog;
  }

  /**
   * Sets the value of the reqInstructionLog property.
   *
   * @param value allowed object is {@link ReqInstructionLog }
   */
  public void setReqInstructionLog(ReqInstructionLog value)
  {
    this.reqInstructionLog = value;
  }

}
