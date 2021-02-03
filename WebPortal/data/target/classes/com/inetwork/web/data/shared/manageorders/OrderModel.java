package com.inetwork.web.data.shared.manageorders;

import com.google.gwt.user.client.rpc.IsSerializable;

public class OrderModel implements IsSerializable
{

   private String orderId;
   private String orderType;
   private int accountId;
   private String customerName;
   private String orderStatus;
   private String orderDate;
   private String lastModifyDate;
   private String lastNote;
   private String vendorName;
   private Integer suppCount;
   private String focDate;
   private String adminActivity;
   private String bandwidthPrime;
   private String customerOrderId;

   public OrderModel()
   {
   }

   public OrderModel(String orderType)
   {
      this.orderType = orderType;
   }

   public String getOrderId()
   {
      return orderId;
   }

   public void setOrderId(String orderId)
   {
      this.orderId = orderId;
   }

   public String getOrderType()
   {
      return orderType;
   }

   public void setOrderType(String orderType)
   {
      this.orderType = orderType;
   }

   public int getAccountId()
   {
      return accountId;
   }

   public void setAccountId(int accountId)
   {
      this.accountId = accountId;
   }

   public String getCustomerName()
   {
      return customerName;
   }

   public void setCustomerName(String customerName)
   {
      this.customerName = customerName;
   }

   public String getOrderStatus()
   {
      return orderStatus;
   }

   public void setOrderStatus(String orderStatus)
   {
      this.orderStatus = orderStatus;
   }

   public String getOrderDate()
   {
      return orderDate;
   }

   public void setOrderDate(String orderDate)
   {
      this.orderDate = orderDate;
   }

   public String getLastModifyDate()
   {
      return lastModifyDate;
   }

   public void setLastModifyDate(String lastModifyDate)
   {
      this.lastModifyDate = lastModifyDate;
   }

   public String getLastNote()
   {
      return lastNote;
   }

   public void setLastNote(String lastNote)
   {
      this.lastNote = lastNote;
   }

   public String getVendorName()
   {
      return vendorName;
   }

   public void setVendorName(String vendorName)
   {
      this.vendorName = vendorName;
   }

   public Integer getSuppCount()
   {
      return suppCount;
   }

   public void setSuppCount(Integer suppCount)
   {
      this.suppCount = suppCount;
   }

   public String getFocDate()
   {
      return focDate;
   }

   public void setFocDate(String focDate)
   {
      this.focDate = focDate;
   }

   public String getAdminActivity()
   {
      return adminActivity;
   }

   public void setAdminActivity(String adminActivity)
   {
      this.adminActivity = adminActivity;
   }

   public String getBandwidthPrime()
   {
      return bandwidthPrime;
   }

   public void setBandwidthPrime(String bandwidthPrime)
   {
      this.bandwidthPrime = bandwidthPrime;
   }

   public String getCustomerOrderId()
   {
      return customerOrderId;
   }

   public void setCustomerOrderId(String customerOrderId)
   {
      this.customerOrderId = customerOrderId;
   }
}
