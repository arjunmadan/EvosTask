package com.inetwork.web.data.shared.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionUtils
{

   public static String getListAsString(Iterable<String> list)
   {
      StringBuilder sb = new StringBuilder("");
      if (list != null)
      {
         Iterator<String> iterator = list.iterator();
         while (iterator.hasNext())
         {
            sb.append(iterator.next());
            if (iterator.hasNext())
            {
               sb.append(", ");
            }
         }
      }
      return sb.toString();
   }

   public static List<String> getHumanReadableValues(Collection<? extends HumanReadableValue> values)
   {
      if (!isEmpty(values))
      {
         List<String> result = new ArrayList<String>(values.size());
         for (HumanReadableValue value : values)
         {
            result.add(value.getHumanReadableValue());
         }
         return result;
      }
      else
      {
         return Collections.emptyList();
      }

   }

   public static <E> void addAll(Collection<E> to, Collection<E> from)
   {
      if (isNotEmpty(from))
      {
         to.addAll(from);
      }
   }

   public static boolean isEmpty(Collection c)
   {
      return c == null || c.isEmpty();
   }

   public static boolean isNotEmpty(Collection c)
   {
      return !isEmpty(c);
   }

   /**
    * Adds an element to the collection unless the element is null.
    *
    * @param collection the collection to add to, must not be null
    * @param object the object to add, if null it will not be added
    * @return true if the collection changed
    * @throws NullPointerException if the collection is null
    */
   public static boolean addIgnoreNull(Collection collection, Object object)
   {
      return object != null && collection.add(object);
   }

   public static boolean containsAny(Collection coll1, Collection coll2)
   {
      if (coll1.size() < coll2.size())
      {
         for (Object aColl1 : coll1)
         {
            if (coll2.contains(aColl1))
            {
               return true;
            }
         }
      }
      else
      {
         for (Object aColl2 : coll2)
         {
            if (coll1.contains(aColl2))
            {
               return true;
            }
         }
      }
      return false;
   }
}
