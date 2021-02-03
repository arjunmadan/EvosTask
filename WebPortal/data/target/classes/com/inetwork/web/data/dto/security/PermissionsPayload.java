package com.inetwork.web.data.dto.security;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.common.base.MoreObjects;
import java.util.Objects;
import com.google.common.collect.Lists;
import com.inetwork.common.dto.admin.authorization.AuthorizationPayload;

@XmlRootElement(name = "Permissions")
@XmlType(name = "Permissions")
@XmlAccessorType(XmlAccessType.NONE)
public class PermissionsPayload extends AuthorizationPayload implements Iterable<PermissionPayload>
{
   private static final long serialVersionUID = -7800854739465654421L;

   @XmlElement(name = "Permission")
   private List<PermissionPayload> permissions;

   public PermissionsPayload()
   {
      super();
   }

   public PermissionsPayload(List<PermissionPayload> permissions)
   {
      this();
      this.permissions = permissions;
   }

   public PermissionsPayload(PermissionPayload... permissions)
   {
      this(Lists.newArrayList(permissions));
   }

   public List<PermissionPayload> getPermissions()
   {
      return permissions;
   }

   public void setPermissions(List<PermissionPayload> permissions)
   {
      this.permissions = permissions;
   }

   public void add(PermissionPayload permission)
   {
      if (getPermissions() == null)
      {
         setPermissions(new ArrayList<PermissionPayload>());
      }
      getPermissions().add(permission);
   }

   public PermissionPayload get(int index)
   {
      return getPermissions() != null ? getPermissions().get(index) : null;
   }

   public int size()
   {
      return getPermissions() != null ? getPermissions().size() : 0;
   }

   public boolean isEmpty()
   {
      return getPermissions() != null ? getPermissions().isEmpty() : true;
   }

   @Override
   public Iterator<PermissionPayload> iterator()
   {
      return getPermissions() != null ? getPermissions().iterator() : new ArrayList<PermissionPayload>().iterator();
   }

   @Override
   public String toString()
   {
      return MoreObjects.toStringHelper(this)
            .addValue(getPermissions())
            .toString();
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getPermissions());
   }

   @Override
   public boolean equals(final Object obj)
   {
      if (obj instanceof PermissionsPayload)
      {
         final PermissionsPayload that = (PermissionsPayload) obj;
         return Objects.equals(getPermissions(), that.getPermissions());
      }
      return false;
   }
}
