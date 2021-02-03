package com.inetwork.web.data.shared.dto.orders.lidb;

import java.util.ArrayList;
import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class LidbDetailTnGroup
{

   public interface Reader extends XmlReader<LidbDetailTnGroup>
   {
   }

   public interface Writer extends XmlWriter<LidbDetailTnGroup>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumbers/TelephoneNumber")
   private List<String> numbers = new ArrayList<String>();
   @Path("SubscriberInformation")
   private String subscriberInformation;
   @Path("UseType")
   private LidbUseType useType;
   @Path("Visibility")
   private LidbVisibility visibility;

   public List<String> getNumbers()
   {
      return numbers;
   }

   public void setNumbers(List<String> numbers)
   {
      this.numbers = numbers;
   }

   public String getSubscriberInformation()
   {
      return subscriberInformation;
   }

   public void setSubscriberInformation(String subscriberInformation)
   {
      this.subscriberInformation = subscriberInformation;
   }

   public LidbUseType getUseType()
   {
      return useType;
   }

   public void setUseType(LidbUseType useType)
   {
      this.useType = useType;
   }

   public LidbVisibility getVisibility()
   {
      return visibility;
   }

   public void setVisibility(LidbVisibility visibility)
   {
      this.visibility = visibility;
   }
}
