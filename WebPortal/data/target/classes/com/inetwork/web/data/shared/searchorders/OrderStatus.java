package com.inetwork.web.data.shared.searchorders;

import java.util.ArrayList;
import java.util.List;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.inetwork.web.data.shared.utils.HumanReadableValue;
import com.inetwork.web.data.shared.utils.SearchValue;

@JsType(namespace = "gwt.orders")
public enum OrderStatus implements HumanReadableValue, SearchValue, IsSerializable
{

   PARTIAL("Partial", true),
   FAILED("Failed", true),
   COMPLETE("Complete", true),
   COMPLETED("Completed", true),
   EXCEPTION("Exception"),
   SUBMITTED("Submitted"),
   IN_PROGRESS("In progress"),
   FOC("Foc"),
   PENDING_DOCUMENTS("Pending documents"),
   REQUESTED_SUPP("Requested supp"),
   NEEDS_ATTENTION("Needs attention"),
   SNAPBACK("Snapback"),
   REQUESTED_CANCEL("Requested cancel"),
   DRAFT("Draft"),
   NEW("New"),
   SUPP("Supp"),
   MODIFY("Modify"),
   VALIDATION_FAILED_NEW("Validation failed new"),
   VALIDATION_FAILED_SUPP("Validation failed supp"),
   VALIDATION_FAILED_MODIFY("Validation failed modify"),
   SOA_PENDING("Soa pending"),
   SOA_CONFLICT("Soa conflict"),
   CANCELLED("Cancelled", true),
   BACKORDERED("Back ordered"),
   RECEIVED("Received"),
   OPEN("Open"),
   PROCESSING("Processing"),
   PENDING("Pending"),
   ADJUSTED_COMPLETE("Adjusted complete", true),
   ADJUSTED_PARTIAL("Adjusted partial", true);

   private String status;
   private boolean finalState;

   OrderStatus(final String status)
   {
      this(status, false);
   }

   OrderStatus(String status, boolean finalState)
   {
      this.status = status;
      this.finalState = finalState;
   }

   @JsProperty
   public String getStatus()
   {
      return status;
   }

   @JsProperty
   public boolean isFinalState()
   {
      return finalState;
   }

   @JsProperty
   public String getHumanReadableValue()
   {
      return status;
   }

   @JsIgnore
   public static List<OrderStatus> parseToEnum(String[] values)
   {
      List<OrderStatus> orderStatuses = new ArrayList<OrderStatus>();
      for (String value : values)
      {
         orderStatuses.add(parseToEnum(value));
      }
      return orderStatuses;
   }

   public static OrderStatus parseToEnum(String value)
   {
      for (OrderStatus orderStatus : values())
      {
         if (orderStatus.status.equalsIgnoreCase(value))
         {
            return orderStatus;
         }
      }
      return null;
   }

   public static OrderStatus parseToEnumFromEnumName(String value)
   {
      for (OrderStatus orderStatus : values())
      {
         if (orderStatus.name()
               .equalsIgnoreCase(value))
         {
            return orderStatus;
         }
      }
      return null;
   }

   public static String getHumanReadableValueFromEnumName(String value)
   {
      OrderStatus status = parseToEnumFromEnumName(value);
      return status != null ? status.getHumanReadableValue() : "";
   }

   @Override
   public String getSearchValue()
   {
      return name();
   }
}
