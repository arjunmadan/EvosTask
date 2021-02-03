package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class CitySearchAndOrderType extends BaseOrderType
{

   @Override
   public String getOrderType()
   {
      return "State and City";
   }

   @Override
   public String getSearchFilterValues()
   {
      return "State = " + state + " and City = " + city;
   }

   public interface Reader extends XmlReader<CitySearchAndOrderType>
   {
   }

   public interface Writer extends XmlWriter<CitySearchAndOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("City")
   private String city;
   @Path("State")
   private String state;

   public String getCity()
   {
      return city;
   }

   public void setCity(String city)
   {
      this.city = city;
   }

   public String getState()
   {
      return state;
   }

   public void setState(String state)
   {
      this.state = state;
   }
}
