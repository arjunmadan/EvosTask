package com.inetwork.web.data.shared;

public enum PortInAutoActivationType
{
   NONE("none"), ENABLED("true"), DISABLED("false");
   private final String value;

   PortInAutoActivationType(String s)
   {
      value = s;
   }

   public String getValue()
   {
      return value;
   }

   public static PortInAutoActivationType fromString(String s)
   {
      PortInAutoActivationType result = null;
      if (NONE.value.equalsIgnoreCase(s))
      {
         result = NONE;
      }
      else if (DISABLED.value.equalsIgnoreCase(s))
      {
         result = DISABLED;
      }
      else if (ENABLED.value.equalsIgnoreCase(s))
      {
         result = ENABLED;
      }
      return result;
   }

}
