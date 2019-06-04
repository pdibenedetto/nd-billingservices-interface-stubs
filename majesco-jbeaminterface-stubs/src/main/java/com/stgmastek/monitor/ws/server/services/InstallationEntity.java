package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for installationEntity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="installationEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.ws.monitor.stgmastek.com/}baseVO">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lookupColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lookupValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRequiredParameters" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="onErrorFailAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precedenceOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valueColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "installationEntity", propOrder = {
    "description",
    "entity",
    "installationCode",
    "lookupColumn",
    "lookupValue",
    "numberOfRequiredParameters",
    "onErrorFailAll",
    "precedenceOrder",
    "valueColumn"
})
public class InstallationEntity
    extends BaseVO
{

  protected String description;

  protected String entity;

  protected String installationCode;

  protected String lookupColumn;

  protected String lookupValue;

  protected Integer numberOfRequiredParameters;

  protected String onErrorFailAll;

  protected Integer precedenceOrder;

  protected String valueColumn;

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
   * Gets the value of the entity property.
   *
   * @return possible object is {@link String }
   */
  public String getEntity()
  {
    return entity;
  }

  /**
   * Sets the value of the entity property.
   *
   * @param value allowed object is {@link String }
   */
  public void setEntity(String value)
  {
    this.entity = value;
  }

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
   * Gets the value of the lookupColumn property.
   *
   * @return possible object is {@link String }
   */
  public String getLookupColumn()
  {
    return lookupColumn;
  }

  /**
   * Sets the value of the lookupColumn property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLookupColumn(String value)
  {
    this.lookupColumn = value;
  }

  /**
   * Gets the value of the lookupValue property.
   *
   * @return possible object is {@link String }
   */
  public String getLookupValue()
  {
    return lookupValue;
  }

  /**
   * Sets the value of the lookupValue property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLookupValue(String value)
  {
    this.lookupValue = value;
  }

  /**
   * Gets the value of the numberOfRequiredParameters property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getNumberOfRequiredParameters()
  {
    return numberOfRequiredParameters;
  }

  /**
   * Sets the value of the numberOfRequiredParameters property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setNumberOfRequiredParameters(Integer value)
  {
    this.numberOfRequiredParameters = value;
  }

  /**
   * Gets the value of the onErrorFailAll property.
   *
   * @return possible object is {@link String }
   */
  public String getOnErrorFailAll()
  {
    return onErrorFailAll;
  }

  /**
   * Sets the value of the onErrorFailAll property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOnErrorFailAll(String value)
  {
    this.onErrorFailAll = value;
  }

  /**
   * Gets the value of the precedenceOrder property.
   *
   * @return possible object is {@link Integer }
   */
  public Integer getPrecedenceOrder()
  {
    return precedenceOrder;
  }

  /**
   * Sets the value of the precedenceOrder property.
   *
   * @param value allowed object is {@link Integer }
   */
  public void setPrecedenceOrder(Integer value)
  {
    this.precedenceOrder = value;
  }

  /**
   * Gets the value of the valueColumn property.
   *
   * @return possible object is {@link String }
   */
  public String getValueColumn()
  {
    return valueColumn;
  }

  /**
   * Sets the value of the valueColumn property.
   *
   * @param value allowed object is {@link String }
   */
  public void setValueColumn(String value)
  {
    this.valueColumn = value;
  }

}
