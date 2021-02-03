package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum Npi implements HumanReadableValue
{
   DEFAULT("Auto"),
   UNKNOWN("Unknow"),
   E164("E164"),
   X121("X121"),
   TELEX("Telex"),
   NATIONAL("National"),
   PRIVATE("Private"),
   ERMES("Ermes"),
   EXTENSION("Extension");

   private final String humanReadable;

   Npi(String humanReadable)
   {
      this.humanReadable = humanReadable;
   }

   @Override
   public String getHumanReadableValue()
   {
      return humanReadable;
   }

   public static Npi fromHumanReadable(String humanReadable)
   {
      for (Npi type : Npi.values())
      {
         if (type.getHumanReadableValue()
               .equals(humanReadable))
         {
            return type;
         }
      }

      return null;
   }
}