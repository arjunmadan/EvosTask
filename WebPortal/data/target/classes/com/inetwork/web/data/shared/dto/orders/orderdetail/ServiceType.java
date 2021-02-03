package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum ServiceType implements HumanReadableValue
{
   MESSAGING_V2("Messaging-V2");

   private final String humanReadable;

   ServiceType(String humanReadable)
   {
      this.humanReadable = humanReadable;
   }

   public String getHumanReadable()
   {
      return humanReadable;
   }

   public static ServiceType fromHumanReadable(String humanReadable)
   {
      for (ServiceType type : ServiceType.values())
      {
         if (type.getHumanReadable().equals(humanReadable))
         {
            return type;
         }
      }
      return null;
   }

   @Override
   public String getHumanReadableValue()
   {
      return humanReadable;
   }
}
