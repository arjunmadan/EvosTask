package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class AreaCodeSearchAndOrderType extends BaseOrderType
{

   @Override
   public String getOrderType()
   {
      return "Area code (NPA)";
   }

   @Override
   public String getSearchFilterValues()
   {
      return "Area code (NPA) = " + npa;
   }

   public interface Reader extends XmlReader<AreaCodeSearchAndOrderType>
   {
   }

   public interface Writer extends XmlWriter<AreaCodeSearchAndOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("AreaCode")
   private String npa;

   public String getNpa()
   {
      return npa;
   }

   public void setNpa(String npa)
   {
      this.npa = npa;
   }

}
