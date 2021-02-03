package com.inetwork.web.data.shared.utils;

public abstract class IntegerUtils
{
   public static Integer valueOf(String s)
   {
      return valueOf(s, 0);
   }

   public static Integer valueOf(String s, Integer defaultValue)
   {
      if (s != null && s.matches("^\\-?\\d+$"))
      {
         return Integer.valueOf(s);
      }
      else
      {
         return defaultValue;
      }
   }

   public static boolean isEmpty(Integer i)
   {
      return i == null;
   }

   public static boolean isNotEmpty(Integer i)
   {
      return !isEmpty(i);
   }

   public static Integer checkEmpty(Integer i)
   {
      if (i == null)
      {
         return -1;
      }
      return i;
   }

   public static String convertCount(int count)
   {
      return count == 1 ? "one" : String.valueOf(count);
   }

   public static boolean isPlural(int count)
   {
      return count != 1;
   }
}
