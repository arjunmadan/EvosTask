package com.inetwork.web.data.shared.dto;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class AbstractIrisResponse<P> implements IrisMessageResponse<P>
{

   @Override
   public P getPayload()
   {
      return null;
   }

   public interface Reader extends XmlReader<AbstractIrisResponse>
   {
   }

   public interface Writer extends XmlWriter<AbstractIrisResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

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
