package com.inetwork.web.data.shared.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Lists;

public abstract class StringUtils
{
   public static final String EMPTY_STRING = "";
   public static final String DOT = ".";
   public static final String COMMA = ",";
   public static final String SPACE = " ";
   public static final String SLASH = "/";
   public static final String DASH = "-";
   public static final int INDEX_NOT_FOUND = -1;
   public static final String COLON = ":";
   public static final String SINGLE_QUOTE = "'";
   public static final String CIRCLE = "\u2022";

   public static boolean isEmpty(String str)
   {
      return str == null || str.length() == 0;
   }

   public static boolean isNotEmpty(String str)
   {
      return !isEmpty(str);
   }

   public static String checkEmpty(String str)
   {
      if (isEmpty(str) || str.equalsIgnoreCase("null"))
      {
         return EMPTY_STRING;
      }
      return str;
   }

   public static String[] checkEmpty(String... args)
   {
      for (int i = 0; i < args.length; i++)
      {
         args[i] = checkEmpty(args[i]);
      }
      return args;
   }

   public static String normalizeDate(String date)
   {
      return isEmpty(date) ? "-" : date;
   }

   public static boolean isAlphanumeric(String str)
   {
      if (str == null)
      {
         return false;
      }
      int sz = str.length();
      for (int i = 0; i < sz; i++)
      {
         if (!Character.isLetterOrDigit(str.charAt(i)))
         {
            return false;
         }
      }
      return true;
   }

   public static boolean isNumeric(String str)
   {
      if (str == null)
      {
         return false;
      }
      int sz = str.length();
      for (int i = 0; i < sz; i++)
      {
         if (!Character.isDigit(str.charAt(i)))
         {
            return false;
         }
      }
      return true;
   }

   public static boolean isNotBlank(String value)
   {
      return !isBlank(value);
   }

   public static List<String> splitAndTrim(String value, String regex)
   {
      if (isEmpty(value))
      {
         return Collections.emptyList();
      }
      List<String> result = Lists.newArrayList();
      for (String part : value.split(regex))
      {
         result.add(part.trim());
      }
      return result;
   }

   public static boolean isBlank(String value)
   {
      return isEmpty(value) || value.trim()
            .isEmpty();
   }

   public static int compare(String arg1, String arg2)
   {
      return checkEmpty(arg1).compareToIgnoreCase(checkEmpty(arg2));
   }

   public static boolean appendIfNotBlank(StringBuilder appendTo, String appendValue)
   {
      if (appendTo == null || appendValue == null)
      {
         return false;
      }
      appendValue = checkEmpty(appendValue).trim();
      if (appendValue.length() == 0)
      {
         return false;
      }
      if (appendTo.length() > 0)
      {
         appendTo.append(" ");
      }
      appendTo.append(appendValue);
      return true;
   }

   public static String capitalize(String s)
   {
      if (isEmpty(s))
      {
         return s;
      }
      char[] value = s.toCharArray();
      value[0] = Character.toUpperCase(value[0]);
      return new String(value);
   }

   public static String leftPadString(String str, Character ch, int lengthTotal)
   {
      if (str != null)
      {
         int diff = lengthTotal - str.length();
         if (diff <= 0)
         {
            return str;
         }
         else
         {
            char paddingChars[] = new char[diff];
            Arrays.fill(paddingChars, ch);
            return new String(paddingChars) + str;
         }
      }
      return null;
   }

   public static String join(Collection<String> strings, String delimiter)
   {
      StringBuilder builder = new StringBuilder();
      Iterator<String> iterator = strings.iterator();
      while (iterator.hasNext())
      {
         builder.append(iterator.next());
         if (!iterator.hasNext())
         {
            break;
         }
         builder.append(delimiter);
      }
      return builder.toString();
   }

   public static String substringBefore(final String str, final String separator)
   {
      if (isEmpty(str) || separator == null)
      {
         return str;
      }
      if (separator.isEmpty())
      {
         return EMPTY_STRING;
      }
      final int pos = str.indexOf(separator);
      if (pos == INDEX_NOT_FOUND)
      {
         return str;
      }
      return str.substring(0, pos);
   }

   public static String substringAfter(final String str, final String separator)
   {
      if (isEmpty(str))
      {
         return str;
      }
      if (separator == null)
      {
         return EMPTY_STRING;
      }
      final int pos = str.indexOf(separator);
      if (pos == INDEX_NOT_FOUND)
      {
         return EMPTY_STRING;
      }
      return str.substring(pos + separator.length());
   }

   public static String rightPad(String value, int minLength)
   {
      if (value == null)
      {
         return null;
      }
      value = value.trim();
      if (value.length() >= minLength)
      {
         return value;
      }
      StringBuffer paddedValue = new StringBuffer(value);
      while (paddedValue.length() < minLength)
      {
         paddedValue.append(' ');
      }
      return paddedValue.toString();
   }

   public static String formatWithSemicolonInTheEnd(String s)
   {
      if (StringUtils.isNotBlank(s))
      {
         char lastChar = s.trim()
               .charAt(s.length() - 1);
         if (lastChar == '.')
         {
            s = s.substring(0, s.length() - 1) + ':';
         }
         else if (lastChar != ':')
         {
            s = s + ':';
         }
      }
      return s;
   }

   public static String appendColon(String srt)
   {
      return srt + COLON;
   }

   public static String toStringOrEmpty(Object obj)
   {
      return toStringOrDefault(obj, EMPTY_STRING);
   }

   public static String toStringOrDefault(Object obj, String defaultValue)
   {
      return obj != null ? obj.toString() : defaultValue;
   }

   public static StringBuilder builder()
   {
      return new StringBuilder();
   }

   public static StringBuilder builder(String str)
   {
      return new StringBuilder(str);
   }
}
