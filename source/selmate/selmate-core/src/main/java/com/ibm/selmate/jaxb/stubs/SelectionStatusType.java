//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 07:53:38 PM IST 
//

package com.ibm.selmate.jaxb.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SelectionStatusType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
&lt;simpleType name="SelectionStatusType">
  &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
    &lt;enumeration value="SELECT"/>
    &lt;enumeration value="DESELECT"/>
  &lt;/restriction>
&lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SelectionStatusType")
@XmlEnum
public enum SelectionStatusType {

	SELECT, DESELECT;

	public String value() {
		return name();
	}

	public static SelectionStatusType fromValue(String v) {
		return valueOf(v);
	}

}