package com.inetwork.web.data.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ResponseStatus")
@XmlType(name = "ResponseStatus")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseStatus
{

   @XmlElement(name = "code")
   private int code;

   @XmlElement(name = "description")
   private String description;

   public int getCode()
   {
      return code;
   }

   public void setCode(int code)
   {
      this.code = code;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public String toXml()
   {
      StringBuilder xml = new StringBuilder();
      xml.append("<code>")
            .append(code)
            .append("</code>");
      xml.append("<description>")
            .append(description)
            .append("</description>");
      return xml.toString();
   }
}
