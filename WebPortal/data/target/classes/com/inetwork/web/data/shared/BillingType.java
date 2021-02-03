package com.inetwork.web.data.shared;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum BillingType implements HumanReadableValue
{

   NOCHARGE("No Charge"),
   PORTIN("Normal Porting"),
   NEWNUMBER("New Number"),
   PROJECTPORT("Project Port"),
   DISCOUNTED("Discounted");

   private String hrValue;

   BillingType(String hrValue)
   {
      this.hrValue = hrValue;
   }

   @Override
   public String getHumanReadableValue()
   {
      return hrValue;
   }
}
