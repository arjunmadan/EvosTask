package com.inetwork.web.data.shared.manageorders;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.inetwork.web.data.shared.OrderType;
import com.inetwork.web.data.shared.searchorders.AdminActivity;
import com.inetwork.web.data.shared.searchorders.OrderStatus;
import com.inetwork.web.data.shared.utils.StringUtils;

public class ManageOrdersRequest implements IsSerializable
{
   private ArrayList<String> accountIds;
   private boolean excludeAccounts;
   private ArrayList<String> primeContact;
   private ArrayList<OrderType> orderTypes;
   private ArrayList<OrderStatus> orderStatuses;
   private String orderNumber;
   private ArrayList<AdminActivity> adminActivities;
   private String contact;
   private String afterDate;

   public ManageOrdersRequest()
   {
   }

   public ArrayList<String> getAccountIds()
   {
      return accountIds;
   }

   public void setAccountIds(ArrayList<String> accountIds)
   {
      this.accountIds = accountIds;
   }

   public ArrayList<String> getPrimeContact()
   {
      return primeContact;
   }

   public void setPrimeContact(ArrayList<String> primeContacts)
   {
      this.primeContact = primeContacts;
   }

   public ArrayList<OrderType> getOrderTypes()
   {
      return orderTypes;
   }

   public void setOrderTypes(ArrayList<OrderType> orderTypes)
   {
      this.orderTypes = orderTypes;
   }

   public ArrayList<OrderStatus> getOrderStatuses()
   {
      return orderStatuses;
   }

   public void setOrderStatuses(ArrayList<OrderStatus> orderStatuses)
   {
      this.orderStatuses = orderStatuses;
   }

   public String getOrderNumber()
   {
      return orderNumber;
   }

   public void setOrderNumber(String orderNumber)
   {
      this.orderNumber = orderNumber;
   }

   public ArrayList<AdminActivity> getAdminActivities()
   {
      return adminActivities;
   }

   public void setAdminActivities(ArrayList<AdminActivity> adminActivities)
   {
      this.adminActivities = adminActivities;
   }

   public String getAfterDate()
   {
      return afterDate;
   }

   public void setAfterDate(String afterDate)
   {
      this.afterDate = afterDate;
   }

   public boolean getExcludeAccounts()
   {
      return excludeAccounts;
   }

   public void setExcludeAccounts(boolean excludeAccounts)
   {
      this.excludeAccounts = excludeAccounts;
   }

   public String getContact()
   {
      return contact;
   }

   public void setContact(String contact)
   {
      this.contact = contact;
   }

   public void setByOrderIdSearch(String orderId)
   {
      orderNumber = orderId;
      accountIds = Lists.newArrayList();
      excludeAccounts = false;
      primeContact = Lists.newArrayList();
      orderTypes = Lists.newArrayList();
      orderStatuses = Lists.newArrayList();
      adminActivities = Lists.newArrayList();
      afterDate = StringUtils.EMPTY_STRING;
   }
}
