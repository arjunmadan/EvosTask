package com.inetwork.web.data.shared.dto.orders.importnumber;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.AbstractIrisResponse;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class ImportNumberOrderResponse extends AbstractIrisResponse<ImportNumberOrderPayload>
{
   public interface Reader extends XmlReader<ImportNumberOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<ImportNumberOrderResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path(ImportNumberOrderPayload.XML_ROOT_ELEMENT)
   private ImportNumberOrderPayload payload;

   @Override
   public ImportNumberOrderPayload getPayload()
   {
      return payload;
   }

   public void setPayload(ImportNumberOrderPayload payload)
   {
      this.payload = payload;
   }
}
