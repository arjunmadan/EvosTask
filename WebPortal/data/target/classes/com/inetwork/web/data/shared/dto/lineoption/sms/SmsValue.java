package com.inetwork.web.data.shared.dto.lineoption.sms;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

import com.inetwork.web.data.shared.utils.HumanReadableValue;
import com.inetwork.web.data.shared.utils.SearchValue;

public enum SmsValue implements HumanReadableValue, SearchValue
{
   UNCHANGED("unchanged", null), ON("on", TRUE.toString()), OFF("off", FALSE.toString());

   private String uiValue;
   private String apiValue;

   SmsValue(String uiValue, String apiValue)
   {
      this.uiValue = uiValue;
      this.apiValue = apiValue;
   }

   @Override
   public String getHumanReadableValue()
   {
      return uiValue;
   }

   @Override
   public String getSearchValue()
   {
      return apiValue;
   }

   public static String getUiValueFromApiValue(String apiValue)
   {
      if (apiValue == null)
      {
         return UNCHANGED.uiValue;
      }
      for (SmsValue item : values())
      {
         if (apiValue.equals(item.apiValue))
         {
            return item.uiValue;
         }
      }
      return null;
   }
}
