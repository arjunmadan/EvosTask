package com.inetwork.web.data.dto;

public class SiteSipPeerDto
{
   private int siteId;
   private int sipPeerId;

   public SiteSipPeerDto()
   {
   }

   public SiteSipPeerDto(int siteId, int sipPeerId)
   {
      this.siteId = siteId;
      this.sipPeerId = sipPeerId;
   }

   public int getSiteId()
   {
      return siteId;
   }

   public void setSiteId(int siteId)
   {
      this.siteId = siteId;
   }

   public int getSipPeerId()
   {
      return sipPeerId;
   }

   public void setSipPeerId(int sipPeerId)
   {
      this.sipPeerId = sipPeerId;
   }

   @Override
   public String toString()
   {
      return "SiteSipPeerDto{" + "siteId=" + siteId + ", sipPeerId=" + sipPeerId + '}';
   }
}
