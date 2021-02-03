package com.inetwork.web.data.shared.common;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ChangePasswordRequest implements IsSerializable
{

   public ChangePasswordRequest()
   {
   }

   public ChangePasswordRequest(String currentPassword, String newPassword)
   {
      this.currentPassword = currentPassword;
      this.newPassword = newPassword;
   }

   private String currentPassword;
   private String newPassword;

   public String getCurrentPassword()
   {
      return currentPassword;
   }

   public void setCurrentPassword(String c)
   {
      this.currentPassword = c;
   }

   public String getNewPassword()
   {
      return newPassword;
   }

   public void setNewPassword(String n)
   {
      this.newPassword = n;
   }
}
