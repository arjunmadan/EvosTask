package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class TollFreeVanitySearchAndOrderType extends BaseOrderType
{

   public interface Reader extends XmlReader<TollFreeVanitySearchAndOrderType>
   {
   }

   public interface Writer extends XmlWriter<TollFreeVanitySearchAndOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TollFreeVanity")
   private String vanity;

   public String getVanity()
   {
      return vanity;
   }

   public void setVanity(String vanity)
   {
      this.vanity = vanity;
   }

   @Override
   public String getOrderType()
   {
      return "Toll Free Vanity";
   }

   @Override
   public String getSearchFilterValues()
   {
      return "Toll Free Vanity = " + vanity;
   }

}
