package com.inetwork.web.data.shared.dto.orders.dlda;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum DldaSubscriberType implements HumanReadableValue
{

   BUSINESS("Business"),
   RESIDENTIAL("Residential");

   private String hrValue;

   private DldaSubscriberType(String hrValue)
   {
      this.hrValue = hrValue;
   }

   public String getHumanReadableValue()
   {
      return hrValue;
   }


}
