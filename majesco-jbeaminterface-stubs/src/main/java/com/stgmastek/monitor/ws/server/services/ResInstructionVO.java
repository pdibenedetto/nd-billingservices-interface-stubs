package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resInstructionVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="resInstructionVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseResponseVO">
 *       &lt;sequence>
 *         &lt;element name="instructionLog" type="{http://services.server.ws.monitor.stgmastek.com/}instructionLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resInstructionVO", propOrder = {
    "instructionLog"
})
public class ResInstructionVO
    extends BaseResponseVO
{

  protected InstructionLog instructionLog;

  /**
   * Gets the value of the instructionLog property.
   *
   * @return possible object is {@link InstructionLog }
   */
  public InstructionLog getInstructionLog()
  {
    return instructionLog;
  }

  /**
   * Sets the value of the instructionLog property.
   *
   * @param value allowed object is {@link InstructionLog }
   */
  public void setInstructionLog(InstructionLog value)
  {
    this.instructionLog = value;
  }

}
