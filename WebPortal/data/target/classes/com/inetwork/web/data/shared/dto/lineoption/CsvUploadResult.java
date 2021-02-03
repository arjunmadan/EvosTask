package com.inetwork.web.data.shared.dto.lineoption;

import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

public class CsvUploadResult implements IsSerializable
{

   public CsvUploadResult()
   {
   }

   private String goodMessage;
   private String orderDetailLink;
   private String errorMessage;
   private List<LineOptionError> errors;

   public String getGoodMessage()
   {
      return goodMessage;
   }

   public void setGoodMessage(String goodMessage)
   {
      this.goodMessage = goodMessage;
   }

   public String getOrderDetailLink()
   {
      return orderDetailLink;
   }

   public void setOrderDetailsUrl(String orderDetailLink)
   {
      this.orderDetailLink = orderDetailLink;
   }

   public String getErrorMessage()
   {
      return errorMessage;
   }

   public void setErrorMessage(String errorMessage)
   {
      this.errorMessage = errorMessage;
   }

   public List<LineOptionError> getErrors()
   {
      return errors;
   }

   public void setErrors(List<LineOptionError> errors)
   {
      this.errors = errors;
   }
}
