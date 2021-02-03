package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import java.util.Objects;

public class ThirdPartyMessageRoute
{
   @Path("NNID")
   private String nnid;
   @Path("ESPID")
   private String espid;
   @Path ("LastOrderOutcome")
   private NnidProvisioningStatus lastOrderOutcome;


   public interface Reader extends XmlReader<ThirdPartyMessageRoute>
   {
   }

   public interface Writer extends XmlWriter<ThirdPartyMessageRoute>
   {
   }

   public static Reader reader = GWT.create(Reader.class);
   public static Writer writer = GWT.create(Writer.class);

   public static Builder builder()
   {
      return new Builder();
   }

   ThirdPartyMessageRoute()
   {
   }

   private ThirdPartyMessageRoute(Builder builder)
   {
      this.nnid = builder.nnid;
      this.espid = builder.espid;
      this.lastOrderOutcome = builder.lastOrderOutcome;
   }

   public String getNnid()
   {
      return nnid;
   }

   public void setNnid(String nnid)
   {
      this.nnid = nnid;
   }

   public String getEspid()
   {
      return espid;
   }

   public void setEspid(String espid)
   {
      this.espid = espid;
   }

   public NnidProvisioningStatus getLastOrderOutcome()
   {
      return lastOrderOutcome;
   }

   public void setLastOrderOutcome(NnidProvisioningStatus lastOrderOutcome)
   {
      this.lastOrderOutcome = lastOrderOutcome;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof A2pSettings))
         return false;
      ThirdPartyMessageRoute that = (ThirdPartyMessageRoute) o;
      return Objects.equals(nnid, that.nnid) &&
         Objects.equals(espid, that.espid) &&
         Objects.equals(lastOrderOutcome, that.lastOrderOutcome);
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(nnid, espid, lastOrderOutcome);
   }

   public static class Builder
   {
      private String nnid;
      private String espid;
      private NnidProvisioningStatus lastOrderOutcome;

      private Builder()
      {
      }

      public Builder withNnid(String nnid)
      {
         this.nnid = nnid;
         return this;
      }

      public Builder withEspid(String espid)
      {
         this.espid = espid;
         return this;
      }

      public Builder withLastOrderOutcome(NnidProvisioningStatus lastOrderOutcome)
      {
         this.lastOrderOutcome = lastOrderOutcome;
         return this;
      }

      public ThirdPartyMessageRoute build()
      {
         return new ThirdPartyMessageRoute(this);
      }
   }
}
