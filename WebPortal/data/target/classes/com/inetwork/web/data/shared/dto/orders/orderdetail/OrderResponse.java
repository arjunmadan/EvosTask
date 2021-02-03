package com.inetwork.web.data.shared.dto.orders.orderdetail;

import static com.inetwork.web.data.shared.utils.IntegerUtils.checkEmpty;
import static com.inetwork.web.data.shared.utils.StringUtils.isNotEmpty;

import java.util.ArrayList;
import java.util.List;

import com.inetwork.web.data.shared.dto.orders.Order;
import com.inetwork.web.data.shared.dto.orders.TotalCounts;
import com.inetwork.web.data.shared.searchorders.OrderStatus;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.BaseOrderType;
import com.inetwork.web.data.shared.dto.HasTnErrors;
import com.inetwork.web.data.shared.dto.TelephoneNumberError;
import com.inetwork.web.data.shared.utils.StringUtils;

public class OrderResponse implements TotalCounts, HasTnErrors
{

   @Override
   public int getTotalCount()
   {
      return 1;
   }

   public interface OrderResponseReader extends XmlReader<OrderResponse>
   {
   }

   public interface OrderResponseWriter extends XmlWriter<OrderResponse>
   {
   }

   public static final OrderResponseReader READER = GWT.create(OrderResponseReader.class);

   public static final OrderResponseWriter WRITER = GWT.create(OrderResponseWriter.class);

   private String orderId;

   @Path("Order")
   private Order orderRequest;
   @Path("CompletedNumbers/TelephoneNumber")
   private List<TelephoneNumber> completedNumbers;
   @Path("CreatedByUser")
   private String createdByUser;
   @Path("OrderCompleteDate")
   private String orderCompleteDate;
   @Path("CompletedQuantity")
   private Integer completedQuantity;
   @Path("OrderStatus")
   private OrderStatus orderStatus;
   @Path("FailedQuantity")
   private Integer failedQuantity;
   @Path("PendingQuantity")
   private Integer pendingQuantity;
   @Path("FailedNumbers/FullNumber")
   private List<String> failedNumbers;
   @Path("ErrorList/Error")
   private List<TelephoneNumberError> errors;

   @Path("LastModifiedDate")
   private String lastModifiedDate;
   private String peerGroup;

   public String getQuantityOrdered()
   {
      BaseOrderType baseOrderType = orderRequest.getBaseOrderType();
      String ordered = "";
      if (baseOrderType != null)
      {
         ordered = convertToString(baseOrderType.getQuantity(), "Ordered");
      }
      final int cq = checkEmpty(completedQuantity);
      final int pq = checkEmpty(pendingQuantity);
      final int fq = checkEmpty(failedQuantity);
      if (StringUtils.isEmpty(ordered))
      {
         int quantity = 0;
         quantity += cq > 0 ? cq : 0;
         quantity += pq > 0 ? pq : 0;
         quantity += fq > 0 ? fq : 0;
         ordered = convertToString(quantity, "Ordered");
      }
      if (StringUtils.isEmpty(ordered))
      {
         return "";
      }
      StringBuilder sb = new StringBuilder(ordered);
      String separator = " - ";
      List<String> strings = new ArrayList<String>(3)
      {
         {
            add(convertToString(cq, "Completed"));
            add(convertToString(pq, "Pending"));
            add(convertToString(fq, "Failed"));
         }
      };
      for (String str : strings)
      {
         if (isNotEmpty(str))
         {
            sb.append(separator)
                  .append(str);
            separator = ", ";
         }
      }
      return sb.toString();
   }

   private String convertToString(int quantity, String tnType)
   {
      return quantity > 0 ? quantity + " " + tnType : "";
   }

   @Override
   public List<TelephoneNumberError> getErrors()
   {
      return errors;
   }

   public void setErrors(List<TelephoneNumberError> errors)
   {
      this.errors = errors;
   }

   public Order getOrderRequest()
   {
      return orderRequest;
   }

   public void setOrderRequest(Order orderRequest)
   {
      this.orderRequest = orderRequest;
   }

   public List<TelephoneNumber> getCompletedNumbers()
   {
      return completedNumbers;
   }

   public void setCompletedNumbers(List<TelephoneNumber> completedNumbers)
   {
      this.completedNumbers = completedNumbers;
   }

   public String getCreatedByUser()
   {
      return createdByUser;
   }

   public void setCreatedByUser(String createdByUser)
   {
      this.createdByUser = createdByUser;
   }

   public String getOrderCompleteDate()
   {
      return orderCompleteDate;
   }

   public void setOrderCompleteDate(String orderCompleteDate)
   {
      this.orderCompleteDate = orderCompleteDate;
   }

   public Integer getCompletedQuantity()
   {
      return completedQuantity;
   }

   public void setCompletedQuantity(Integer completedQuantity)
   {
      this.completedQuantity = completedQuantity;
   }

   public OrderStatus getOrderStatus()
   {
      return orderStatus;
   }

   public void setOrderStatus(OrderStatus orderStatus)
   {
      this.orderStatus = orderStatus;
   }

   public String getOrderId()
   {
      return orderId;
   }

   public void setOrderId(String orderId)
   {
      this.orderId = orderId;
   }

   public Integer getFailedQuantity()
   {
      return failedQuantity;
   }

   public void setFailedQuantity(Integer failedQuantity)
   {
      this.failedQuantity = failedQuantity;
   }

   public List<String> getFailedNumbers()
   {
      return failedNumbers;
   }

   public void setFailedNumbers(List<String> failedNumbers)
   {
      this.failedNumbers = failedNumbers;
   }

   public String getPeerGroup()
   {
      return peerGroup;
   }

   public void setPeerGroup(String peerGroup)
   {
      this.peerGroup = peerGroup;
   }

   public Integer getPendingQuantity()
   {
      return pendingQuantity;
   }

   public void setPendingQuantity(Integer pendingQuantity)
   {
      this.pendingQuantity = pendingQuantity;
   }

   public String getLastModifiedDate()
   {
      return lastModifiedDate;
   }

   public void setLastModifiedDate(String lastModifiedDate)
   {
      this.lastModifiedDate = lastModifiedDate;
   }
}
