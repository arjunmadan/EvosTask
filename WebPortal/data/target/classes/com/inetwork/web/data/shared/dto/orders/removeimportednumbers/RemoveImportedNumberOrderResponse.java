package com.inetwork.web.data.shared.dto.orders.removeimportednumbers;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.AbstractIrisResponse;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class RemoveImportedNumberOrderResponse extends AbstractIrisResponse<RemoveImportedNumberOrderPayload>
{
   public interface Reader extends XmlReader<RemoveImportedNumberOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<RemoveImportedNumberOrderResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path(RemoveImportedNumberOrderPayload.XML_ROOT_ELEMENT)
   private RemoveImportedNumberOrderPayload payload;

   @Override
   public RemoveImportedNumberOrderPayload getPayload()
   {
      return payload;
   }

   public void setPayload(RemoveImportedNumberOrderPayload payload)
   {
      this.payload = payload;
   }
}
