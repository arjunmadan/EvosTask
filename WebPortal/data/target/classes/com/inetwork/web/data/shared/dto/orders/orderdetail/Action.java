package com.inetwork.web.data.shared.dto.orders.orderdetail;

public enum Action
{
   UNCHANGED("unchanged"),
   SYSTEM_DEFAULT("systemDefault"),
   OFF("off"),
   AS_SPECIFIED("asSpecified");

   private final String apiValue;

   Action(String apiValue)
   {
      this.apiValue = apiValue;
   }

   public String getApiValue()
   {
      return apiValue;
   }
}
