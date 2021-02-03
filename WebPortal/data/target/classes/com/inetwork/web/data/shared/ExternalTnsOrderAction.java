package com.inetwork.web.data.shared;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum ExternalTnsOrderAction implements HumanReadableValue
{
   IMPORT("IMPORT"), REMOVE("REMOVE");

   private final String humanReadableValue;

   ExternalTnsOrderAction(String humanReadableValue)
   {
      this.humanReadableValue = humanReadableValue;
   }

   @Override
   public String getHumanReadableValue()
   {
      return humanReadableValue;
   }

   public static ExternalTnsOrderAction toEnum(String stringValue)
   {
      for (ExternalTnsOrderAction value : values())
      {
         if (value.toString()
               .equalsIgnoreCase(stringValue))
         {
            return value;
         }
      }
      return null;
   }
}
