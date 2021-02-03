package com.inetwork.web.data.shared.dto.admin;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class UserPreference
{

   public static final String ROOT_ELEMENT = "UserPreference";

   public interface Reader extends XmlReader<UserPreference>
   {
   }

   public interface Writer extends XmlWriter<UserPreference>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("Name")
   private String name;
   @Path("Value")
   private String value;
   @Path("Description")
   private String description;

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getValue()
   {
      return value;
   }

   public void setValue(String value)
   {
      this.value = value;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }
}
