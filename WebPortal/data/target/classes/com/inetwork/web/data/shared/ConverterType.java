package com.inetwork.web.data.shared;

import static com.inetwork.web.data.shared.ServiceConstants.CONVERTER_TYPE;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.rpc.IsSerializable;

public enum ConverterType implements IsSerializable
{

   /**
    * These headers are typically sent from GWT portal.
    */
   MANAGE_ORDERS,
   NUMBERS_DETAILS,
   DISCONNECTED_NUMBERS,
   LIDB_ASSOCIATED_NUMBERS,
   DLDA_ASSOCIATED_NUMBERS,
   ORDER_ASSOCIATED_NUMBERS,
   PORT_IN_ASSOCIATED_NUMBERS,
   LSR_ASSOCIATED_NUMBERS,
   PORT_OUT_ASSOCIATED_NUMBERS,
   E911_ASSOCIATED_NUMBERS,
   E911_ASSOCIATED_CALLER_IDS,
   TN_OPTION_ASSOCIATED_NUMBERS,
   SEARCH_NEW_NUMBER_ORDER,
   SEARCH_PORTIN_ORDER,
   SEARCH_PORTOUT_ORDER,
   SEARCH_TELEPHONE_NUMBER,
   SEARCH_ACCOUNTS,
   SEARCH_LSR_ORDER,
   SEARCH_E911_ORDER,
   SEARCH_LIDB_ORDER,
   SEARCH_DLDA_ORDER,
   SEARCH_EXTERNAL_TNS_ORDER,
   SEARCH_TN_OPTION_ORDER,
   IMPORT_LINE_FEATURES,
   EXTERNAL_ORDER_ASSOCIATED_NUMBERS,
   IMPORT_NUMBER_ORDER_ASSOCIATED_NUMBERS,
   REMOVE_IMPORTED_NUMBER_ORDER_ASSOCIATED_NUMBERS,
   NUMBER_ASSIGNMENT_ORDER_ASSOCIATED_NUMBERS,
   SEARCH_IMPORT_TNS_ORDER,
   SEARCH_REMOVE_TNS_ORDER,

   /**
    * These headers are typically sent in POST request with JSON content that is converted to CSV/XLS by server side and
    * received back.
    */
   ORDER_ASSOCIATED_NUMBERS_JSON,

   /**
    * These headers are typically sent from new Angular portal in GET request. All work to retrieve requested data is
    * performed on server side.
    */
   NEW_PORTAL_ORDER_ASSOCIATED_NUMBERS;

   public Map<String, String> asHeader()
   {
      Map<String, String> map = new HashMap<>(1);
      map.put(CONVERTER_TYPE, name());
      return map;
   }
}
