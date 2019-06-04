package com.stgmastek.monitor.ws.server.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dropDownEntry complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="dropDownEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="dropDownKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropDownValue" type="{http://services.server.ws.monitor.stgmastek.com/}configParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dropDownEntry", propOrder = {
    "dropDownKey",
    "dropDownValue"
})
public class DropDownEntry
    extends BaseVO
{

  protected String dropDownKey;

  @XmlElement(nillable = true)
  protected List<ConfigParameter> dropDownValue;

  /**
   * Gets the value of the dropDownKey property.
   *
   * @return possible object is {@link String }
   */
  public String getDropDownKey()
  {
    return dropDownKey;
  }

  /**
   * Sets the value of the dropDownKey property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDropDownKey(String value)
  {
    this.dropDownKey = value;
  }

  /**
   * Gets the value of the dropDownValue property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the dropDownValue property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDropDownValue().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ConfigParameter }
   */
  public List<ConfigParameter> getDropDownValue()
  {
    if (dropDownValue == null)
    {
      dropDownValue = new ArrayList<ConfigParameter>();
    }
    return this.dropDownValue;
  }

}
