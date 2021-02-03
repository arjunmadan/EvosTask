package com.inetwork.web.data.shared.dto.orders.e911;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.AbstractIrisResponse;

public class E911OrderResponse extends AbstractIrisResponse<E911OrderPayload>
{
   public interface Reader extends XmlReader<E911OrderResponse>
   {
   }

   public interface Writer extends XmlWriter<E911OrderResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path(E911OrderPayload.ROOT_ELEMENT)
   private E911OrderPayload payload;

   public E911OrderPayload getPayload()
   {
      return payload;
   }

   public void setPayload(E911OrderPayload payload)
   {
      this.payload = payload;
   }
}
