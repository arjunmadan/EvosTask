package com.inetwork.web.data.shared.dto.orders.orderdetail.orderhistory;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

public class OrderHistories
{

   public interface Reader extends XmlReader<OrderHistories>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("OrderHistory")
   private List<OrderHistory> orderHistories;

   public List<OrderHistory> getOrderHistories()
   {
      return orderHistories;
   }

   public void setOrderHistories(List<OrderHistory> orderHistories)
   {
      this.orderHistories = orderHistories;
   }
}
