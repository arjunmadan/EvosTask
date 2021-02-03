package com.inetwork.web.data.shared;

import static com.inetwork.web.data.shared.searchorders.OrderStatus.ADJUSTED_COMPLETE;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.ADJUSTED_PARTIAL;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.BACKORDERED;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.CANCELLED;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.COMPLETE;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.COMPLETED;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.DRAFT;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.EXCEPTION;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.FAILED;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.FOC;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.IN_PROGRESS;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.MODIFY;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.NEEDS_ATTENTION;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.NEW;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.PARTIAL;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.PENDING;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.PENDING_DOCUMENTS;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.PROCESSING;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.RECEIVED;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.REQUESTED_CANCEL;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.REQUESTED_SUPP;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.SNAPBACK;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.SOA_CONFLICT;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.SOA_PENDING;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.SUBMITTED;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.SUPP;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.VALIDATION_FAILED_MODIFY;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.VALIDATION_FAILED_NEW;
import static com.inetwork.web.data.shared.searchorders.OrderStatus.VALIDATION_FAILED_SUPP;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.inetwork.web.data.shared.searchorders.OrderStatus;
import com.inetwork.web.data.shared.utils.HumanReadableValue;
import com.inetwork.web.data.shared.utils.SearchValue;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace="gwt.orders")
public enum OrderType implements HumanReadableValue, SearchValue, IsSerializable
{
   PORT_IN("Port in", ServiceConstants.PORTINS, ServiceConstants.PORT_NUMBER_ORDER, PENDING_DOCUMENTS, SUBMITTED, REQUESTED_SUPP, FOC, COMPLETE, EXCEPTION, SNAPBACK, REQUESTED_CANCEL, CANCELLED),

   BULK_PORT_IN("Bulk port in", ServiceConstants.BULK_PORTINS, ServiceConstants.BULK_PORTINS_ORDER, DRAFT, IN_PROGRESS, COMPLETED, PARTIAL, NEEDS_ATTENTION, CANCELLED),

   LSR("LSR", ServiceConstants.LSRS, ServiceConstants.LSR_ORDER, PENDING, FOC, COMPLETE, EXCEPTION, FAILED, CANCELLED, PARTIAL),

   PORT_OUT("Port out", ServiceConstants.PORTOUTS, ServiceConstants.PORT_OUT_NUMBER_ORDER, NEW, SUPP, MODIFY, COMPLETE, CANCELLED, VALIDATION_FAILED_NEW, VALIDATION_FAILED_SUPP, VALIDATION_FAILED_MODIFY, EXCEPTION, SOA_PENDING, SOA_CONFLICT),

   NEW_NUMBER("New number", ServiceConstants.ORDERS, ServiceConstants.NEW_NUMBER_ORDER, COMPLETE, PARTIAL, FAILED, BACKORDERED),

   LIDB(ServiceConstants.LIDB, ServiceConstants.LIDBS, ServiceConstants.LIDB_ORDER, RECEIVED, PROCESSING, COMPLETE, PARTIAL, FAILED),

   DLDA(ServiceConstants.DL_DA, ServiceConstants.DLDAS, ServiceConstants.DLDA_ORDER, RECEIVED, PROCESSING, COMPLETE, PARTIAL, FAILED, CANCELLED),

   DISCONNECT("Disconnect", ServiceConstants.DISCONNECTS, ServiceConstants.DISCONNECT_NUMBER_ORDER, COMPLETE, PARTIAL, FAILED),

   E911(ServiceConstants.E911, ServiceConstants.E911S, ServiceConstants.E911_ORDER, RECEIVED, PROCESSING, COMPLETE, PARTIAL, FAILED, ADJUSTED_COMPLETE, ADJUSTED_PARTIAL),

   TN_OPTION(ServiceConstants.TN_OPTION, ServiceConstants.TN_OPTIONS, ServiceConstants.TN_OPTION_ORDER, RECEIVED, PROCESSING, COMPLETE, PARTIAL, FAILED),

   EXTERNAL_TNS("External TNs", ServiceConstants.EXTERNAL_TNS, ServiceConstants.EXTERNAL_TNS_ORDER, RECEIVED, PROCESSING, COMPLETE, PARTIAL, FAILED),

   NUMBERS_ASSIGNMENT("Telephone Number Assignment", ServiceConstants.NUMBERS_ASSIGNMENT, ServiceConstants.NUMBERS_ASSIGNMENT_ORDER, COMPLETE, PARTIAL, FAILED),

   IMPORT_NUMBERS("Import Number", ServiceConstants.IMPORT_TN, ServiceConstants.IMPORT_NUMBER_ORDER, RECEIVED, PROCESSING, COMPLETE, PARTIAL, FAILED),

    REMOVE_IMPORTED_NUMBERS("Remove Imported Number", ServiceConstants.REMOVE_IMPORTED_TN, ServiceConstants.REMOVE_NUMBER_ORDER, RECEIVED, PROCESSING, COMPLETE, PARTIAL, FAILED);
   private final String value;
   private final String searchValue;
   private final String orderResponseValue;
   private final OrderStatus[] statuses;

   OrderType(final String value, String searchValue, String orderResponseValue, OrderStatus... statuses)
   {
      this.value = value;
      this.searchValue = searchValue;
      this.orderResponseValue = orderResponseValue;
      this.statuses = statuses;
   }

   @Override
   public String getHumanReadableValue()
   {
      return value;
   }

   @JsProperty
   public String getValue()
   {
      return value;

   }

   public String getOrderResponseValue()
   {
      return orderResponseValue;
   }

   @JsProperty
   public OrderStatus[] getStatuses()
   {
      return statuses;
   }

   public List<String> getStatusStrings()
   {
      List<String> res = new ArrayList<>(statuses.length);
      for (OrderStatus status : statuses)
      {
         res.add(status.getStatus());
      }
      return res;
   }

   public static OrderType parseToEnum(String value)
   {
      for (OrderType orderType : values())
      {
         if (orderType.value.equalsIgnoreCase(value))
         {
            return orderType;
         }
      }
      return null;
   }

   public static OrderType getTypeByResponseValue(String orderResponseValue)
   {
      for (OrderType orderType : values())
      {
         if (orderType.orderResponseValue.equalsIgnoreCase(orderResponseValue))
         {
            return orderType;
         }
      }
      return null;
   }

   @Override
   public String getSearchValue()
   {
      return searchValue;
   }

   @JsIgnore
   public static List<OrderType> getTypesForGlobalSearch()
   {
      return Lists.newArrayList(OrderType.PORT_IN, OrderType.BULK_PORT_IN, OrderType.PORT_OUT, OrderType.NEW_NUMBER, OrderType.LSR, OrderType.TN_OPTION,
            OrderType.IMPORT_NUMBERS, OrderType.REMOVE_IMPORTED_NUMBERS);
   }

}
