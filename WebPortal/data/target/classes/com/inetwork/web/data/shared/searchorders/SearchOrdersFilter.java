package com.inetwork.web.data.shared.searchorders;

import static com.inetwork.web.data.shared.ServiceConstants.ACTION;
import static com.inetwork.web.data.shared.ServiceConstants.CALLING_ENDPOINT;
import static com.inetwork.web.data.shared.ServiceConstants.CREATED_FROM_DATE;
import static com.inetwork.web.data.shared.ServiceConstants.CREATED_TO_DATE;
import static com.inetwork.web.data.shared.ServiceConstants.CUSTOMER_INTERNAL_ID;
import static com.inetwork.web.data.shared.ServiceConstants.END_DATE;
import static com.inetwork.web.data.shared.ServiceConstants.ORDER_ID_FRAGMENT;
import static com.inetwork.web.data.shared.ServiceConstants.PON;
import static com.inetwork.web.data.shared.ServiceConstants.START_DATE;
import static com.inetwork.web.data.shared.ServiceConstants.STATUS;
import static com.inetwork.web.data.shared.ServiceConstants.TN;

import java.util.Collection;
import java.util.Objects;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.inetwork.web.data.shared.OrderType;
import com.inetwork.web.data.shared.utils.CollectionUtils;

public class SearchOrdersFilter<T>
{

   private Integer accountId;
   private String stringOrderType;
   private String orderId;
   private OrderType orderType;
   private Multimap<String, Object> parameters = HashMultimap.create();
   private String nextUrl;
   private String selectedCustomer;
   private boolean isAdmin;
   private boolean orderDetails;
   private T response;
   private GWTSearchType searchType;

   public SearchOrdersFilter()
   {
   }

   public SearchOrdersFilter(Integer accountId, String orderType)
   {
      this.accountId = accountId;
      this.stringOrderType = orderType;
   }

   public SearchOrdersFilter(String accountId, String orderType)
   {
      this.accountId = Integer.valueOf(accountId);
      this.stringOrderType = orderType;
   }

   public GWTSearchType getSearchType()
   {
      return searchType;
   }

   public void setSearchType(GWTSearchType searchType)
   {
      this.searchType = searchType;
   }

   public SearchOrdersFilter(String orderType)
   {
      this.stringOrderType = orderType;
   }

   public Integer getAccountId()
   {
      return accountId;
   }

   public void setAccountId(Integer accountId)
   {
      this.accountId = accountId;
   }

   public String getStringOrderType()
   {
      return stringOrderType;
   }

   public void setStringOrderType(String stringOrderType)
   {
      this.stringOrderType = stringOrderType;
   }

   public OrderType getOrderType()
   {
      return orderType;
   }

   public void setOrderType(OrderType orderType)
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

   public Multimap<String, Object> getParameters()
   {
      return parameters;
   }

   public void setParameters(Multimap<String, Object> parameters)
   {
      this.parameters = parameters;
   }

   public String getNextUrl()
   {
      return nextUrl;
   }

   public void setNextUrl(String nextUrl)
   {
      this.nextUrl = nextUrl;
   }

   public String getSelectedCustomer()
   {
      return selectedCustomer;
   }

   public void setSelectedCustomer(String selectedCustomer)
   {
      this.selectedCustomer = selectedCustomer;
   }

   public T getResponse()
   {
      return response;
   }

   public void setResponse(T response)
   {
      this.response = response;
   }

   public String getOrderStatus()
   {
      return getParameter(STATUS);
   }

   public String getCustomerOrderId()
   {
      return getParameter(CUSTOMER_INTERNAL_ID);
   }

   public String getDateFrom()
   {
      return getParameter(START_DATE);
   }

   public String getDateTo()
   {
      return getParameter(END_DATE);
   }

   public String getCreatedDateFrom()
   {
      return getParameter(CREATED_FROM_DATE);
   }

   public String getCreatedDateTo()
   {
      return getParameter(CREATED_TO_DATE);
   }

   public String getBillingTn()
   {
      return getParameter(TN);
   }

   public String getPon()
   {
      return getParameter(PON);
   }

   public String getOrderIdFragment()
   {
      return getParameter(ORDER_ID_FRAGMENT);
   }

   public String getCallingEndpoint()
   {
      return getParameter(CALLING_ENDPOINT);
   }

   public String getAction()
   {
      return getParameter(ACTION);
   }

   public boolean isAdmin()
   {
      return isAdmin;
   }

   public void setAdmin(boolean admin)
   {
      isAdmin = admin;
   }

   public boolean isOrderDetails()
   {
      return orderDetails;
   }

   public void setOrderDetails(boolean orderDetails)
   {
      this.orderDetails = orderDetails;
   }

   private String getParameter(String key)
   {
      if (parameters != null)
      {
         Collection values = parameters.get(key);
         if (CollectionUtils.isNotEmpty(values))
         {
            return Objects.toString(values.iterator()
                  .next(), "");
         }
      }
      return "";
   }

   public SearchOrdersFilter<T> putParameter(String name, String value)
   {
      parameters.put(name, value);
      return this;
   }

   public SearchOrdersFilter<T> removeParameter(String name)
   {
      parameters.removeAll(name);
      return this;
   }

   public SearchOrdersFilter<T> replaceParameter(String name, String value)
   {
      removeParameter(name);
      putParameter(name, value);
      return this;
   }
}
