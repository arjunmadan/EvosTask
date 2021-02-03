package com.inetwork.web.data.shared.dto.orders.lidb;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum LidbVisibility implements HumanReadableValue
{

   PUBLIC("Allowed"), // A is for allow
   PRIVATE("Blocked"); // R is for block

   private String hrValue;

   private LidbVisibility(String hrValue)
   {
      this.hrValue = hrValue;
   }

   @Override
   public String getHumanReadableValue()
   {
      return hrValue;
   }

   public static String getUiValue(String apiValue)
   {
      if (apiValue != null)
      {
         for (LidbVisibility value : values())
         {
            if (apiValue.equalsIgnoreCase(value.name()))
            {
               return value.getHumanReadableValue();
            }
         }
      }
      return null;
   }

}
