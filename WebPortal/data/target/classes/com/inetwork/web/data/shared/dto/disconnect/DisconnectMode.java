package com.inetwork.web.data.shared.dto.disconnect;

import com.inetwork.web.data.shared.utils.HumanReadableValue;
import com.inetwork.web.data.shared.utils.SearchValue;

public enum DisconnectMode implements HumanReadableValue, SearchValue
{
   NORMAL("normal", "Normal"),
   SOFT_REMOVE("soft-remove", "Remove from the Bandwidth Dashboard"),
   PURGE("purge", "Remove from Bandwidth & all systems (CAUTION: Rarely used)");

   private final String apiValue;
   private final String hrValue;

   private DisconnectMode(String apiValue, String hrValue)
   {
      this.apiValue = apiValue;
      this.hrValue = hrValue;
   }

   @Override
   public String getHumanReadableValue()
   {
      return hrValue;
   }

   @Override
   public String getSearchValue()
   {
      return apiValue;
   }

   @Override
   public String toString()
   {
      return getHumanReadableValue();
   }

   public static DisconnectMode fromValue(String value)
   {
      for (DisconnectMode mode : DisconnectMode.values())
      {
         if (mode.getSearchValue()
               .equalsIgnoreCase(value))
         {
            return mode;
         }
      }
      return null;
   }
}
