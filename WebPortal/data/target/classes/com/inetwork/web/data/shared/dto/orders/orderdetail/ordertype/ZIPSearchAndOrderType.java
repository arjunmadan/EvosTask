package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class ZIPSearchAndOrderType extends BaseOrderType
{

   public interface Reader extends XmlReader<ZIPSearchAndOrderType>
   {
   }

   public interface Writer extends XmlWriter<ZIPSearchAndOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("Zip")
   private String ZIP;

   @Override
   public String getOrderType()
   {
      return "Zip Code";
   }

   @Override
   public String getSearchFilterValues()
   {
      return "Zip Code = " + ZIP;
   }

   public String getZIP()
   {
      return ZIP;
   }

   public void setZIP(String ZIP)
   {
      this.ZIP = ZIP;
   }
}
