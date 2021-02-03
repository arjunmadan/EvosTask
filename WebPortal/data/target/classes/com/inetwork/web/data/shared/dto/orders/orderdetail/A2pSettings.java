package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import java.util.Objects;

public class A2pSettings
{
   @Path("CampaignId")
   private String campaignId;
   @Path("MessageClass")
   private String messageClass;
   @Path("Action")
   private String action;

   public interface Reader extends XmlReader<A2pSettings>
   {
   }

   public interface Writer extends XmlWriter<A2pSettings>
   {
   }

   public static Reader reader = GWT.create(Reader.class);
   public static Writer writer = GWT.create(Writer.class);

   public static Builder builder()
   {
      return new Builder();
   }

   A2pSettings()
   {
   }

   private A2pSettings(Builder builder)
   {
      this.campaignId = builder.campaignId;
      this.messageClass = builder.messageClass;
      this.action = builder.action.getApiValue();
   }

   public String getCampaignId()
   {
      return campaignId;
   }

   public void setCampaignId(String campaignId)
   {
      this.campaignId = campaignId;
   }

   public String getMessageClass()
   {
      return messageClass;
   }

   public void setMessageClass(String messageClass)
   {
      this.messageClass = messageClass;
   }

   public String getAction()
   {
      return action;
   }

   public void setAction(String action)
   {
      this.action = action;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof A2pSettings))
         return false;
      A2pSettings that = (A2pSettings) o;
      return Objects.equals(campaignId, that.campaignId) &&
             Objects.equals(messageClass, that.messageClass) &&
             Objects.equals(action, that.action);
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(campaignId, messageClass, action);
   }

   public static class Builder
   {
      private String campaignId;
      private String messageClass;
      private Action action;

      private Builder()
      {
      }

      public Builder withCampaignId(String campaignId)
      {
         this.campaignId = campaignId;
         return this;
      }

      public Builder withMessageClass(String messageClass)
      {
         this.messageClass = messageClass;
         return this;
      }

      public Builder withAction(Action action)
      {
         this.action = action;
         return this;
      }

      public A2pSettings build()
      {
         return new A2pSettings(this);
      }
   }
}
