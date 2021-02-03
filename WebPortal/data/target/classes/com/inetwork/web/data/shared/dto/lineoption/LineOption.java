package com.inetwork.web.data.shared.dto.lineoption;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.inetwork.web.data.shared.utils.HumanReadableValue;
import com.inetwork.web.data.shared.utils.StringUtils;

public enum LineOption implements HumanReadableValue, IsSerializable
{
   CALL_FORWARD("Call forwarding"),
   LIDB("Calling Name information"),
   CNAM("Calling Name display enable"),
   DLDA("DL/DA"),
   E911("E911"),
   PROTECTED("Protected Status"),
   URI_USER("Custom URI User value"),
   SMS("SMS Messaging"),
   FINAL_DESTINATION_URI("Call failure redirect destination"),
   A2P("A2P messaging"),
   NNID_ASSIGNMENT("NNID Assignment");

   private String uiValue;

   public static List<String> getUiValues()
   {
      List<String> uiValues = new ArrayList<>(values().length);
      for (LineOption lineOption : values())
      {
         uiValues.add(lineOption.getUiValue());
      }
      return uiValues;
   }

   LineOption(String uiValue)
   {
      this.uiValue = uiValue;
   }

   @Override
   public String getHumanReadableValue()
   {
      return getUiValue();
   }

   public String getUiValueWithColon()
   {
      return StringUtils.appendColon(uiValue);
   }

   public static LineOption getLineOption(String uiValue)
   {
      for (LineOption lineOption : values())
      {
         if (lineOption.getUiValue()
               .equals(uiValue))
         {
            return lineOption;
         }
      }
      return null;
   }

   public String getUiValue()
   {
      return uiValue;
   }
}
