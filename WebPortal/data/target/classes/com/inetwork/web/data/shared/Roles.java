package com.inetwork.web.data.shared;

public enum Roles
{
   ROLE_LSR_USER("ROLE_LSR_USER"),
   ROLE_ADMIN("ROLE_ADMIN"),
   ROLE_AGENT("ROLE_AGENT"),
   ROLE_API_ACCOUNT("ROLE_API_ACCOUNT"),
   ROLE_API_CNAMLIDB("ROLE_API_CNAMLIDB"),
   ROLE_API_DLDA("ROLE_API_DLDA"),
   ROLE_API_HISTORY("ROLE_API_HISTORY"),
   ROLE_API_LNP("ROLE_API_LNP"),
   ROLE_API_ORDERING("ROLE_API_ORDERING"),
   ROLE_API_PROFILE("ROLE_API_PROFILE"),
   ROLE_API_SEARCH("ROLE_API_SEARCH"),
   ROLE_USER("ROLE_USER"),
   ROLE_API_SITE("ROLE_API_SITE"),
   ROLE_BDR("ROLE_BDR"),
   ROLE_API_REPORTING("ROLE_API_REPORTING"),
   ROLE_API_EMERGENCY("ROLE_API_EMERGENCY");

   private String roleSqlName;

   Roles(String roleSqlName)
   {
      this.roleSqlName = roleSqlName;
   }

   public static Roles parse(String value)
   {
      for (Roles role : Roles.values())
      {
         if (role.roleSqlName.equalsIgnoreCase(value))
         {
            return role;
         }
      }
      return null;
   }
}
