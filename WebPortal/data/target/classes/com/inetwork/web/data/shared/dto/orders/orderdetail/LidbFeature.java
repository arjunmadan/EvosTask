package com.inetwork.web.data.shared.dto.orders.orderdetail;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class LidbFeature extends Feature
{
   public interface Reader extends XmlReader<LidbFeature>
   {
   }

   public interface Writer extends XmlWriter<LidbFeature>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("SubscriberInformation")
   private String subscriberInformation;
   @Path("UseType")
   private String useType;
   @Path("Visibility")
   private String visibility;

   public String getSubscriberInformation()
   {
      return subscriberInformation;
   }

   public void setSubscriberInformation(String subscriberInformation)
   {
      this.subscriberInformation = subscriberInformation;
   }

   public String getUseType()
   {
      return useType;
   }

   public void setUseType(String useType)
   {
      this.useType = useType;
   }

   public String getVisibility()
   {
      return visibility;
   }

   public void setVisibility(String visibility)
   {
      this.visibility = visibility;
   }

}
