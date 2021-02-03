package com.inetwork.web.data.shared.dto.host;

import java.util.Objects;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class TerminationHost extends Host
{
   public interface Reader extends XmlReader<TerminationHost>
   {
   }

   public interface Writer extends XmlWriter<TerminationHost>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);
   @Path("CustomerTrafficAllowed")
   private String customerTraffic;

   public String getCustomerTraffic()
   {
      return customerTraffic;
   }

   public void setCustomerTraffic(String customerTraffic)
   {
      this.customerTraffic = customerTraffic;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof TerminationHost))
         return false;
      if (!super.equals(o))
         return false;
      TerminationHost that = (TerminationHost) o;
      return Objects.equals(getCustomerTraffic(), that.getCustomerTraffic());
   }

   @Override
   public int hashCode()
      {
      return Objects.hash(super.hashCode(), getCustomerTraffic());
         }

   @Override
   public String toString()
         {
      return "TerminationHost{" +
            "customerTraffic='" + customerTraffic + '\'' +
            "} " + super.toString();
   }
}
