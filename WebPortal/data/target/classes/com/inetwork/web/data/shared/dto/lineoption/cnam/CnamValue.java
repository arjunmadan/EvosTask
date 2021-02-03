package com.inetwork.web.data.shared.dto.lineoption.cnam;

import com.inetwork.web.data.shared.utils.HumanReadableValue;
import com.inetwork.web.data.shared.utils.SearchValue;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Boolean.TRUE;
import static java.lang.Boolean.FALSE;

public enum CnamValue implements HumanReadableValue, SearchValue
{
   DEFAULT("system default", null), ON("on", TRUE.toString()), OFF("off", FALSE.toString());

   private String uiValue;
   private String apiValue;

   CnamValue(String uiValue, String apiValue)
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

   public static final List<String> UI_VALUES = getUiValues();

   private static List<String> getUiValues()
   {
      List<String> result = new ArrayList<String>(values().length);
      for (CnamValue enumItem : values())
      {
         result.add(enumItem.uiValue);
      }
      return result;
   }

   public static String getApiValueFromUiValue(String uiValue)
   {
      for (CnamValue item : values())
      {
         if (item.uiValue.equals(uiValue))
         {
            return item.apiValue;
         }
      }
      return null;
   }

   public static String getUiValueFromApiValue(String apiValue)
   {
      if(apiValue == null)
      {
          return DEFAULT.uiValue;
      }
      for (CnamValue item : values())
      {
         if (apiValue.equals(item.apiValue))
         {
            return item.uiValue;
         }
      }
      return null;
   }

}
