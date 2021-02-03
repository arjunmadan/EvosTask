package com.inetwork.web.data.shared.dto.orders.orderdetail.ordernotes;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.ResponseStatus;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class NoteResponse
{
   public interface Reader extends XmlReader<NoteResponse>
   {
   }

   public interface Writer extends XmlWriter<NoteResponse>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);
   public static final Reader READER = GWT.create(Reader.class);

   @Path("ResponseStatus")
   private ResponseStatus responseStatus;

   public ResponseStatus getResponseStatus()
   {
      return responseStatus;
   }

   public void setResponseStatus(ResponseStatus responseStatus)
   {
      this.responseStatus = responseStatus;
   }
}
