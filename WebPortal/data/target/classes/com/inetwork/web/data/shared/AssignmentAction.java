package com.inetwork.web.data.shared;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum AssignmentAction implements HumanReadableValue
{

   ASSIGN("Assigned"),
   UNASSIGN("Unassigned");

   private final String hrValue;

   AssignmentAction(String value)
   {
      this.hrValue = value;
   }

   @Override
   public String getHumanReadableValue()
   {
      return hrValue;
   }

}
