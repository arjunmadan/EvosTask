package com.inetwork.web.data.shared.dto.orders.orderdetail;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class Feature
{

   public interface Reader extends XmlReader<Feature>
   {
   }

   public interface Writer extends XmlWriter<Feature>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("Status")
   private String status;

   public String getStatus()
   {
      return status;
   }

   public void setStatus(String status)
   {
      this.status = status;
   }

   public FeatureStatus getStatusEnum()
   {
      return FeatureStatus.fromValue(getStatus());
   }

   public void setStatusEnum(FeatureStatus status)
   {
      setStatus(status.getHumanReadableValue());
   }

}
