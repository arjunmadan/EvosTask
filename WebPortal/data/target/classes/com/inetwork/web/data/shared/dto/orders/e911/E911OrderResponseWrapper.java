package com.inetwork.web.data.shared.dto.orders.e911;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class E911OrderResponseWrapper
{
   public interface Reader extends XmlReader<E911OrderResponseWrapper>
   {
   }

   public interface Writer extends XmlWriter<E911OrderResponseWrapper>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("E911OrderResponse")
   private E911OrderResponse e911OrderResponse;
   @Path("TelephoneNumbers/TelephoneNumber")
   private List<String> telephoneNumbers;

   public E911OrderResponse getE911OrderResponse()
   {
      return e911OrderResponse;
   }

   public void setE911OrderResponse(E911OrderResponse e911OrderResponse)
   {
      this.e911OrderResponse = e911OrderResponse;
   }

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }
}
