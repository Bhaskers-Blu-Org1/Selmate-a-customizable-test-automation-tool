//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 07:53:38 PM IST 
//

package com.ibm.selmate.jaxb.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for OpenURLCommandType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
&lt;complexType name="OpenURLCommandType">
  &lt;complexContent>
    &lt;extension base="{http://www.ibm.com/selmate}AbstractCommandType">
      &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
    &lt;/extension>
  &lt;/complexContent>
&lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenURLCommandType")
public class OpenURLCommandType extends AbstractCommandType {

	@XmlAttribute(name = "url")
	protected String url;

	/**
	 * Gets the value of the url property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the value of the url property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setUrl(String value) {
		this.url = value;
	}

}
