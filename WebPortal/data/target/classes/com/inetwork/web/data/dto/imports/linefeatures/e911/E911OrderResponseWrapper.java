package com.inetwork.web.data.dto.imports.linefeatures.e911;

import com.inetwork.common.dto.e911.order.create.E911OrderResponse;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "E911OrderResponseWrapper")
@XmlType(name = "E911OrderResponseWrapper")
@XmlAccessorType(XmlAccessType.NONE)
public class E911OrderResponseWrapper
{
   @XmlElement(name = "E911OrderResponse")
   private E911OrderResponse e911OrderResponse;
   @XmlElementWrapper(name = "TelephoneNumbers")
   @XmlElement(name = "TelephoneNumber")
   private List<String> telephoneNumbers;

   public E911OrderResponse getE911OrderResponse()
   {
      return e911OrderResponse;
   }

   public void setE911OrderResponse(E911OrderResponse e911OrderResponse)
   {
      this.e911OrderResponse = e911OrderResponse;
   }

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }
}
