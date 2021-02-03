package com.inetwork.web.data.shared;

public enum LdapRoles
{
   LSR_ROLE("LsrManagement"),
   HTTP_APPLICATIONS_ROLE("HTTP Application Management"),
   E911_MANAGEMENT_ROLE("E911 Management"),
   SUDO_POWERS_ROLE("SUDO Powers");

   private String roleId;

   LdapRoles(String roleSqlName)
   {
      this.roleId = roleSqlName;
   }

   public static LdapRoles parse(String value)
   {
      for (LdapRoles role : LdapRoles.values())
      {
         if (role.roleId.equalsIgnoreCase(value))
         {
            return role;
         }
      }
      return null;
   }

   public String getRoleId()
   {
      return roleId;
   }
}
