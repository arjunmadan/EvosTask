package com.inetwork.web.data.shared.dto;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.orders.e911.E911AlternateEndUserIdentifier;

public class E911AlternateEndUserIdentifierGroupError implements Error
{
   public interface Reader extends XmlReader<E911AlternateEndUserIdentifierGroupError>
   {
   }

   public interface Writer extends XmlWriter<E911AlternateEndUserIdentifierGroupError>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("AlternateEndUserIdentifiers/AlternateEndUserIdentifier")
   private List<E911AlternateEndUserIdentifier> alternateEndUserIdentifiers;
   @Path("Code")
   private Integer code;
   @Path("Description")
   private String description;

   public List<E911AlternateEndUserIdentifier> getAlternateEndUserIdentifiers()
   {
      return alternateEndUserIdentifiers;
   }

   public void setAlternateEndUserIdentifiers(List<E911AlternateEndUserIdentifier> alternateEndUserIdentifiers)
   {
      this.alternateEndUserIdentifiers = alternateEndUserIdentifiers;
   }

   public Integer getCode()
   {
      return code;
   }

   public void setCode(Integer code)
   {
      this.code = code;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public boolean contains(E911AlternateEndUserIdentifier e911AlternateEndUserIdentifier)
   {
      return alternateEndUserIdentifiers != null && alternateEndUserIdentifiers.contains(e911AlternateEndUserIdentifier);
   }
}
