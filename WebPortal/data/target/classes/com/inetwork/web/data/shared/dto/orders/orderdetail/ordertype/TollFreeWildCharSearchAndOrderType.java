package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class TollFreeWildCharSearchAndOrderType extends BaseOrderType
{

   public interface Reader extends XmlReader<TollFreeWildCharSearchAndOrderType>
   {
   }

   public interface Writer extends XmlWriter<TollFreeWildCharSearchAndOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TollFreeWildCardPattern")
   private String tollFreeWildCharPattern;

   public String getTollFreeWildCharPattern()
   {
      return tollFreeWildCharPattern;
   }

   public void setTollFreeWildCharPattern(String tollFreeWildCharPattern)
   {
      this.tollFreeWildCharPattern = tollFreeWildCharPattern;
   }

   @Override
   public String getOrderType()
   {
      return "Toll Free WildChar";
   }

   @Override
   public String getSearchFilterValues()
   {
      return "Toll Free WildChar = " + tollFreeWildCharPattern;
   }

}
