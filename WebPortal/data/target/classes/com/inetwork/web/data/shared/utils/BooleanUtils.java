package com.inetwork.web.data.shared.utils;

import static com.inetwork.web.data.shared.ServiceConstants.NO;
import static com.inetwork.web.data.shared.ServiceConstants.YES;

import java.util.Objects;

public abstract class BooleanUtils
{

   public static String getSuffix(boolean isPlural)
   {
      return isPlural ? "s" : "";
   }

   public static String toYesNoString(Boolean b)
   {
      if (b == null)
      {
         return "";
      }
      return b ? YES : NO;
   }

   // String to Boolean methods
   // -----------------------------------------------------------------------
   /**
    * <p>
    * Converts a String to a Boolean.
    * </p>
    * <p>
    * {@code 'true'}, {@code 'on'}, {@code 'y'}, {@code 't'} or {@code 'yes'} (case insensitive) will return
    * {@code true}. {@code 'false'}, {@code 'off'}, {@code 'n'}, {@code 'f'} or {@code 'no'} (case insensitive) will
    * return {@code false}. Otherwise, {@code null} is returned.
    * </p>
    * <p>
    * NOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean.
    * </p>
    *
    * <pre>
    *   // N.B. case is not significant
    *   BooleanUtils.toBooleanObject(null)    = null
    *   BooleanUtils.toBooleanObject("true")  = Boolean.TRUE
    *   BooleanUtils.toBooleanObject("T")     = Boolean.TRUE // i.e. T[RUE]
    *   BooleanUtils.toBooleanObject("false") = Boolean.FALSE
    *   BooleanUtils.toBooleanObject("f")     = Boolean.FALSE // i.e. f[alse]
    *   BooleanUtils.toBooleanObject("No")    = Boolean.FALSE
    *   BooleanUtils.toBooleanObject("n")     = Boolean.FALSE // i.e. n[o]
    *   BooleanUtils.toBooleanObject("on")    = Boolean.TRUE
    *   BooleanUtils.toBooleanObject("ON")    = Boolean.TRUE
    *   BooleanUtils.toBooleanObject("off")   = Boolean.FALSE
    *   BooleanUtils.toBooleanObject("oFf")   = Boolean.FALSE
    *   BooleanUtils.toBooleanObject("yes")   = Boolean.TRUE
    *   BooleanUtils.toBooleanObject("Y")     = Boolean.TRUE // i.e. Y[ES]
    *   BooleanUtils.toBooleanObject("blue")  = null
    *   BooleanUtils.toBooleanObject("true ") = null // trailing space (too long)
    *   BooleanUtils.toBooleanObject("ono")   = null // does not match on or no
    * </pre>
    *
    * @param str the String to check; upper and lower case are treated as the same
    * @return the Boolean value of the string, {@code null} if no match or {@code null} input
    */
   public static Boolean toBooleanObject(String str)
   {
      // Previously used equalsIgnoreCase, which was fast for interned 'true'.
      // Non interned 'true' matched 15 times slower.
      //
      // Optimisation provides same performance as before for interned 'true'.
      // Similar performance for null, 'false', and other strings not length 2/3/4.
      // 'true'/'TRUE' match 4 times slower, 'tRUE'/'True' 7 times slower.
      if (Objects.equals(str, "true"))
      {
         return Boolean.TRUE;
      }
      if (str == null)
      {
         return null;
      }
      switch (str.length())
      {
         case 1:
         {
            char ch0 = str.charAt(0);
            if (ch0 == 'y' || ch0 == 'Y' ||
                  ch0 == 't' || ch0 == 'T')
            {
               return Boolean.TRUE;
            }
            if (ch0 == 'n' || ch0 == 'N' ||
                  ch0 == 'f' || ch0 == 'F')
            {
               return Boolean.FALSE;
            }
            break;
         }
         case 2:
         {
            char ch0 = str.charAt(0);
            char ch1 = str.charAt(1);
            if ((ch0 == 'o' || ch0 == 'O') &&
                  (ch1 == 'n' || ch1 == 'N'))
            {
               return Boolean.TRUE;
            }
            if ((ch0 == 'n' || ch0 == 'N') &&
                  (ch1 == 'o' || ch1 == 'O'))
            {
               return Boolean.FALSE;
            }
            break;
         }
         case 3:
         {
            char ch0 = str.charAt(0);
            char ch1 = str.charAt(1);
            char ch2 = str.charAt(2);
            if ((ch0 == 'y' || ch0 == 'Y') &&
                  (ch1 == 'e' || ch1 == 'E') &&
                  (ch2 == 's' || ch2 == 'S'))
            {
               return Boolean.TRUE;
            }
            if ((ch0 == 'o' || ch0 == 'O') &&
                  (ch1 == 'f' || ch1 == 'F') &&
                  (ch2 == 'f' || ch2 == 'F'))
            {
               return Boolean.FALSE;
            }
            break;
         }
         case 4:
         {
            char ch0 = str.charAt(0);
            char ch1 = str.charAt(1);
            char ch2 = str.charAt(2);
            char ch3 = str.charAt(3);
            if ((ch0 == 't' || ch0 == 'T') &&
                  (ch1 == 'r' || ch1 == 'R') &&
                  (ch2 == 'u' || ch2 == 'U') &&
                  (ch3 == 'e' || ch3 == 'E'))
            {
               return Boolean.TRUE;
            }
            break;
         }
         case 5:
         {
            char ch0 = str.charAt(0);
            char ch1 = str.charAt(1);
            char ch2 = str.charAt(2);
            char ch3 = str.charAt(3);
            char ch4 = str.charAt(4);
            if ((ch0 == 'f' || ch0 == 'F') &&
                  (ch1 == 'a' || ch1 == 'A') &&
                  (ch2 == 'l' || ch2 == 'L') &&
                  (ch3 == 's' || ch3 == 'S') &&
                  (ch4 == 'e' || ch4 == 'E'))
            {
               return Boolean.FALSE;
            }
            break;
         }
         default:
            break;
      }

      return null;
   }

   /**
    * <p>
    * Checks if a {@code Boolean} value is {@code true}, handling {@code null} by returning {@code false}.
    * </p>
    *
    * <pre>
    *   BooleanUtils.isTrue(Boolean.TRUE)  = true
    *   BooleanUtils.isTrue(Boolean.FALSE) = false
    *   BooleanUtils.isTrue(null)          = false
    * </pre>
    *
    * @param bool the boolean to check, null returns {@code false}
    * @return {@code true} only if the input is non-null and true
    * @since 2.1
    */
   public static boolean isTrue(final Boolean bool)
   {
      return Boolean.TRUE.equals(bool);
   }

   /**
    * <p>
    * Checks if a {@code Boolean} value is {@code false}, handling {@code null} by returning {@code true}.
    * </p>
    *
    * <pre>
    *   BooleanUtils.isFalse(Boolean.TRUE)  = false
    *   BooleanUtils.isFalse(Boolean.FALSE) = true
    *   BooleanUtils.isFalse(null)          = true
    * </pre>
    *
    * @param bool the boolean to check, null returns {@code true}
    * @return {@code false} only if the input is true
    */
   public static boolean isFalse(Boolean bool)
   {
      return !isTrue(bool);
   }
}
