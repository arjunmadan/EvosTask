package com.inetwork.web.data.shared.searchorders;

@Deprecated
public enum GWTSearchType
{
   ORDER,
   ORDERS,
   ORDERS_RANGE,
   ORDERS_STATUS,
   ORDERS_STATUS_RANGE,
   PORTOUT,
   PORTIN,
   PORTINS,
   PORTINS_RANGE,
   PORTINS_STATUS_RANGE,
   PORTINS_STATUS,
   PORTINS_BTN,
   AREA_CODES,

   // ActiveNumbers Page
   ACTIVE_NUMBERS,
   PEER_GROUP_TNS,
   PEER_GROUP_TN,
   ACTIVE_NUMBER_DETAILS,
   ACTIVE_NUMBER_SITE,
   ACTIVE_NUMBER_SIPPEER,
   CLEAR_RESULTS,

   // ActiveNumbers Page
   ACTIVE_NUMBER,

   // It can be like a portins or oredrs
   DEFAULT;
}
