package com.inetwork.web.data.dto.security;

import com.inetwork.common.dto.IncrementIdDto;

public class PermissionDto extends IncrementIdDto
{

   private static final long serialVersionUID = 2571307293836283115L;
   private Permission name;

   public Permission getName()
   {
      return name;
   }

   public void setName(Permission name)
   {
      this.name = name;
   }

   @Override
   public String toString()
   {
      return "PermissionDto [permission=" + name + "]";
   }

}
