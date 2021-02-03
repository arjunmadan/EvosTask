package com.inetwork.web.data.shared.dto.disconnect;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.OrderType;
import com.inetwork.web.data.shared.dto.FeatureOrder;
import com.inetwork.web.data.shared.dto.HasTnErrors;
import com.inetwork.web.data.shared.dto.TelephoneNumberError;
import com.inetwork.web.data.shared.searchorders.OrderStatus;

public class DisconnectTelephoneNumberOrderResponse implements HasTnErrors, FeatureOrder
{
   public DisconnectTelephoneNumberOrderResponse()
   {
   }

   public interface Reader extends XmlReader<DisconnectTelephoneNumberOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<DisconnectTelephoneNumberOrderResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("DisconnectedTelephoneNumberList/TelephoneNumber")
   private List<String> disconnectedTelephoneNumbers;
   @Path("OrderStatus")
   private OrderStatus orderStatus;
   @Path("orderRequest")
   private DisconnectOrder disconnectOrder;
   @Path("ErrorList/Error")
   private List<TelephoneNumberError> errors;

   @Override
   public List<TelephoneNumberError> getErrors()
   {
      return errors;
   }

   @Override
   public Integer getAccountId()
   {
      return null;
   }

   @Override
   public OrderType getOrderType()
   {
      return OrderType.DISCONNECT;
   }

   public void setErrors(List<TelephoneNumberError> errors)
   {
      this.errors = errors;
   }

   public String getOrderId()
   {
      return disconnectOrder != null ? disconnectOrder.getOrderId() : null;
   }

   public DisconnectOrder getDisconnectOrder()
   {
      return disconnectOrder;
   }

   public void setDisconnectOrder(DisconnectOrder disconnectOrder)
   {
      this.disconnectOrder = disconnectOrder;
   }

   public List<String> getDisconnectedTelephoneNumbers()
   {
      return disconnectedTelephoneNumbers;
   }

   public void setDisconnectedTelephoneNumbers(List<String> disconnectedTelephoneNumbers)
   {
      this.disconnectedTelephoneNumbers = disconnectedTelephoneNumbers;
   }

   public OrderStatus getOrderStatus()
   {
      return orderStatus;
   }

   public void setOrderStatus(OrderStatus orderStatus)
   {
      this.orderStatus = orderStatus;
   }
}
