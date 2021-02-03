package com.inetwork.web.data.shared.dto.orders.tnoption;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class TnOptionGroup extends TnOption
{
   public interface Reader extends XmlReader<TnOptionGroup>
   {
   }

   public interface Writer extends XmlWriter<TnOptionGroup>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumbers/TelephoneNumber")
   private List<String> groupNumbers;

   public List<String> getGroupNumbers()
   {
      return groupNumbers;
   }

   public void setGroupNumbers(List<String> groupNumbers)
   {
      this.groupNumbers = groupNumbers;
   }
}
