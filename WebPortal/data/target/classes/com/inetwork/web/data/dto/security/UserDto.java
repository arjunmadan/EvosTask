package com.inetwork.web.data.dto.security;

import java.security.GeneralSecurityException;
import java.util.Date;

import com.inetwork.common.util.CryptographyUtil;
import com.inetwork.common.dto.IncrementIdDto;


public class UserDto extends IncrementIdDto
{

   @Deprecated
   public enum UserType
   {
      @Deprecated
      api, @Deprecated
   web
   }

   private static final long serialVersionUID = -410386549482571307L;
   private static final UserType DEFAULT_USER_TYPE = UserType.api;

   private String loginName;

   private String passwordHash;

   private boolean isLocked;

   private int failedLoginAttempts;

   private Date lastLoginDate;

   private UserType userType = DEFAULT_USER_TYPE;

   private boolean isUserMigrated;

   public UserDto()
   {
      lastLoginDate = new Date(0);
   }

   public String getLoginName()
   {
      return loginName;
   }

   public void setLoginName(String loginName)
   {
      this.loginName = loginName;
   }

   public String getPasswordHash()
   {
      return passwordHash;
   }

   public void setPasswordHash(String passwordHash)
   {
      this.passwordHash = passwordHash;
   }

   public boolean isLocked()
   {
      return isLocked;
   }

   public void setLocked(boolean locked)
   {
      this.isLocked = locked;
   }

   @Deprecated
   public int getFailedLoginAttempts()
   {
      return failedLoginAttempts;
   }

   @Deprecated
   public void setFailedLoginAttempts(int failedLoginAttempts)
   {
      this.failedLoginAttempts = failedLoginAttempts;
   }

   @Deprecated
   public Date getLastLoginDate()
   {
      return lastLoginDate;
   }

   @Deprecated
   public void setLastLoginDate(Date lastLoginDate)
   {
      this.lastLoginDate = lastLoginDate;
   }

   @Deprecated
   public UserType getUserType()
   {
      return userType;
   }

   @Deprecated
   public void setUserType(UserType userType)
   {
      this.userType = userType;
   }

   @Deprecated
   public boolean isUserMigrated()
   {
      return isUserMigrated;
   }

   @Deprecated
   public void setIsUserMigrated(boolean isUserMigrated)
   {
      this.isUserMigrated = isUserMigrated;
   }

   public String createSecurityToken(String cleartextPassword) throws GeneralSecurityException
   {
      if (userType.equals(UserType.api))
      {
         return CryptographyUtil.encrypt(cleartextPassword);
      }
      else if (userType.equals(UserType.web))
      {
         return CryptographyUtil.encrypt(cleartextPassword);
      }
      else
      {
         throw new IllegalStateException("Don't know how to create security token for user type " + userType);
      }
   }
}
