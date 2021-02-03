package com.inetwork.web.data.shared.dto.orders.dlda;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum ServiceType implements HumanReadableValue
{
   NEW("New"),
   REMOVE("Remove");

   private String hrValue;

   ServiceType(String hrValue)
   {
      this.hrValue = hrValue;
   }

   public String getHumanReadableValue()
   {
      return hrValue;
   }

   public static String getHumanReadableValue(boolean deleteDldaTnGroups)
   {
      return deleteDldaTnGroups ? REMOVE.getHumanReadableValue() : NEW.getHumanReadableValue();
   }

}
