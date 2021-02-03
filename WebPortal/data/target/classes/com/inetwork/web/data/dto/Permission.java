package com.inetwork.web.data.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Permission")
@XmlType(name = "Permission")
@XmlAccessorType(XmlAccessType.FIELD)
public class Permission
{

   @XmlElement(name = "PermissionName")
   private String permissionName;

   public String getPermissionName()
   {
      return permissionName;
   }

   public void setPermissionName(String permissionName)
   {
      this.permissionName = permissionName;
   }
}
