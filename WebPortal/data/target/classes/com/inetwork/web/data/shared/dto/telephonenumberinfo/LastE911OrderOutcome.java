package com.inetwork.web.data.shared.dto.telephonenumberinfo;

import com.inetwork.web.data.shared.utils.EnumUtils;
import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum LastE911OrderOutcome implements HumanReadableValue
{
   PENDING("Pending"),
   SUCCESS("Success"),
   ADJUSTED("Adjusted"),
   FAILED("Failed"),
   REVERTED("Reverted"),
   DELETED("Deleted");

   private String value;

   LastE911OrderOutcome(String value)
   {
      this.value = value;
   }

   @Override
   public String getHumanReadableValue()
   {
      return value;
   }

   public static LastE911OrderOutcome fromValue(String value)
   {
      return EnumUtils.valueOf(value, values());
   }
}
