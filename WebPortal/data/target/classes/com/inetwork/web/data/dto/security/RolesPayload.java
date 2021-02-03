package com.inetwork.web.data.dto.security;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.inetwork.common.dto.admin.authorization.AuthorizationPayload;

@XmlRootElement(name = "Roles")
@XmlType(name = "Roles")
@XmlAccessorType(XmlAccessType.NONE)
@JsonInclude(Include.NON_NULL)
public class RolesPayload extends AuthorizationPayload implements Iterable<RolePayload>
{
   private static final long serialVersionUID = 3622488690625958858L;

   @XmlElement(name = "Role")
   private List<RolePayload> roles;

   public RolesPayload()
   {
      this(new ArrayList<RolePayload>());
   }

   public RolesPayload(List<RolePayload> roles)
   {
      super();
      this.roles = roles;
   }

   public RolesPayload(RolePayload... roles)
   {
      this(Lists.newArrayList(roles));
   }

   public List<RolePayload> getRoles()
   {
      return roles;
   }

   public void setRoles(List<RolePayload> roles)
   {
      this.roles = roles;
   }

   public void add(RolePayload role)
   {
      if (getRoles() == null)
      {
         setRoles(new ArrayList<RolePayload>());
      }
      getRoles().add(role);
   }

   public RolePayload get(Integer index)
   {
      return getRoles() != null ? getRoles().get(index) : null;
   }

   public int size()
   {
      return getRoles() != null ? getRoles().size() : 0;
   }

   public boolean isEmpty()
   {
      return getRoles() != null ? getRoles().isEmpty() : true;
   }

   @Override
   public Iterator<RolePayload> iterator()
   {
      return getRoles() != null ? getRoles().iterator() : new ArrayList<RolePayload>().iterator();
   }

   @Override
   public String toString()
   {
      return MoreObjects.toStringHelper(this)
            .addValue(getRoles())
            .toString();
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getRoles());
   }

   @Override
   public boolean equals(final Object obj)
   {
      if (obj instanceof RolesPayload)
      {
         final RolesPayload that = (RolesPayload) obj;
         return Objects.equals(getRoles(), that.getRoles());
      }
      return false;
   }
}
