package com.inetwork.web.data.shared.dto.reprovision;

import java.util.ArrayList;
import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class TnReprovisionDto
{

   public static final String ROOT_ELEMENT = "ReprovisionTns";

   public interface Reader extends XmlReader<TnReprovisionDto>
   {
   }

   public interface Writer extends XmlWriter<TnReprovisionDto>
   {
   }

   public TnReprovisionDto()
   {

   }

   public TnReprovisionDto(String tnToReprovision)
   {
      tnsToReprovision = new ArrayList<>();
      tnsToReprovision.add(tnToReprovision);
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumberList/TelephoneNumber")
   private List<String> tnsToReprovision;

   public List<String> getTnsToReprovision()
   {
      return tnsToReprovision;
   }

   public void setTnsToReprovision(List<String> tnsToReprovision)
   {
      this.tnsToReprovision = tnsToReprovision;
   }
}
