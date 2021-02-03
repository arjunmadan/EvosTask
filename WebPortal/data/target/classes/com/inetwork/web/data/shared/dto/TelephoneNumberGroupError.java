package com.inetwork.web.data.shared.dto;

import java.io.Serializable;
import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class TelephoneNumberGroupError implements TnError, Serializable
{
   public interface Reader extends XmlReader<TelephoneNumberGroupError>, Serializable
   {
   }

   public interface Writer extends XmlWriter<TelephoneNumberGroupError>, Serializable
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumbers/TelephoneNumber")
   private List<String> telephoneNumbers;
   @Path("Code")
   private Integer code;
   @Path("Description")
   private String description;

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }

   @Override
   public Integer getCode()
   {
      return code;
   }

   public void setCode(Integer code)
   {
      this.code = code;
   }

   @Override
   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }
}
