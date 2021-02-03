package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum Ton implements HumanReadableValue
{
   DEFAULT("Auto"),
   UNKNOWN("Unknow"),
   INTERNATIONAL("International"),
   NATIONAL("National"),
   NETWORKSPECIFIC("Network specific"),
   SUBSCRIBER("Subscriber"),
   ALPHANUMERIC("Alpha numeric"),
   ABBREVIATED("Abbreviated"),
   EXTENSION("Extension");

   private final String humanReadable;

   Ton(String humanReadable)
   {
      this.humanReadable = humanReadable;
   }

   @Override
   public String getHumanReadableValue()
   {
      return humanReadable;
   }

   public static Ton fromHumanReadable(String humanReadable)
   {
      for (Ton type : Ton.values())
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
