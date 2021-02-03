package com.inetwork.web.data.dto.manageorders;

import com.inetwork.web.data.shared.ConverterType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ConverterDescription")
@XmlType(name = "ConverterDescription")
@XmlAccessorType(XmlAccessType.NONE)
public class ConverterDescription
{

   @XmlElement(name = "RequestDescription")
   private RequestDescription requestDescription;

   @XmlElement(name = "ConverterType")
   private ConverterType converterType;

   public RequestDescription getRequestDescription()
   {
      return requestDescription;
   }

   public void setRequestDescription(RequestDescription requestDescription)
   {
      this.requestDescription = requestDescription;
   }

   public ConverterType getConverterType()
   {
      return converterType;
   }

   public void setConverterType(ConverterType converterType)
   {
      this.converterType = converterType;
   }

   @Override
   public String toString()
   {
      return String.format("ConverterDescription{requestDescription=%s, converterType=%s}", requestDescription, converterType);
   }
}
