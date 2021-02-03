package com.inetwork.web.data.dto.imports.linefeatures.lidb;

import com.google.common.base.Objects;
import com.inetwork.common.dto.lidb.LidbDetailTnGroup;
import com.inetwork.common.dto.lidb.LidbUseType;
import com.inetwork.common.dto.lidb.LidbVisibility;

public class LidbDetailsKey
{
   private String serviceType;
   private String presentation;
   private String name;

   public LidbDetailsKey(String serviceType, String presentation, String name)
   {
      this.serviceType = serviceType;
      this.presentation = presentation;
      this.name = name;
   }

   public boolean equals(Object obj)
   {
      if (obj instanceof LidbDetailsKey)
      {

         LidbDetailsKey lidbDetailsKey = (LidbDetailsKey) obj;
         return Objects.equal(getServiceType(), lidbDetailsKey.getServiceType()) &&
               Objects.equal(getPresentation(), lidbDetailsKey.getPresentation()) &&
               Objects.equal(getName(), lidbDetailsKey.getName());
      }
      return false;

   }

   public int hashCode()
   {
      return Objects.hashCode(getServiceType(), getPresentation(), getName());
   }

   public String getServiceType()
   {
      return serviceType;
   }

   public String getPresentation()
   {
      return presentation;
   }

   public String getName()
   {
      return name;
   }

   public LidbDetailTnGroup asLidbDetailTnGroup()
   {
      LidbDetailTnGroup lidbDetailTnGroup = new LidbDetailTnGroup();
      lidbDetailTnGroup.setUseType(LidbUseType.fromUserValue(getServiceType()));
      lidbDetailTnGroup.setVisibility(LidbVisibility.fromUserValue(getPresentation()));
      lidbDetailTnGroup.setSubscriberInformation(getName());
      return lidbDetailTnGroup;
   }

}
