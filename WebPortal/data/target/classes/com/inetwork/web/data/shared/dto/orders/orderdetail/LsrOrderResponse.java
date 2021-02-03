package com.inetwork.web.data.shared.dto.orders.orderdetail;

import java.util.List;

import com.inetwork.web.data.shared.dto.ResponseStatus;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.lsr.LsrOrderError;

public class LsrOrderResponse
{
   public interface Reader extends XmlReader<LsrOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<LsrOrderResponse>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

   @Path("LsrOrderErrors/LsrOrderError")
   private List<LsrOrderError> errors;

   @Path("LsrOrder")
   private LsrOrderPayload orderPayload;

   @Path("ResponseStatus")
   private ResponseStatus responseStatus;

   public List<LsrOrderError> getErrors()
   {
      return errors;
   }

   public void setErrors(List<LsrOrderError> errors)
   {
      this.errors = errors;
   }

   public LsrOrderPayload getOrderPayload()
   {
      return orderPayload;
   }

   public void setOrderPayload(LsrOrderPayload orderPayload)
   {
      this.orderPayload = orderPayload;
   }

   public ResponseStatus getResponseStatus()
   {
      return responseStatus;
   }

   public void setResponseStatus(ResponseStatus responseStatus)
   {
      this.responseStatus = responseStatus;
   }

   @Override
   public String toString()
   {
      return "LsrOrderResponse [order=" + orderPayload + ", orderErrors=" + errors + ", responseStatus="+"]";
   }
}
