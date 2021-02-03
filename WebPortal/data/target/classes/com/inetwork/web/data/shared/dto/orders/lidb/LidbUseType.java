package com.inetwork.web.data.shared.dto.orders.lidb;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum LidbUseType implements HumanReadableValue
{

   BUSINESS("Business"),
   RESIDENTIAL("Residential");

   private String hrValue;

   private LidbUseType(String hrValue)
   {
      this.hrValue = hrValue;
   }

   public String getHumanReadableValue()
   {
      return hrValue;
   }


}
