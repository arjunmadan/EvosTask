package com.inetwork.web.data.shared.dto.lineoption.order;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import java.util.List;

public class LineOptionOrder
{
   public static final String ROOT_ELEMENT = "LineOptionOrder";

   public interface Reader extends XmlReader<LineOptionOrder>
   {
   }

   public interface Writer extends XmlWriter<LineOptionOrder>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TnLineOptions")
   private List<TnLineOption> tnLineOptions;

   public LineOptionOrder()
   {
   }

   public LineOptionOrder(List<TnLineOption> tnLineOptions)
   {
      this.tnLineOptions = tnLineOptions;
   }

   public List<TnLineOption> getTnLineOptions()
   {
      return tnLineOptions;
   }

   public void setTnLineOptions(List<TnLineOption> tnLineOptions)
   {
      this.tnLineOptions = tnLineOptions;
   }
}
