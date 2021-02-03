package com.inetwork.web.data.shared.dto.orders.externaltns;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.AbstractIrisResponse;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class ExternalTnsOrderResponse extends AbstractIrisResponse<ExternalTnsOrderPayload>
{
   public interface Reader extends XmlReader<ExternalTnsOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<ExternalTnsOrderResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path(ExternalTnsOrderPayload.XML_ROOT_ELEMENT)
   private ExternalTnsOrderPayload payload;

   @Override
   public ExternalTnsOrderPayload getPayload()
   {
      return payload;
   }

   public void setPayload(ExternalTnsOrderPayload payload)
   {
      this.payload = payload;
   }
}
