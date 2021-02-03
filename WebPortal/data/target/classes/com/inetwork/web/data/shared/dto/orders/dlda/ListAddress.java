package com.inetwork.web.data.shared.dto.orders.dlda;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum ListAddress implements HumanReadableValue
{

   INCLUDE("Include"),
   EXCLUDE("Exclude");

   private String hrValue;

   ListAddress(String hrValue)
   {
      this.hrValue = hrValue;
   }

   public String getHumanReadableValue()
   {
      return hrValue;
   }

   public static String getHumanReadableValue(boolean listAddress)
   {
      return listAddress ? INCLUDE.getHumanReadableValue() : EXCLUDE.getHumanReadableValue();
   }

}
