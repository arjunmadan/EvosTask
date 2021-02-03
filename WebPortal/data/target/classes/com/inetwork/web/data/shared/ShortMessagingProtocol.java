package com.inetwork.web.data.shared;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum ShortMessagingProtocol implements HumanReadableValue
{
   SMPP(1, "SMPP"), SIP(2, "SIP"), HTTP(3, "HTTP");

   private final int id;
   private final String urlValue;

   ShortMessagingProtocol(int id, String value)
   {
      this.id = id;
      urlValue = value;
   }

   public static ShortMessagingProtocol toEnumById(int currentId)
   {
      for (ShortMessagingProtocol messagingProtocol : ShortMessagingProtocol.values())
      {
         if (currentId == messagingProtocol.getId())
         {
            return messagingProtocol;
         }
      }
      return null;
   }

   public static ShortMessagingProtocol fromHumanReadableValue(String value)
   {
      for (ShortMessagingProtocol protocol : ShortMessagingProtocol.values())
      {
         if (protocol.getHumanReadableValue().equals(value))
         {
            return protocol;
         }
      }
      return null;
   }

   public int getId()
   {
      return id;
   }

   public String getHumanReadableValue()
   {
      return urlValue;
   }

   public String getUrlValue()
   {
      return urlValue;
   }
}
