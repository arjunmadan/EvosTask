package com.inetwork.web.data.dto.security;

import com.inetwork.common.util.EnumUtil;

public enum Permission
{
   UPDATE, VIEW;

   public static Permission fromPermissionName(String permissionName)
   {
      return EnumUtil.convertToEnum(Permission.values(), permissionName);
   }
}
