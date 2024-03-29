package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instructionParameter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="instructionParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseRequestVO">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instructionParameter", propOrder = {
    "name",
    "slNo",
    "type",
    "value"
})
public class InstructionParameter
    extends BaseRequestVO
{

  protected String name;

  protected Integer slNo;

  protected String type;

  protected String value;

  /**
   * Gets the value of the name property.
   *
   * @return possible object is {@link String }
   */
  public String getName()
  {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value allowed object is {@link String }
   */
  public void setName(String value)
  {
    this.name = value;
  }

  /**
   * Gets the value of the slNo property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getSlNo()
  {
    return slNo;
  }

  /**
   * Sets the value of the slNo property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setSlNo(Integer value)
  {
    this.slNo = value;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is {@link String }
   */
  public String getType()
  {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is {@link String }
   */
  public void setType(String value)
  {
    this.type = value;
  }

  /**
   * Gets the value of the value property.
   *
   * @return possible object is {@link String }
   */
  public String getValue()
  {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is {@link String }
   */
  public void setValue(String value)
  {
    this.value = value;
  }

}
