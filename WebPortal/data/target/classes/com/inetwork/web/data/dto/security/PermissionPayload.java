package com.inetwork.web.data.dto.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.common.base.MoreObjects;
import java.util.Objects;
import com.inetwork.common.dto.admin.authorization.AuthorizationPayload;
import com.inetwork.common.util.EnumUtil;

@XmlRootElement(name = "Permission")
@XmlType(name = "Permission")
@XmlAccessorType(XmlAccessType.NONE)
public class PermissionPayload extends AuthorizationPayload
{
   private static final long serialVersionUID = 721100939576948722L;

   @XmlElement(name = "PermissionName")
   private String permissionName;

   public PermissionPayload()
   {
      super();
   }

   public PermissionPayload(String permissionName)
   {
      this();
      this.permissionName = permissionName;
   }

   public PermissionPayload(Permission permission)
   {
      this(permission.toString());
   }

   public String getPermissionName()
   {
      return permissionName;
   }

   public void setPermissionName(String permissionName)
   {
      this.permissionName = permissionName;
   }

   public void setPermission(Permission permission)
   {
      setPermissionName(permission.toString());
   }

   public Permission asPermission()
   {
      return EnumUtil.convertToEnum(Permission.values(), getPermissionName());
   }

   public static PermissionPayload createPermissionPayload(PermissionDto permissionDto)
   {
      PermissionPayload permissionPayload = null;
      if (permissionDto != null)
      {
         permissionPayload = new PermissionPayload();
         permissionPayload.setPermissionName(permissionDto.getName()
               .toString());
      }
      return permissionPayload;
   }

   @Override
   public String toString()
   {
      return MoreObjects.toStringHelper(this)
            .add("permissionName", getPermissionName())
            .toString();
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getPermissionName());
   }

   @Override
   public boolean equals(final Object obj)
   {
      if (obj instanceof PermissionPayload)
      {
         final PermissionPayload that = (PermissionPayload) obj;
         return Objects.equals(getPermissionName(), that.getPermissionName());
      }
      return false;
   }
}
