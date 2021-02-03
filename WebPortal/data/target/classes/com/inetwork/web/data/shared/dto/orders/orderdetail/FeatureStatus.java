package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum FeatureStatus implements HumanReadableValue
{

   PENDING("Pending"),
   SUCCESS("Success"),
   FAILED("Failed"),
   PENDING_EDITABLE("Pending-Editable"),
   PENDING_LOCKED("Pending-Locked");

   private String hrValue;

   FeatureStatus(String hrValue)
   {
      this.hrValue = hrValue;
   }

   @Override
   public String getHumanReadableValue()
   {
      return hrValue;
   }

   public static FeatureStatus fromValue(String value)
   {
      for (FeatureStatus status : FeatureStatus.values())
      {
         if (status.getHumanReadableValue()
               .equalsIgnoreCase(value))
         {
            return status;
         }
      }
      return null;
   }
}
