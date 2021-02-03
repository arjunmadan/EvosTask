package com.inetwork.web.data.shared;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum LocalTnStatus implements HumanReadableValue
{

   FAILED("Failed"),
   COMPLETE("Complete"),
   PROCESSING("Processing"),
   PENDING("Pending"),
   PARTIAL("Partial"),
   ADJUSTED("Adjusted"),
   INVALID("Invalid");

   private String status;

   LocalTnStatus(String status)
   {
      this.status = status;
   }

   @Override
   public String getHumanReadableValue()
   {
      return status;
   }

}
