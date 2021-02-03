package com.inetwork.web.data.shared;

import com.inetwork.web.data.shared.utils.EnumUtils;

public enum TnAttribute
{
   PROTECTED("Protected"), EXTERNAL("External");

   private final String databaseValue;

   TnAttribute(String databaseValue)
   {
      this.databaseValue = databaseValue;
   }

   public static TnAttribute fromDatabaseValue(String databaseValue)
   {
      return EnumUtils.valueOf(databaseValue, values());
   }

   public String getDatabaseValue()
   {
      return databaseValue;
   }
}
