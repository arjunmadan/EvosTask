package com.inetwork.web.data.shared.dto.tnassignment;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.TelephoneNumberGroupError;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import java.util.List;

import static com.inetwork.web.data.shared.utils.IntegerUtils.checkEmpty;
import static com.inetwork.web.data.shared.utils.StringUtils.isNotEmpty;

public class NumbersAssignmentOrderResponse
{

   public interface Reader extends XmlReader<NumbersAssignmentOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<NumbersAssignmentOrderResponse>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

   @Path("OrderCreateDate")
   private String orderCreateDate;
   @Path("AccountId")
   private Integer accountId;
   @Path("CreatedByUser")
   private String user;
   @Path("OrderId")
   private String orderId;
   @Path("ProcessingStatus")
   private String status;
   @Path("TotalQuantity")
   private Integer totalQuantity;
   @Path("FailedQuantity")
   private Integer failedQuantity;
   @Path("TelephoneNumbersAssignmentOrder")
   private NumbersAssignmentOrder order;
   @Path("Errors/Error")
   List<TelephoneNumberGroupError> errors;

   public String getQuantityOrdered()
   {
      String orderedStr = convertToString(checkEmpty(totalQuantity), "Ordered");
      String failedStr = convertToString(checkEmpty(failedQuantity), "Failed");
      StringBuilder stringBuilder = new StringBuilder(orderedStr);
      if (isNotEmpty(failedStr))
      {
         stringBuilder.append(" - ")
               .append(failedStr);
      }
      return stringBuilder.toString();
   }

   private String convertToString(int quantity, String tnType)
   {
      return quantity > 0 ? quantity + " " + tnType : "";
   }

   public String getOrderCreateDate()
   {
      return orderCreateDate;
   }

   public void setOrderCreateDate(String orderCreateDate)
   {
      this.orderCreateDate = orderCreateDate;
   }

   public Integer getAccountId()
   {
      return accountId;
   }

   public void setAccountId(Integer accountId)
   {
      this.accountId = accountId;
   }

   public String getUser()
   {
      return user;
   }

   public void setUser(String user)
   {
      this.user = user;
   }

   public String getOrderId()
   {
      return orderId;
   }

   public void setOrderId(String orderId)
   {
      this.orderId = orderId;
   }

   public String getStatus()
   {
      return status;
   }

   public void setStatus(String status)
   {
      this.status = status;
   }

   public Integer getTotalQuantity()
   {
      return totalQuantity;
   }

   public void setTotalQuantity(Integer totalQuantity)
   {
      this.totalQuantity = totalQuantity;
   }

   public Integer getFailedQuantity()
   {
      return failedQuantity;
   }

   public void setFailedQuantity(Integer failedQuantity)
   {
      this.failedQuantity = failedQuantity;
   }

   public NumbersAssignmentOrder getOrder()
   {
      return order;
   }

   public void setOrder(NumbersAssignmentOrder order)
   {
      this.order = order;
   }

   public List<TelephoneNumberGroupError> getErrors()
   {
      return errors;
   }

   public void setErrors(List<TelephoneNumberGroupError> errors)
   {
      this.errors = errors;
   }
}
