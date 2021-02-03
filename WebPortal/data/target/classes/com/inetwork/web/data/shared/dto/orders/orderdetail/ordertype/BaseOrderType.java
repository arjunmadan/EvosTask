package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import name.pehl.piriti.commons.client.Path;

public abstract class BaseOrderType
{

   @Path("Quantity")
   private int quantity;

   public abstract String getOrderType();

   public abstract String getSearchFilterValues();

   public int getQuantity()
   {
      return quantity;
   }

   public void setQuantity(int quantity)
   {
      this.quantity = quantity;
   }
}
