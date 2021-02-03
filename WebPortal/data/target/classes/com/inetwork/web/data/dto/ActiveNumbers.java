package com.inetwork.web.data.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "ActiveNumbers")
@XmlType(name = "ActiveNumbers")
@XmlAccessorType(XmlAccessType.FIELD)
public class ActiveNumbers
{
   @XmlElementWrapper(name = "TelephoneNumbers")
   @XmlElement(name = "TelephoneNumber")
   private List<String> phoneNumbers;
   @XmlElement(name = "ResponseStatus")
   private ResponseStatus responseStatus;

   public List<String> getPhoneNumbers()
   {
      return phoneNumbers;
   }

   public void setPhoneNumbers(List<String> phoneNumbers)
   {
      this.phoneNumbers = phoneNumbers;
   }

   public ResponseStatus getResponseStatus()
   {
      return responseStatus;
   }

   public void setResponseStatus(ResponseStatus responseStatus)
   {
      this.responseStatus = responseStatus;
   }
}
