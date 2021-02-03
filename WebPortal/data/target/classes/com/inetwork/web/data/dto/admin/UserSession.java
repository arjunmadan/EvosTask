package com.inetwork.web.data.dto.admin;

import com.inetwork.common.dto.admin.user.UserScope;

import java.io.Serializable;

public class UserSession implements Serializable
{
   private static final long serialVersionUID = -4696952616571019400L;
   private String username;
   private String password;
   private UserScope userScope;
   private boolean fromLdap = false;
   private boolean keepMeLogged;

   public String getUsername()
   {
      return username;
   }

   public void setUsername(String username)
   {
      this.username = username;
   }

   public String getPassword()
   {
      return password;
   }

   public void setPassword(String password)
   {
      this.password = password;
   }


   public boolean isKeepMeLogged()
   {
      return keepMeLogged;
   }

   public void setKeepMeLogged(boolean keepMeLogged)
   {
      this.keepMeLogged = keepMeLogged;
   }

   public boolean isFromLdap()
   {
      return fromLdap;
   }

   public void setFromLdap(boolean fromLdap)
   {
      this.fromLdap = fromLdap;
   }

   public UserScope getUserScope() {
      return userScope;
   }

   public void setUserScope(UserScope userScope) {
      this.userScope = userScope;
   }
}
