package com.inetwork.web.data.shared.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.common.collect.Lists;
import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.utils.CollectionUtils;

public class TelephoneNumberError implements TnError, Serializable
{
   public interface Reader extends XmlReader<TelephoneNumberError>, Serializable
   {
   }

   public interface Writer extends XmlWriter<TelephoneNumberError>, Serializable
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumber")
   private String telephoneNumber;
   @Path("Code")
   private Integer code;
   @Path("Description")
   private String description;

   public String getTelephoneNumber()
   {
      return telephoneNumber;
   }

   public void setTelephoneNumber(String telephoneNumber)
   {
      this.telephoneNumber = telephoneNumber;
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

   @Override
   public List<String> getTelephoneNumbers()
   {
      ArrayList<String> collection = Lists.newArrayList();
      CollectionUtils.addIgnoreNull(collection, telephoneNumber);
      return collection;
   }
}
