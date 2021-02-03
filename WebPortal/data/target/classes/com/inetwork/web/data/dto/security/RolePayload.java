package com.inetwork.web.data.dto.security;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.MoreObjects;
import java.util.Objects;
import com.inetwork.common.dto.admin.authorization.AuthorizationPayload;

@XmlRootElement(name = "Role")
@XmlType(name = "Role")
@XmlAccessorType(XmlAccessType.NONE)
@JsonInclude(Include.NON_NULL)
public class RolePayload extends AuthorizationPayload
{
   private static final long serialVersionUID = 8890431111435848587L;

   @XmlElement(name = "RoleId")
   private String roleId;

   @XmlElement(name = "Permissions")
   private PermissionsPayload permissions;

   public RolePayload()
   {
      super();
   }

   public RolePayload(String roleName)
   {
      this();
      this.roleId = roleName;
   }

   public RolePayload(String roleName, PermissionsPayload permissions)
   {
      this(roleName);
      this.permissions = permissions;
   }

   public RolePayload(Role role)
   {
      this(role.toString());
   }

   public RolePayload(Role role, PermissionsPayload permissions)
   {
      this(role.toString(), permissions);
   }

   public String getRoleId()
   {
      return roleId;
   }

   public void setRoleId(String roleId)
   {
      this.roleId = roleId;
   }

   public void setRole(Role role)
   {
      setRoleId(role.toString());
   }

   public PermissionsPayload getPermissions()
   {
      return permissions;
   }

   public void setPermissions(PermissionsPayload permissions)
   {
      this.permissions = permissions;
   }

   public static RolePayload createRolePayload(Role role, List<PermissionPayload> permissions)
   {
      RolePayload rolePayload = null;
      if (role != null)
      {
         rolePayload = new RolePayload();
         rolePayload.setRoleId(role.toString());
         PermissionsPayload permissionsPayload = new PermissionsPayload(permissions);
         rolePayload.setPermissions(permissionsPayload);
      }
      return rolePayload;
   }

   @Override
   public String toString()
   {
      return MoreObjects.toStringHelper(this)
            .add("roleId", getRoleId())
            .addValue(getPermissions())
            .toString();
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getRoleId(), getPermissions());
   }

   @Override
   public boolean equals(final Object obj)
   {
      if (obj instanceof RolePayload)
      {
         final RolePayload that = (RolePayload) obj;
         return Objects.equals(getRoleId(), that.getRoleId())
                 && Objects.equals(getPermissions(), that.getPermissions());
      }
      return false;
   }
}
