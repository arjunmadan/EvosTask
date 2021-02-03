package com.inetwork.web.data.dto.imports.sipcredentials;

import org.apache.commons.lang3.StringUtils;

public enum ImportSipCredentialsAction
{
   ADD("add"),
   CHANGE("change"),
   DELETE("delete");

   private String templateValue;

   ImportSipCredentialsAction(String templateValue)
   {
      this.templateValue = templateValue;
   }

   public String getTemplateValue()
   {
      return templateValue;
   }

   public static ImportSipCredentialsAction fromTemplateValue(String templateValue)
   {
      for (ImportSipCredentialsAction action : values())
      {
         if (StringUtils.endsWithIgnoreCase(action.getTemplateValue(), templateValue))
         {
            return action;
         }
      }
      return null;
   }
}