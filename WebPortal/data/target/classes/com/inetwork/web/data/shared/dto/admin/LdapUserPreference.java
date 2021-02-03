package com.inetwork.web.data.shared.dto.admin;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class LdapUserPreference
{

   public static final String ROOT_ELEMENT = "UserPreference";

   public interface Reader extends XmlReader<LdapUserPreference>
   {
   }

   public interface Writer extends XmlWriter<LdapUserPreference>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("PreferenceName")
   private String name;
   @Path("PreferenceValue")
   private String value;

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

}
