package com.inetwork.web.data.shared.dto.disconnect;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.BaseOrder;

public class DisconnectOrder extends BaseOrder
{

   public static final String ROOT_ELEMENT = "DisconnectTelephoneNumberOrder";

   @Path("id")
   private String id;

   public interface Reader extends XmlReader<DisconnectOrder>
   {
   }

   public interface Writer extends XmlWriter<DisconnectOrder>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   public String getId()
   {
      return id;
   }

   public void setId(String id)
   {
      this.id = id;
   }

   @Override
   public String getOrderId()
   {
      return getId();
   }

   @Override
   public void setOrderId(String orderId)
   {
      setId(orderId);
   }

   @Path("DisconnectTelephoneNumberOrderType")
   private DisconnectTelephoneNumberOrderType orderType;

   public DisconnectTelephoneNumberOrderType getOrderType()
   {
      return orderType;
   }

   public void setOrderType(DisconnectTelephoneNumberOrderType orderType)
   {
      this.orderType = orderType;
   }
}
