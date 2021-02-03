package com.inetwork.web.data.dto.imports.e911;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.inetwork.web.data.dto.imports.linefeatures.e911.E911OrderResponsesWrapper;

@XmlRootElement(name = "ImportE911EndpointsResponse")
@XmlType(name = "ImportE911EndpointsResponse")
@XmlAccessorType(XmlAccessType.NONE)
public class ImportE911EndpointsResponse implements Serializable
{

   @XmlElement(name = "ErrorMessage")
   private String errorMessage;

   @XmlElement(name = "CustomerOrderId")
   private String customerOrderId;

   public String getCustomerOrderId() {
      return customerOrderId;
   }

   public void setCustomerOrderId(String customerOrderId) {
      this.customerOrderId = customerOrderId;
   }

   @XmlElement(name = "E911OrderResponsesWrapper")
   private E911OrderResponsesWrapper e911OrderResponsesWrapper;

   public E911OrderResponsesWrapper getE911OrderResponsesWrapper()
   {
      return e911OrderResponsesWrapper;
   }

   public void setE911OrderResponsesWrapper(E911OrderResponsesWrapper e911OrderResponsesWrapper)
   {
      this.e911OrderResponsesWrapper = e911OrderResponsesWrapper;
   }

   public String getErrorMessage()
   {
      return errorMessage;
   }

   public void setErrorMessage(String errorMessage)
   {
      this.errorMessage = errorMessage;
   }
}
