package com.inetwork.web.data.shared.dto.orders;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import java.util.List;

public class TelephoneNumbers
{

   public static final String ROOT_ELEMENT = "TelephoneNumbers";

   public interface Reader extends XmlReader<TelephoneNumbers>
   {
   }

   public interface Writer extends XmlWriter<TelephoneNumbers>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TotalCount")
   private Integer totalCount;

   @Path("Count")
   private Integer count;

   @Path("TelephoneNumber")
   private List<String> phoneNumbers;

   public TelephoneNumbers()
   {
   }

   public TelephoneNumbers(List<String> phoneNumbers)
   {
      this.phoneNumbers = phoneNumbers;
   }

   public Integer getTotalCount()
   {
      return totalCount;
   }

   public void setTotalCount(Integer totalCount)
   {
      this.totalCount = totalCount;
   }

   public Integer getCount()
   {
      return count;
   }

   public void setCount(Integer count)
   {
      this.count = count;
   }

   public List<String> getPhoneNumbers()
   {
      return phoneNumbers;
   }

   public void setPhoneNumbers(List<String> phoneNumbers)
   {
      this.phoneNumbers = phoneNumbers;
   }
}
