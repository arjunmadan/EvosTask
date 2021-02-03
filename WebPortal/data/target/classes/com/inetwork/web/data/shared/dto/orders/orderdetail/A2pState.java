package com.inetwork.web.data.shared.dto.orders.orderdetail;

import java.util.stream.Stream;

public enum A2pState
{
   ON("overridden", 1),
   OFF("off", 2),
   SYSTEM_DEFAULT("system_default", 3);

   private final String apiValue;
   private final int uiValue;

   public static A2pState fromUiValue(int uiValue)
   {
      return Stream.of(values())
            .filter(a2pState -> a2pState.getUiValue() == uiValue)
            .findAny()
            .orElseThrow(IllegalArgumentException::new);
   }

   public static A2pState fromApiValue(String apiValue)
   {
      return Stream.of(values())
            .filter(a2pState -> a2pState.getApiValue().equals(apiValue))
            .findAny()
            .orElseThrow(IllegalArgumentException::new);
   }

   A2pState(String apiValue, int uiValue)
   {
      this.apiValue = apiValue;
      this.uiValue = uiValue;
   }

   public int getUiValue()
   {
      return uiValue;
   }

   public String getApiValue()
   {
      return apiValue;
   }
}
