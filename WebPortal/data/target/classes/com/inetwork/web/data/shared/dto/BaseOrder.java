package com.inetwork.web.data.shared.dto;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.searchorders.OrderStatus;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class BaseOrder
{

   public interface Reader extends XmlReader<BaseOrder>
   {
   }

   public interface Writer extends XmlWriter<BaseOrder>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("ProcessingStatus")
   private OrderStatus processingStatus;

   @Path("OrderId")
   private String orderId;
   @Path("AccountId")
   private Integer accountId;
   @Path("Name")
   private String name;
   @Path("LastModifiedDate")
   private String lastModifiedDate;
   @Path("LastModifiedBy")
   private String lastModifiedBy;
   @Path("CreatedByUser")
   private String createdByUser;
   @Path("CustomerOrderId")
   private String customerOrderId;
   @Path("SiteId")
   private Integer siteId;
   @Path("PeerId")
   private Integer peerId;
   @Path("OrderCreateDate")
   private String orderCreateDate;
   private boolean isUcTrunkingSeatAccount;

   public OrderStatus getProcessingStatus()
   {
      return processingStatus;
   }

   public void setProcessingStatus(OrderStatus processingStatus)
   {
      this.processingStatus = processingStatus;
   }

   public String getOrderId()
   {
      return orderId;
   }

   public void setOrderId(String orderId)
   {
      this.orderId = orderId;
   }

   public Integer getAccountId()
   {
      return accountId;
   }

   public void setAccountId(Integer accountId)
   {
      this.accountId = accountId;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getLastModifiedDate()
   {
      return lastModifiedDate;
   }

   public void setLastModifiedDate(String lastModifiedDate)
   {
      this.lastModifiedDate = lastModifiedDate;
   }

   public String getLastModifiedBy()
   {
      return lastModifiedBy;
   }

   public void setLastModifiedBy(String lastModifiedBy)
   {
      this.lastModifiedBy = lastModifiedBy;
   }

   public String getCreatedByUser()
   {
      return createdByUser;
   }

   public void setCreatedByUser(String createdByUser)
   {
      this.createdByUser = createdByUser;
   }

   public String getCustomerOrderId()
   {
      return customerOrderId;
   }

   public void setCustomerOrderId(String customerOrderId)
   {
      this.customerOrderId = customerOrderId;
   }

   public Integer getSiteId()
   {
      return siteId;
   }

   public void setSiteId(Integer siteId)
   {
      this.siteId = siteId;
   }

   public Integer getPeerId()
   {
      return peerId;
   }

   public void setPeerId(Integer peerId)
   {
      this.peerId = peerId;
   }

   public String getOrderCreateDate()
   {
      return orderCreateDate;
   }

   public void setOrderCreateDate(String orderCreateDate)
   {
      this.orderCreateDate = orderCreateDate;
   }

   public boolean isUcTrunkingSeatAccount()
   {
      return isUcTrunkingSeatAccount;
   }

   public void setUcTrunkingSeatAccount(boolean isUcTrunkingSeatAccount)
   {
      this.isUcTrunkingSeatAccount = isUcTrunkingSeatAccount;
   }
}
