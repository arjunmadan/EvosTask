package com.inetwork.web.data.shared.utils;

public abstract class LongUtils
{
   public static Long valueOf(String s)
   {
      return valueOf(s, 0L);
   }

   public static Long valueOf(String s, Long defaultValue)
   {
      if (s != null && s.matches("^\\-?\\d+$"))
      {
         return Long.valueOf(s);
      }
      else
      {
         return defaultValue;
      }
   }

}
