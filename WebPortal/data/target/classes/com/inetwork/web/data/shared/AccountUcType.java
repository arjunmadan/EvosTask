package com.inetwork.web.data.shared;

import java.util.Collections;
import java.util.List;

public enum AccountUcType
{
   SEATS("Seats", 1), CLOUD("Cloud", 2), PREMISE("Premise", 3);

   private String value;
   private int id;

   private AccountUcType(String value, int id)
   {
      this.value = value;
      this.id = id;
   }

   public String getValue()
   {
      return value;
   }

   public int getId()
   {
      return id;
   }

   public static List<String> getAllowedUcTypes(String apiValue)
   {
      for (AccountUcType type : values())
      {
         if (type.value.equals(apiValue))
         {
            return Collections.singletonList(type.getValue());
         }
      }
      return Collections.emptyList();
   }
}
