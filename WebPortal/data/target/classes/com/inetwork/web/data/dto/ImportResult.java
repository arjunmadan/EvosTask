package com.inetwork.web.data.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.inetwork.common.dto.order.OrderError;
import com.inetwork.web.data.shared.ServiceConstants;

@XmlRootElement(name = "importresult")
@XmlType(name = "importresult")
@XmlAccessorType(XmlAccessType.FIELD)
public class ImportResult extends ResponseStatus
{

   @XmlElement(name = "OrderId")
   private String orderId;
   @XmlElementWrapper(name = "ErrorList")
   @XmlElement(name = "Error")
   private List<OrderError> errors;

   public String getOrderId()
   {
      return orderId;
   }

   public void setOrderId(String orderId)
   {
      this.orderId = orderId;
   }

   public List<OrderError> getErrors()
   {
      return errors;
   }

   public void setErrors(List<OrderError> errors)
   {
      this.errors = errors;
   }

   public ImportResult setBadResult(String description)
   {
      setOrderId(null);
      setCode(ServiceConstants.SC_BAD_REQUEST);
      setDescription(description);
      return this;
   }

   public ImportResult setForbiddenResult()
   {
      setOrderId(null);
      setCode(ServiceConstants.SC_FORBIDDEN);
      return this;
   }
}
