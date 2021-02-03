package com.inetwork.web.data.shared.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

public class EnumUtils
{

   public static <E extends Enum> List<E> deCodeList(final E[] enums, int code)
   {
      if (code <= 0)
      {
         return Arrays.asList(enums);
      }
      List<E> list = new ArrayList<E>(enums.length);
      for (int shift = 0; code > 0; shift++, code >>= 1)
      {
         if ((code & 1) > 0)
         {
            list.add(deCode(enums, (1 << shift)));
         }
      }
      return list;
   }

   public static <E extends Enum> E deCode(final E[] enums, int code)
   {
      for (E e : enums)
      {
         if (code == code(e))
         {
            return e;
         }
      }
      throw new IllegalArgumentException("No enum for code: " + code);
   }

   public static <E extends Enum> int code(E e)
   {
      return 1 << e.ordinal();
   }

   public static <E extends Enum> int code(Iterable<E> enums)
   {
      int code = 0;
      if (enums != null)
      {
         for (E e : enums)
         {
            code += code(e);
         }
      }
      return code;
   }

   public static <E extends Enum> int code(E... enums)
   {
      return code(Arrays.asList(enums));
   }

   public static <H extends HumanReadableValue> List<String> getHRValues(H... values)
   {
      List<String> hrValues = Lists.newArrayList();
      for (H value : values)
      {
         hrValues.add(value.getHumanReadableValue());
      }
      return hrValues;
   }

   public static <E extends Enum> E valueOf(String value, E... enums)
   {
      if (StringUtils.isNotEmpty(value))
      {
         for (E enm : enums)
         {
            if (clearName(enm.name()).equalsIgnoreCase(clearName(value)))
            {
               return enm;
            }
         }
      }
      return null;
   }

   public static <E extends Enum> boolean isAnyOf(E value, E... enums)
   {
      if (enums == null || enums.length == 0)
      {
         return false;
      }
      for (E enm : enums)
      {
         if (enm == value)
         {
            return true;
         }
      }
      return false;
   }

   private static String clearName(String name)
   {
      return name.replaceAll("[_|\\s]", "");
   }
}
