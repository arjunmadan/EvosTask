package com.inetwork.web.data.shared.manageorders;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.google.gwt.user.client.rpc.IsSerializable;

public class ManageOrdersResponse implements IsSerializable
{

   public ManageOrdersResponse()
   {
   }

   private ArrayList<OrderModel> orders = Lists.newArrayList();
   private ManageOrdersRequest request = new ManageOrdersRequest();
   private int totalCount = 0;

   public ArrayList<OrderModel> getOrders()
   {
      return orders;
   }

   public void setOrders(ArrayList<OrderModel> orders)
   {
      this.orders = orders;
   }

   public int getTotalCount()
   {
      return totalCount;
   }

   public void setTotalCount(int totalCount)
   {
      this.totalCount = totalCount;
   }

   public ManageOrdersRequest getRequest()
   {
      return request;
   }

   public void setRequest(ManageOrdersRequest request)
   {
      this.request = request;
   }

   public boolean add(OrderModel orderModel)
   {
      if (orders == null)
      {
         orders = Lists.newArrayList();
      }
      return orders.add(orderModel);
   }

   public void addAll(ArrayList<OrderModel> orderModels)
   {
      for (OrderModel orderModel : orderModels)
      {
         add(orderModel);
      }
   }
}
