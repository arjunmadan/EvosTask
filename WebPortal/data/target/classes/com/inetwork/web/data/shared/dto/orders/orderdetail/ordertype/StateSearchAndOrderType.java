package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class StateSearchAndOrderType extends BaseOrderType
{

   public interface Reader extends XmlReader<StateSearchAndOrderType>
   {
   }

   public interface Writer extends XmlWriter<StateSearchAndOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("State")
   private String state;

   @Override
   public String getOrderType()
   {
      return "State";
   }

   @Override
   public String getSearchFilterValues()
   {
      return "State = " + state;
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
