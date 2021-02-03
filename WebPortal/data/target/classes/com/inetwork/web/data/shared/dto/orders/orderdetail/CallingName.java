package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class CallingName
{

   public interface Reader extends XmlReader<CallingName>
   {
   }

   public interface Writer extends XmlWriter<CallingName>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);
   public static final Reader READER = GWT.create(Reader.class);

   @Path("Display")
   private boolean display;
   @Path("Enforced")
   private boolean enforced;

   public boolean getDisplay()
   {
      return display;
   }

   public void setDisplay(boolean display)
   {
      this.display = display;
   }

   public boolean getEnforced()
   {
      return enforced;
   }

   public void setEnforced(boolean enforced)
   {
      this.enforced = enforced;
   }
}
