package com.inetwork.web.data.shared.dto.orders.tnoption;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.AbstractIrisResponse;

public class TnOptionOrderResponse extends AbstractIrisResponse<TnOptionOrderPayload>
{
   public interface Reader extends XmlReader<TnOptionOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<TnOptionOrderResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path(TnOptionOrderPayload.ROOT_ELEMENT)
   private TnOptionOrderPayload payload;

   @Override
   public TnOptionOrderPayload getPayload()
   {
      return payload;
   }

   public void setPayload(TnOptionOrderPayload payload)
   {
      this.payload = payload;
   }
}
