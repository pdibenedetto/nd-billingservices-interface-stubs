package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveParametersForReport complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="retrieveParametersForReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Report" type="{http://services.server.ws.monitor.stgmastek.com/}report" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveParametersForReport", propOrder = {
    "report"
})
public class RetrieveParametersForReport
{

  @XmlElement(name = "Report")
  protected Report report;

  /**
   * Gets the value of the report property.
   *
   * @return possible object is {@link Report }
   */
  public Report getReport()
  {
    return report;
  }

  /**
   * Sets the value of the report property.
   *
   * @param value allowed object is {@link Report }
   */
  public void setReport(Report value)
  {
    this.report = value;
  }

}
