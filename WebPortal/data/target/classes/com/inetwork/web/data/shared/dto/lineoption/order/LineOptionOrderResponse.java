package com.inetwork.web.data.shared.dto.lineoption.order;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.AbstractIrisResponse;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class LineOptionOrderResponse extends AbstractIrisResponse<LineOptions>
{
   public interface Reader extends XmlReader<LineOptionOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<LineOptionOrderResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("LineOptions")
   private LineOptions lineOptions;

   public LineOptions getPayload()
   {
      return lineOptions;
   }

   public void setLineOptions(LineOptions lineOptions)
   {
      this.lineOptions = lineOptions;
   }
}
