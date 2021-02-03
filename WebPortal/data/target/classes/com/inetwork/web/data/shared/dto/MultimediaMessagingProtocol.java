package com.inetwork.web.data.shared.dto;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum MultimediaMessagingProtocol implements HumanReadableValue
{
   MM4("mm4"),
   HTTP("HTTP");

   private final String value;

   MultimediaMessagingProtocol(String value)
   {
      this.value = value;
   }

   public String getHumanReadableValue()
   {
      return value;
   }

   public static MultimediaMessagingProtocol fromHumanReadableValue(String value)
   {
      for (MultimediaMessagingProtocol enumElement : MultimediaMessagingProtocol.values())
      {
         if (enumElement.getHumanReadableValue().equalsIgnoreCase(value))
         {
            return enumElement;
         }
      }
      return null;
   }
}
