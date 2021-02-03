package com.inetwork.web.data.dto.manageorders;

import com.inetwork.common.dto.order.adminparams.AdminParametersPayload;
import com.inetwork.web.data.shared.searchorders.OrderStatus;
import com.inetwork.web.data.shared.OrderType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ResultModel")
@XmlType(name = "ResultModel")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultModel
{

   @XmlElement(name = "OrderId")
   private String orderId;
   @XmlElement(name = "OrderType")
   private OrderType orderType;
   @XmlElement(name = "AccountId")
   private int accountId;
   @XmlElement(name = "CustomerName")
   private String customerName;
   @XmlElement(name = "OrderStatus")
   private OrderStatus orderStatus;
   @XmlElement(name = "OrderDate")
   private String orderDate;
   @XmlElement(name = "LastModifyDate")
   private String lastModifyDate;
   @XmlElement(name = "LastNote")
   private String lastNote;
   @XmlElement(name = "VendorName")
   private String vendorName;
   @XmlElement(name = "Supped")
   private boolean isSupped;
   @XmlElement(name = "FocDate")
   private String focDate;
   @XmlElement(name = "AdminParameters")
   private AdminParametersPayload adminParameters;

   public String getOrderId()
   {
      return orderId;
   }

   public void setOrderId(String orderId)
   {
      this.orderId = orderId;
   }

   public OrderType getOrderType()
   {
      return orderType;
   }

   public void setOrderType(OrderType orderType)
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

   public OrderStatus getOrderStatus()
   {
      return orderStatus;
   }

   public void setOrderStatus(OrderStatus orderStatus)
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

   public boolean isSupped()
   {
      return isSupped;
   }

   public void setSupped(boolean supped)
   {
      isSupped = supped;
   }

   public String getFocDate()
   {
      return focDate;
   }

   public void setFocDate(String focDate)
   {
      this.focDate = focDate;
   }

   public AdminParametersPayload getAdminParameters()
   {
      return adminParameters;
   }

   public void setAdminParameters(AdminParametersPayload adminParameters)
   {
      this.adminParameters = adminParameters;
   }
}
