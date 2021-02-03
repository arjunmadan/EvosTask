package com.inetwork.web.data.shared.dto.orders.dlda;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum DldaListingType implements HumanReadableValue
{
   LISTED("Listed"),
   NON_LISTED("NonListed"),
   NON_PUBLISHED("NonPublished");

   private String hrValue;

   private DldaListingType(String hrValue)
   {
      this.hrValue = hrValue;
   }

   @Override
   public String getHumanReadableValue()
   {
      return hrValue;
   }

}
