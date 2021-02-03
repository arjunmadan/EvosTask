package com.inetwork.web.data.shared.dto.orders.dlda;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.AbstractIrisResponse;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class DldaOrderResponse extends AbstractIrisResponse<DldaOrderPayload>
{

   public interface Reader extends XmlReader<DldaOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<DldaOrderResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);
   @Path(DldaOrderPayload.ROOT_ELEMENT)
   private DldaOrderPayload payload;

   public DldaOrderPayload getPayload()
   {
      return payload;
   }

   public void setPayload(DldaOrderPayload payload)
   {
      this.payload = payload;
   }

}
