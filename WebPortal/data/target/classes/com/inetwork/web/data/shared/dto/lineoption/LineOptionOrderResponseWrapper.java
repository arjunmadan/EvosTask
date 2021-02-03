package com.inetwork.web.data.shared.dto.lineoption;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.lineoption.order.LineOptionOrderResponse;

public class LineOptionOrderResponseWrapper
{
   public interface Reader extends XmlReader<LineOptionOrderResponseWrapper>
   {
   }

   public interface Writer extends XmlWriter<LineOptionOrderResponseWrapper>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("LineOptionOrderResponse")
   private LineOptionOrderResponse lineOptionOrderResponse;
   @Path("LineOptionName")
   private String lineOptionName;

   public LineOptionOrderResponse getLineOptionOrderResponse()
   {
      return lineOptionOrderResponse;
   }

   public void setLineOptionOrderResponse(LineOptionOrderResponse lineOptionOrderResponse)
   {
      this.lineOptionOrderResponse = lineOptionOrderResponse;
   }

   public String getLineOptionName()
   {
      return lineOptionName;
   }

   public void setLineOptionName(String lineOptionName)
   {
      this.lineOptionName = lineOptionName;
   }
}
