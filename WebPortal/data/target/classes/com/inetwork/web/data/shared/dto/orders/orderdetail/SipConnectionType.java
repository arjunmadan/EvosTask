package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum SipConnectionType implements HumanReadableValue
{
   TRANSCEIVER("transceiver"), SENDER_ONLY("sender only"), RECEIVER_ONLY("receiver only");

   private final String databaseValue;

   SipConnectionType(String databaseValue)
   {
      this.databaseValue = databaseValue;
   }

   public String getDatabaseValue()
   {
      return databaseValue;
   }

   public static SipConnectionType fromDatabaseValue(String databaseValue)
   {
      for (SipConnectionType type : SipConnectionType.values())
      {
         if (type.getDatabaseValue().equals(databaseValue))
         {
            return type;
         }
      }
      return null;
   }

   @Override
   public String getHumanReadableValue()
   {
      return databaseValue;
   }
}
