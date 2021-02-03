package com.inetwork.web.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "UserCurrentState")
@XmlType(name = "UserCurrentState")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserCurrentState
{

   private int currentAccountId;
   private boolean adminMode;

   public int getCurrentAccountId()
   {
      return currentAccountId;
   }

   public void setCurrentAccountId(int currentAccountId)
   {
      this.currentAccountId = currentAccountId;
   }

   public boolean isAdminMode()
   {
      return adminMode;
   }

   public void setAdminMode(boolean adminMode)
   {
      this.adminMode = adminMode;
   }
}
